package com.company.Screens;
import javax.swing.*;

public class Screen extends JComponent implements Runnable {

    boolean isWork, isTube;

    void start(){
        isWork = true;
        new Thread(this).start();
    }



    public void spawnTube(){

    }

    void stop(){
        isWork = false;
    }

    @Override
    public void run() {
        while (isWork){
            repaint();
            try{
                Thread.sleep(20);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
