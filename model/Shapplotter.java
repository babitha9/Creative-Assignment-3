package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public interface Shapplotter {
    

    void render(Graphics2D g2d);

    Rectangle getBoundry();

    Shape getShape();

   
}
