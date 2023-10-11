package org.example.OOP;



import processing.core.PApplet;

public class Game extends PApplet {

    public static void main(String[] args) {
        PApplet.main("org.example.OOP.Game");
    }

    private Ball[] balls;

    public void settings() {
        super.settings();
        size(GameConfig.WIDTH, GameConfig.HEIGHT);
        balls = new Ball[GameConfig.NUM_BALLS];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball(i);
        }
    }

    public void draw() {

        for (Ball ball : balls) {
            ball.display(this);
            ball.move();
        }
    }
}

