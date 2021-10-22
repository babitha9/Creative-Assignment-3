package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
public class StartPannel {
    JFrame window;
    public  StartPannel( JFrame window){
    this.window = window;
    }

    public void init(){
        Container container = window.getContentPane();

        JPanel pannel = new JPanel();
        pannel.setPreferredSize(new Dimension(600,500));
        pannel.setLayout(new GridLayout(2,1));
        pannel.setBackground(Color.WHITE);
        JTextField textField = new JTextField("Select shape to score");

        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        pannel.add(textField);;


        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(3,1));
        bottom.setPreferredSize(new Dimension(100, 250));


        JPanel buttonly = new JPanel();
        bottom.setLayout(new GridLayout(1,3));

        JPanel buttonly1 = new JPanel();

        JButton play =  new JButton("Play");

        play.setBackground(Color.ORANGE);
        play.setForeground(Color.white);

        buttonly.add(buttonly1, BorderLayout.CENTER);
        buttonly.add(play, BorderLayout.CENTER);

        bottom.add(buttonly, BorderLayout.CENTER);

        pannel.add(bottom, BorderLayout.CENTER);
        container.add(pannel,BorderLayout.CENTER);

        addLisitner(play);
    }

    private void addLisitner(JButton play){
        play.addActionListener((e)->{
            window.getContentPane().removeAll();
             BellonPannel calculatorWindow = new BellonPannel(window); 
             calculatorWindow.init();
             window.pack();
             window.revalidate();
        });
    }
    
}
