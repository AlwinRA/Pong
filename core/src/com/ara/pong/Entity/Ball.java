package com.ara.pong.Entity;

import com.ara.pong.GameScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Ball {
    
    private final float ball_radius = 15f;
    private Vector2 Pos;
    private Circle ball;
    private float speedY = 5;
    private float speedX = 10;
    private GameScreen gameScreen;
    private int score;
    private float Wtime;
    // private Rectangle paddle;

    public Ball(GameScreen gameScreen) {
        Pos = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        ball = new Circle(Pos, ball_radius);
        this.gameScreen = gameScreen;
        // this.paddle = Paddle.gPaddle();
        score = 0;
        Wtime = 0;
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.circle(Pos.x, Pos.y, ball_radius, 64);
    }

    public void renderScore(BitmapFont bitmapFont, SpriteBatch spriteBatch) {
        bitmapFont.draw(spriteBatch, Integer.toString(score), Gdx.graphics.getWidth() / 2 - 40, Gdx.graphics.getHeight() - 50);
    }

    public void update(float delta) {
        if(Wtime > 0) Wtime = Wtime-1;
        if(Wtime == 0) updateBall(delta);
        // tick(delta);
		// Gdx.app.log("Ball",Float.toString(Wtime));
    }

    private void tick(float delta) {

    }

    private void updateBall(float delta) {
        ball.x = Pos.x;
        ball.y = Pos.y;
        if(Intersector.overlaps(ball, Paddle.gPaddle()) || Intersector.overlaps(ball, ComputerPaddle.gPaddle())) {
            speedX *= -1;
        }
        if(Pos.x < 0 || Pos.x > Gdx.graphics.getWidth()) {
            score++;
            resetBall();
        }
        //top and bottom border
        if(Pos.y > Gdx.graphics.getHeight() - 15 - 10 || Pos.y < 0 + 15 + 10) { 
            speedY *= -1;
        }
        Pos.x -= speedX;
        Pos.y -= speedY;

    }

    private void resetBall() {
        Pos = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        Wtime = 50;
    }

    public float gposY() {
        return Pos.y;
    }
    public float gposX() {
        return Pos.x;
    }
}
