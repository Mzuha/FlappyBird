package com.company.Buttons;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyButton {
    private int left, top, width, height;
    private BufferedImage buttonImage;
    public MyButton(int left, int top, String imagePath){
        this.left = left;
        this.top = top;
        try {
            BufferedImage imageBg = ImageIO.read(new File(imagePath));
            buttonImage = ImageIO.read(new File(imagePath));
            width = imageBg.getWidth();
            height = imageBg.getHeight();
        } catch (IOException ignored){
        }
    }


    public void drawButton(Graphics g){
        g.drawImage(buttonImage, left, top, null);
    }

    public boolean mouseOnButton(int x, int y) {
        if (x>=left && x<=left+width && y>= top && y<= top+height) {
            return true;
        } else {
            return false;
        }
    }

}
