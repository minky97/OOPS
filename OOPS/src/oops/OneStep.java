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
import javax.swing.JOptionPane;

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
                 JOptionPane.showConfirmDialog(null, "Do you really want to close the window? If you close the window, you need to solve the problem again from the beginning.",null, JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
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
             
             JPanel panel_1 = new JPanel();
             panel_1.setBackground(Color.WHITE);
             GroupLayout gl_contentPane = new GroupLayout(contentPane);
             gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_contentPane.createSequentialGroup()
                      .addContainerGap()
                      .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                         .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(panel, GroupLayout.PREFERRED_SIZE, 1146, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(112, Short.MAX_VALUE))
                         .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(panel_1, 0, 0, Short.MAX_VALUE)
                            .addGap(112))))
             );
             gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_contentPane.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(panel, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                      .addGap(18)
                      .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                      .addContainerGap(421, Short.MAX_VALUE))
             );
             
             JTextArea txtrIfYou_1 = new JTextArea();
             txtrIfYou_1.setText("2. If you want Overloading, you must always change parameter list. (o/x)");
             
             JRadioButton rdbtnNewRadioButton = new JRadioButton("O");
             rdbtnNewRadioButton.setBackground(Color.WHITE);
             
             JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("X");
             rdbtnNewRadioButton_1.setBackground(Color.WHITE);
             
             JButton button = new JButton("A");
             button.setBackground(Color.CYAN);
             button.setForeground(Color.PINK);
             GroupLayout gl_panel_1 = new GroupLayout(panel_1);
             gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_panel_1.createSequentialGroup()
                      .addGap(37)
                      .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                         .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(rdbtnNewRadioButton)
                            .addGap(59)
                            .addComponent(rdbtnNewRadioButton_1))
                         .addComponent(txtrIfYou_1, GroupLayout.PREFERRED_SIZE, 816, GroupLayout.PREFERRED_SIZE))
                      .addGap(116)
                      .addComponent(button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                      .addContainerGap(827, Short.MAX_VALUE))
             );
             gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.TRAILING)
                   .addGroup(gl_panel_1.createSequentialGroup()
                      .addContainerGap(26, Short.MAX_VALUE)
                      .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                         .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(txtrIfYou_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                            .addGap(34)
                            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                               .addComponent(rdbtnNewRadioButton)
                               .addComponent(rdbtnNewRadioButton_1))
                            .addGap(34))
                         .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                            .addComponent(button, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                            .addGap(31))))
             );
             panel_1.setLayout(gl_panel_1);
             
             
             
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
             btnNewButton.setBackground(Color.CYAN);
             btnNewButton.setForeground(Color.BLACK);
             btnNewButton.setForeground(Color.pink);
             
             panel_1.setVisible(false);
             
           btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0)
            {            
               
               if(textField.getText().equals("private")) {
                  score = score + 1;
               }
               
               if(textField_1.getText().equals("hidden")) {
                  score = score + 1;
               }
               
               if(textField_2.getText().equals("public")) {
                  score = score + 1;
               }
               
               if(textField_3.getText().equals("guardians")) {
                  score = score + 1;
               }
               
               if(textField_4.getText().equals("setters")) {
                  score = score + 1;
               }
               
               JOptionPane.showMessageDialog(null, "Your Score is" +score);
                 
               panel_1.setVisible(true);
               panel.setVisible(false);
                  
               
               
            }
         });
             
             
             
             GroupLayout gl_panel = new GroupLayout(panel);
             gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                   .addGroup(gl_panel.createSequentialGroup()
                      .addContainerGap()
                      .addComponent(label)
                      .addPreferredGap(ComponentPlacement.RELATED)
                      .addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                         .addComponent(txtrIfYou, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                         .addGroup(gl_panel.createSequentialGroup()
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
                      .addPreferredGap(ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                      .addComponent(btnNewButton)
                      .addGap(136))
             );
             gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
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
                   .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
                      .addGap(51)
                      .addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                      .addGap(51))
             );
             panel.setLayout(gl_panel);
             contentPane.setLayout(gl_contentPane);
   }
}