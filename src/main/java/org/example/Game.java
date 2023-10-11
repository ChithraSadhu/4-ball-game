package org.example;

import processing.core.PApplet;

public class Game extends PApplet{

    private final int HEIGHT = 500;
    public final int WIDTH = 1000;
    public final int DIAMETER = 20;
    private int[] ballposX = {0,0,0,0};

    public static void main(String[] args){
        PApplet.main("org.example.Game");
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);

    }

    @Override
    public void draw() {
        ellipse(ballposX[0], (float) (HEIGHT) /5,DIAMETER,DIAMETER);
        ellipse(ballposX[1], (float) (HEIGHT * 2) /5,DIAMETER,DIAMETER);
        ellipse(ballposX[2], (float) (HEIGHT * 3) /5,DIAMETER,DIAMETER);
        ellipse(ballposX[3], (float) (HEIGHT * 4) /5,DIAMETER,DIAMETER);
        ballposX[0]+=1;
        ballposX[1]+=2;
        ballposX[2]+=3;
        ballposX[3]+=4;

    }
}
