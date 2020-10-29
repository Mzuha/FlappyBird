package com.company.Gameplay;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bird extends JComponent{
    int birdY, birdX;
    float fallSpeed, jumpHeight;
    BufferedImage birdImage;
    Boolean isAlive;

    public Bird(int birdY, int birdX, String imagePath) {
        this.birdY = birdY;
        this.birdX = birdX;
        isAlive = true;

        try{
            birdImage = ImageIO.read(new File(imagePath));

        } catch (IIOException ignored){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void drawBird(Graphics g){
        g.drawImage(birdImage, birdX, birdY, null);
    }

    public void fall(){
        Thread fall = new Thread(() -> {
            while (isAlive){
                birdY +=fallSpeed;
                if (fallSpeed<=7){
                    fallSpeed+=0.3;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        fall.start();
    }

    public void moveUp(){
        jumpHeight = 0;
        Thread jump = new Thread(() -> {
            while(jumpHeight<=50) {
                birdY -= 8;
                jumpHeight += 8;
                try {
                    Thread.sleep(8);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        jump.start();
        fallSpeed=0;
    }

    public int getBirdY() {
        return birdY;
    }

    public int getBirdX() {
        return birdX;
    }
}
