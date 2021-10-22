package controller;



import view.BellonPannel;
import view.StartPannel;


import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class ClickEventsLisitner implements MouseListener ,KeyListener{

    BellonPannel lp;
    private int  selected = KeyEvent.VK_UP;
public ClickEventsLisitner(BellonPannel lp){
this.lp = lp;
}


@Override
public void mousePressed(java.awt.event.MouseEvent e) {
    System.out.println("x="+e.getX()+"y="+e.getY());
   boolean clicked = lp.getLadderShaper().get(0).getBoundry().contains(e.getX(), e.getY());
   if(clicked){
       BellonPannel.clicked++;
       System.out.println("score ="+lp.getLadderShaper().get(0).getShape().getScore());
       BellonPannel.score += lp.getLadderShaper().get(0).getShape().getScore();
   }
     lp.getCanvas().repaint();
}

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) { }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) { }
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) { }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) { }



    @Override
    public void keyPressed(KeyEvent e) {
       
        selected  = e.getKeyCode();



switch(selected){

    case KeyEvent.VK_E:
    JFrame window = lp.getWindow();
                window.getContentPane().removeAll();
                StartPannel mainMunu = new StartPannel(window);
                mainMunu.init();
                window.pack();
                window.revalidate();
    break;

    case KeyEvent.VK_R:

    BellonPannel.score =0;
    BellonPannel.clicked=0;
    BellonPannel.totalValue=0;
    break;

   
  
}

lp.getCanvas().repaint();
        }


    @Override
    public void keyReleased(KeyEvent e) {
        }
    

    @Override
    public void keyTyped(KeyEvent e) {
         }
    
}
