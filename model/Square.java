package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Square extends Shape implements Shapplotter {


    int length;
    int Score;

    public Square(int x, int y,int length,int Score ,boolean fill) {
        super(x, y,Score,fill);
        this.length = length;
        this.Score = Score;
       
    }

    @Override
    public void render(Graphics2D g2d) {
        if(isFill())
        g2d.fillRect(getX(), getY(), length, length);
        else
        g2d.drawRect(getX(), getY(), length, length);
    }


    @Override
    public Rectangle getBoundry() {
        return new Rectangle(getX(),getY(),length,length);
    } 
    
    
    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return this;
    } 

}
