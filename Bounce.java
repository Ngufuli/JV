import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

import javax.swing.JFrame;

import java.swing.*;

/***
shows and animated bouncing ball
*/
public class Bounce{
    public static void main(String[] args){
        JFrame frame = new BounceFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}

/** 
The farame with canvas and buttons.
 */ 
class BounceFrame extends JFrame{
/**
    Constructs the frame with the canvas for showing the bouncing ball and Start and Close buttons
 */
public BounceFrame(){
    setSize(WIDTH, HEIGHT);
    setTitle("Bounce");

    Container contentPane = getContentPane();
    canvas = new BallCanvas(); //class user build
    contentPane.add(canvas, BorderLayout.CENTER);
    JPanel buttonPanel = new JPanel();
    addButton(buttonPanel, "Start",
        new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                addBall();
            }
        });

        addButton(buttonPanel, "Close",
        new ActioListener(){
            public void actionPerformed(ActionEvent evt){
                System.exit(0);
            }
        });
        contentPane.add(buttonPane, BorderLayout.SOUTH);
}
/**58 */
}