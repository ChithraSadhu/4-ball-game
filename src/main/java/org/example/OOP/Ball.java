package org.example.OOP;


import processing.core.PApplet;

import processing.core.PApplet;

public class Ball {
    private int x;
    private final int diameter;
    private int speed;

    public Ball(int index) {
        this.x = 0;
        this.diameter = GameConfig.DIAMETER;
        this.speed = index + 1;
    }

    public void display(PApplet parent) {
        parent.ellipse(x, parent.height * (2 * speed - 1) / (2 * GameConfig.NUM_BALLS), diameter, diameter);
    }

    public void move() {
        x += speed;
    }
}


