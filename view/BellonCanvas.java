package view;

import javax.swing.JPanel;

import model.Circle;
import model.Shapplotter;


import model.Square;
import model.Triangle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class BellonCanvas extends JPanel {

    public static int height = 600;
    public static int width = 600;
    BellonPannel displayPannel;
   
    private ArrayList<Shapplotter> shapes;
    public BellonCanvas(BellonPannel displayPannel) {
        this.displayPannel = displayPannel;
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
        shapes   = new ArrayList<Shapplotter>();

        shapes.add(new Circle(210, 500, 25,0,false));
        shapes.add(new Square(280, 520, 30,0,false));
        shapes.add(new Triangle(330,549, 50,0,false));

    }

    @Override
    public void paintComponent(Graphics gs) {
        super.paintComponent(gs);

        Graphics2D graphics2D = (Graphics2D) gs;
        graphics2D.setFont(new Font("Courier New", Font.BOLD, 16));
        graphics2D.setColor(Color.red);
        graphics2D.drawString("Exit", 68, 529 );
        graphics2D.drawRect(50, 500, 80, 50);
        graphics2D.drawString("press E to Exit", 25, 565 );
        graphics2D.setColor(Color.blue);
        graphics2D.drawString("Reset", 472, 529 );
        graphics2D.drawRect(450, 500, 100, 50);
        graphics2D.drawString("press R to Restart", 420, 565 );

        graphics2D.setColor(Color.white);
        graphics2D.drawString("5", 233, 530 );
        graphics2D.drawString("3", 290, 537 );
        graphics2D.drawString("1", 351, 533 );

        graphics2D.setColor(Color.yellow);
        graphics2D.fillRect(20, 452, 550, 10);
        graphics2D.fillRect(20, 80, 550, 10);
        graphics2D.drawString("score "+BellonPannel.score, 280, 50 );
        graphics2D.drawString(BellonPannel.clicked+" / 11  ("+(BellonPannel.totalValue-1)+")", 400, 50 );
        for(Shapplotter e : shapes){
            e.render(graphics2D);
        }

        ArrayList<Shapplotter> ladderShaper =  displayPannel.getLadderShaper();
// if(BellonPannel.y==100|| BellonPannel.y<=100) {
//     graphics2D.setColor(Color.green);
//     graphics2D.drawString("Task complected", 150, 50 );
// }

if(BellonPannel.totalValue==12) {
    graphics2D.setColor(Color.red);
        graphics2D.drawString("game over", 220, 300 );
}else{
    for(Shapplotter e : ladderShaper){
        e.render(graphics2D);
    }
}
       
    }

    public ArrayList<Shapplotter> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shapplotter> shapes) {
        this.shapes = shapes;
    }

}
