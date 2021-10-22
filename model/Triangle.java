package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Triangle extends Shape implements Shapplotter {

    int side;
    int score;

    public Triangle(int x, int y,int side,int score ,boolean fill) {
        super(x, y,score,fill);
        this.side = side;
        this.score = score;
    }

    @Override
    public void render(Graphics2D g2d) {

        int xp[] = new int [3];
        int yp[] = new int [3];

    xp[0] = getX();
    yp[0] = getY();

    xp[1] = getX()+side;
    yp[1] = getY();

    xp[2] = getX()+side/2;
    yp[2] = getY()-side;

    if(isFill())
    g2d.fillPolygon(xp, yp, xp.length);
    else
    g2d.drawPolygon(xp, yp, xp.length);

    }

    @Override
    public Rectangle getBoundry() {
        return new Rectangle(getX(),getY()-30,side,side);
    } 
    
   
    
}
