package model;

import java.awt.Color;

public abstract class Shape {
  private  int x;
  private  int y;
  private boolean fill;
  private int score;
  public static Color drawcolor = Color.white;

  public Shape(int x, int y,int score ,boolean fill){
    this.x = x;
    this.y = y;
    this.fill = fill;
    this.score = score;

  }

  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }

  public boolean isFill() {
      return fill;
  }
  

  public  int getScore(){
    return score;
  }


  public Shape getShape() {
      // TODO Auto-generated method stub
      return this;
  } 
}
