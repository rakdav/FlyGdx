package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game {
	public MainGameScreen gameScreen;
	public GameOverScreen gameOverScreen;
	public MenuScreen menuScreen;
	@Override
	public void create () {
		menuScreen=new MenuScreen(this);
		gameScreen=new MainGameScreen(this);
		gameOverScreen=new GameOverScreen(this);
		setScreen(menuScreen);
	}
}
