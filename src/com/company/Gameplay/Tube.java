package com.company.Gameplay;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Tube extends JComponent {
    BufferedImage tubeUp, tubeDown;
    int tubeY;
    public int tubeX = 1280;
    public Tube() {
        try {
            tubeDown = ImageIO.read(new File("src/com/company/res/TubeDown.png"));
            tubeUp = ImageIO.read(new File("src/com/company/res/TubeUp.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        tubeY = new Random().nextInt(400+1) + 50;
    }

    public void drawTube(Graphics g){
        g.drawImage(tubeUp, tubeX, tubeY-tubeUp.getHeight(), null);
        g.drawImage(tubeDown, tubeX, tubeY+150, null);
        moveTube();
    }

    public void moveTube(){
        tubeX-=5;
    }
}
