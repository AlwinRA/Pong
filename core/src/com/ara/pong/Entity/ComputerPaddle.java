package com.ara.pong.Entity;

import com.ara.pong.GameScreen;
import com.ara.pong.Helper.Processor;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class ComputerPaddle {
    
    private final float rectangle_width;
    private final float rectangle_height;
    private Vector2 Pos;

    private static Rectangle zpaddle;
    private float speedY = 10f;
    private GameScreen gameScreen;

    public ComputerPaddle(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        rectangle_height = 86f;
        rectangle_width = 24f;
        Pos = new Vector2(Gdx.graphics.getWidth() - 10, Gdx.graphics.getHeight() / 2);
        zpaddle = new Rectangle(Pos.x, Pos.y, rectangle_width, rectangle_height);
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(zpaddle.x, zpaddle.y, rectangle_width, rectangle_height);
    }

    public void update(float delta) {
        tick(delta);
        updatePaddle();
    }

    private void tick(float delta) {
    }

    private void updatePaddle() {
        Pos.y = gameScreen.gBall().gposY();
        zpaddle.x = Pos.x;
        zpaddle.y = Pos.y;
    }

    public static Rectangle gPaddle() {
        return zpaddle;
    }
}
