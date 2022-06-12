package com.ara.pong.Entity;

import com.ara.pong.Helper.Processor;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Paddle {
    
    private final float rectangle_width;
    private final float rectangle_height;
    private Vector2 Pos;
    private Processor processor;

    private static Rectangle zpaddle;
    private float speedY = 10f;

    public Paddle() {
        processor = new Processor();
        Gdx.input.setInputProcessor(processor);
        rectangle_height = 86f;
        rectangle_width = 24f;
        Pos = new Vector2(10, Gdx.graphics.getHeight() / 2);
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
        if(processor.mNorth) {
            Pos.y += speedY;
        }else if(processor.mSouth) {
            Pos.y -= speedY;
        }
    }

    private void updatePaddle() {
        if(Pos.y >= Gdx.graphics.getHeight() - rectangle_height - 10) Pos.y = Gdx.graphics.getHeight() - rectangle_height - 10;
        if(Pos.y <= 0 + 10) Pos.y = 0 + 10;
        zpaddle.x = Pos.x;
        zpaddle.y = Pos.y;
    }

    public static Rectangle gPaddle() {
        return zpaddle;
    }
}
