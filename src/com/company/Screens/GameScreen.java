package com.company.Screens;

import com.company.Gameplay.Bird;
import com.company.Gameplay.Tube;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GameScreen extends Screen implements MouseListener {
    Bird bird;
    ArrayList<Tube> tubes = new ArrayList<>();
    int i;
    public GameScreen(){
        bird = new Bird(300, 50, "src/com/company/res/Bird.png");
        bird.fall();
        addMouseListener(this);
        start();
        spawnTube();
    }

    public void paint(Graphics g){
        i++;
        bird.drawBird(g);
        if(i%75==0){
            tubes.add(new Tube());
        }
        for(Tube j: tubes){
            j.drawTube(g);
        }
        System.out.println(tubes.size());
        System.out.println(tubes.size());
        checkDeath();
        checkTube();
    }

    public void checkDeath(){
        if(bird.getBirdY()+bird.getHeight()>=632){
            stop();
        }
        
    }

    public void checkTube(){
        for (Tube k: tubes){

            if(k.tubeX+k.getWidth()<=300){

            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        bird.moveUp();
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
