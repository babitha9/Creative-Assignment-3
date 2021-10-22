package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;

 
public class Circle extends Shape implements Shapplotter {
    
int radius;
int score;
public Circle(int x, int y,int radius, int score ,boolean fill){
super(x, y,score,fill);
this.radius =radius;
this.score =score;
}


    @Override
    public void render(Graphics2D g2) {
        if(isFill()){
            g2.fillOval(getX(), getY(), radius*2, radius*2);
        }
        else{
            g2.drawOval(getX(), getY(), radius*2, radius*2);

        }
    }


    @Override
    public Rectangle getBoundry() {
        return new Rectangle(getX(),getY(),radius*2,radius*2);
    }


    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return this;
    } 

}
