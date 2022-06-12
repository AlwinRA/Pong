package com.ara.pong.Entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

public class Ball {
    
    private final float ball_radius = 15f;
    private Vector2 Pos;
    private Circle ball;
    private float speedY = 120;
    private float speedX = 150;

    public Ball() {
        Pos = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        ball = new Circle(Pos, ball_radius);
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.circle(Pos.x, Pos.y, ball_radius, 64);
    }

    public void update(float delta) {
        updateBall();
        tick(delta);
    }

    private void tick(float delta) {
        Pos.x += speedX * delta;
        Pos.y += speedY * delta;
    }

    private void updateBall() {
        ball.x = Pos.x;
        ball.y = Pos.y;
        if(Pos.x >= Gdx.graphics.getWidth() || Pos.x <= 0) {
            speedX *= -1;
        }
        //top and bottom border
        if(Pos.y > Gdx.graphics.getHeight() - 15 - 10 || Pos.y < 0 + 15 + 10) { 
            speedY *= -1;
        }
    }
}
