package com.ara.pong.Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Paddle {
    
    private final float rectangle_width;
    private final float rectangle_height;
    private Vector2 Pos;

    private Rectangle paddle;

    public Paddle() {
        rectangle_height = 86f;
        rectangle_width = 24f;
        Pos = new Vector2(10, Gdx.graphics.getHeight() / 2);
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(Pos.x, Pos.y, rectangle_width, rectangle_height);
    }
}
