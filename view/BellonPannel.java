package view;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import controller.ClickEventsLisitner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import model.Triangle;
import model.Shapplotter;
import java.util.ArrayList;
import javax.swing.Timer;
import java.util.concurrent.ThreadLocalRandom;
import model.Circle;
import model.Square;
public class BellonPannel {
  private JFrame window;
  private BellonCanvas shapCanvas;
  private ArrayList<Shapplotter> ladderShaper = new ArrayList<Shapplotter>();
  public static int score= 0;
  public static int clicked= 0;
public static int totalValue = 0;
private Timer timer;

 public BellonPannel(JFrame window) {
    this.window = window;
    window.setTitle("Select polygon");
  

    
  }

  public void init() {
    Container container = window.getContentPane();
    shapCanvas = new BellonCanvas(this);
    container.add(shapCanvas, BorderLayout.CENTER);  
    ClickEventsLisitner listner =  new ClickEventsLisitner(this) ;
    shapCanvas.addMouseListener(listner);
    shapCanvas.addKeyListener(listner);
    shapCanvas.requestFocusInWindow();
    shapCanvas.setFocusable(true);
    ladderShaper.add(new Triangle(100, 250, 50,0,true));

    ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {

        if(totalValue >11){
          //timer.stop();
          return;
        }
          //...Perform a task...
          int x= ThreadLocalRandom.current().nextInt(30, 500);
          int y= ThreadLocalRandom.current().nextInt(120, 400);
          int r= ThreadLocalRandom.current().nextInt(0, 3);

          switch(r){
            case 0:
            ladderShaper.set(0,new Circle(x, y, 25,5,true));
            break;
            case 1:
            ladderShaper.set(0,new Square(x, y, 30,3,true));
            break;
            case 2:
            ladderShaper.set(0,new Triangle(x, y, 50,1,true));
            break;

          }
          System.out.println(r);
          shapCanvas.repaint();
          totalValue++;
         
      }
  };
   timer= new Timer(1000 ,taskPerformer);
  timer.setRepeats(true);
  timer.start();

    shapCanvas.repaint();

  }


  public JFrame getWindow() {
    return this.window;
  }

  public BellonCanvas getCanvas() {
    return this.shapCanvas;
  }

  public void setLadderShaper(ArrayList<Shapplotter> ladderShaper) {
      this.ladderShaper = ladderShaper;
  }
  public ArrayList<Shapplotter> getLadderShaper() {
      return ladderShaper;
  }

}
