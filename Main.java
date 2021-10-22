import javax.swing.JFrame;
import view.StartPannel;

public class Main{
    public static void main(String args[]) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(415, 40);
        window.setTitle("Bellon Game");
        
        StartPannel laadderPannel = new StartPannel(window);
        laadderPannel.init();
        window.pack();
        window.setVisible(true);
        System.out.println("started");
   }
}