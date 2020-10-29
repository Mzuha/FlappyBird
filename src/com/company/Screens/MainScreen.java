package com.company.Screens;

import com.company.Buttons.MyButton;
import com.company.Main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class MainScreen extends Screen implements MouseListener {

    MyButton startButton, HighScoreButton;
    BufferedImage BG;


    public MainScreen(){
        startButton = new MyButton(200, 100, "src/com/company/res/Button.png");
        addMouseListener(this);
        start();
    }

    public void paint(Graphics g){
        startButton.drawButton(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(startButton.mouseOnButton(e.getX(), e.getY())){
            stop();
            Main.changeScreens(new GameScreen());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
