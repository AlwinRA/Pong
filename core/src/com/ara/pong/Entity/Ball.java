package com.ara.pong.Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

public class Ball {
    
    private final float ball_radius = 25f;
    private Vector2 Pos;
    private Circle ball;

    public Ball() {
        Pos = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        ball = new Circle(Pos, ball_radius);
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.circle(Pos.x, Pos.y, ball_radius);
    }

    public void update(float delta) {

    }
}
