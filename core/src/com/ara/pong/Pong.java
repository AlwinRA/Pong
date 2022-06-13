package com.ara.pong;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Pong extends Game {
	
	@Override
	public void create () {
		this.setScreen(new GameScreen());
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		// Gdx.app.log("Pong", "Dispose");
		this.getScreen().dispose();
	}
}
