package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OneStep extends JFrame {

   private JPanel contentPane;
   private ImageIcon image;
   final int frame_Height = 900;
   final int frame_Width = 1300;
   private Main main;
   private BackSound Sound;
   
   private int score;
   
   
   private File q1;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   
   
   public void setSound(boolean start){
      Sound = new BackSound("game1");
      Sound.mulist(start);
}

   /**
    * Create the frame.
    */
   public OneStep(Main main_input) {
      
      this.main=main_input;
      main = new Main();
        setTitle("One Step");
   
       
         setBounds(100, 100, frame_Width, frame_Height);
         
         main.setSound(false);
         setSound(true);
         
         image = new ImageIcon("step1.png");
        
         
         contentPane = new JPanel(){ 
               public void paintComponent(Graphics g) {
                   g.drawImage(image.getImage(), 0, 0, null);
                   setOpaque(false);
                   super.paintComponent(g);
                }
             };
             
             this.addWindowListener(new WindowListener()
           {
              
              @Override
              public void windowOpened(WindowEvent e) {
                 // TODO Auto-generated method stub
                 
              }
              
              @Override
              public void windowIconified(WindowEvent e) {
                 // TODO Auto-generated method stub
                 
              }
              
              @Override
              public void windowDeiconified(WindowEvent e) {
                 // TODO Auto-generated method stub
                 
              }
              
              @Override
              public void windowDeactivated(WindowEvent e) {
                 // TODO Auto-generated method stub
                 
              }
              
              @Override
              public void windowClosing(WindowEvent e) 
              {
                 setSound(false);
                 main.setSound(true);
                 main.setVisible(true);
                 dispose();
              }
              
              @Override
              public void windowClosed(WindowEvent e) {
                 // TODO Auto-generated method stub
                 
              }
              
              @Override
              public void windowActivated(WindowEvent e) {
                 // TODO Auto-generated method stub
                 
              }
           });
             contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
             setContentPane(contentPane);
             
             JPanel panel = new JPanel();
             panel.setBackground(Color.WHITE);
             GroupLayout gl_contentPane = new GroupLayout(contentPane);
             gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_contentPane.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(panel, GroupLayout.PREFERRED_SIZE, 972, GroupLayout.PREFERRED_SIZE)
                      .addContainerGap(286, Short.MAX_VALUE))
             );
             gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_contentPane.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(panel, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                      .addContainerGap(623, Short.MAX_VALUE))
             );
             
             
             
             JTextArea txtrIfYou = new JTextArea();
             txtrIfYou.setText("1. If you want Encapsulation in your code, you must follow three step.\r\none step, mark all instance variables ______ so they are well ______.\r\ntwo step, mark getters and setters ______so they can be accessed by anyone.\r\nthree step, add _________to ________.");
             
             textField = new JTextField();
             textField.setColumns(10);
             
             textField_1 = new JTextField();
             textField_1.setColumns(10);
             
             JLabel label = new JLabel("1:");
             
             JLabel label_1 = new JLabel("2:");
             
             JLabel label_2 = new JLabel("3:");
             
             textField_2 = new JTextField();
             textField_2.setColumns(10);
             
             JLabel label_3 = new JLabel("4:");
             
             textField_3 = new JTextField();
             textField_3.setColumns(10);
             
             JLabel label_4 = new JLabel("5:");
             
             textField_4 = new JTextField();
             textField_4.setColumns(10);
             
             JButton btnNewButton = new JButton("A");
             btnNewButton.setForeground(Color.BLACK);
             btnNewButton.setForeground(Color.pink);
             
           btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            {            
               
               if(textField.equals("private")) {
                  
                  score = score + 1;
                  
               }
               
               if(textField_1.equals("hidden")) {
                  
                  score = score + 1;
                  
               }
               
               if(textField_2.equals("public")) {
                  
                  score = score + 1;
                  
               }
               
               if(textField_3.equals("guardians")) {
                  
                  score = score + 1;
                  
               }
               
               if(textField_4.equals("setters")) {
                  
                  score = score + 1;
                  
               }
               
            }
         });
             
             
             
             GroupLayout gl_panel = new GroupLayout(panel);
             gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_panel.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(label)
                      .addPreferredGap(ComponentPlacement.RELATED)
                      .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
                         .addComponent(txtrIfYou, Alignment.LEADING)
                         .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
                            .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(label_1)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(label_2)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(label_3)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.UNRELATED)
                            .addComponent(label_4)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                      .addPreferredGap(ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                      .addComponent(btnNewButton)
                      .addGap(40))
             );
             gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_panel.createSequentialGroup()
                      .addGap(24)
                      .addComponent(txtrIfYou, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                      .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                         .addComponent(label)
                         .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                         .addComponent(label_1)
                         .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                         .addComponent(label_2)
                         .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                         .addComponent(label_3)
                         .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                         .addComponent(label_4)
                         .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                      .addGap(39))
                   .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                      .addGap(53)
                      .addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                      .addGap(49))
             );
             panel.setLayout(gl_panel);
             contentPane.setLayout(gl_contentPane);
   }
}