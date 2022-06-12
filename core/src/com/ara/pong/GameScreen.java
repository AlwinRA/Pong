package com.ara.pong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen extends ScreenAdapter {

	@Override
	public void show () {
	}

    @Override
	public void render (float delta) {
    	ScreenUtils.clear(0, 0, 0.2f, 1);
		// Gdx.app.log("GameScreen", "Render");
	}

	@Override
	public void dispose () {
        Gdx.app.log("GameScreen", "Dispose");
	}

}
