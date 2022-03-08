/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventdrivenprgm.AWT;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ELCOT
 */
public class image extends JFrame {
    
    private ImageIcon image1;
    private JLabel label1;
    
    image()
    {
        setLayout(new FlowLayout());
        
        image1=new ImageIcon(getClass().getResource("lionking.jpg"));
        label1=new JLabel(image1);
        add(label1);            
    }
    
    public static void main(String[] args)
    {
        image f=new image();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
        f.setTitle("IMAGE PROGRAM");
    }
}
