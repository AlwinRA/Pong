package com.ara.pong.Helper;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class Processor implements InputProcessor {

    public boolean mNorth;
    public boolean mSouth;


    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.W) {
            mNorth = true;
        }
        if (keycode == Input.Keys.S) {
            mSouth = true;
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.W) {
            mNorth = false;
        }
        if (keycode == Input.Keys.S) {
            mSouth = false;
        }

        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}