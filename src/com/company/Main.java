package com.company;

import com.company.Screens.MainScreen;
import com.company.Screens.Screen;

import javax.swing.*;

public class Main {
    private static JFrame window;
    public static void main(String[] args) {
        window = new JFrame("FlappyBird");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1280, 720);
        window.setResizable(false);
        window.getContentPane().add(new MainScreen());
        window.setVisible(true);
    }
    public static void changeScreens(Screen screen){
        window.getContentPane().removeAll();
        window.invalidate();
        window.getContentPane().add(screen);
        window.revalidate();
    }

}
