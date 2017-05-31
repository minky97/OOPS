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
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class ThreeStep extends JFrame {

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
   private JTextField textField1;
   
   
   public void setSound(boolean start){
      Sound = new BackSound("game3");
      Sound.mulist(start);
}


   /**
    * Launch the application.
    
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ThreeStep frame = new ThreeStep();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }*/

   /**
    * Create the frame.
    */
   public ThreeStep(Main main_input) {
      
	  this.main=main_input;
	  main = new Main();
      setTitle("Three Step");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, frame_Width, frame_Height);
      
      main.setSound(false);
      setSound(true);
      
      image = new ImageIcon("step3.png");
      
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
          
          JPanel question1Panel = new JPanel();
          question1Panel.setToolTipText("*Check the wrong part's number and write correct answer.");
          question1Panel.setBorder(new TitledBorder(null, "question", TitledBorder.LEADING, TitledBorder.TOP, null, null));
          question1Panel.setBackground(Color.WHITE);
          GroupLayout gl_contentPane = new GroupLayout(contentPane);
          gl_contentPane.setHorizontalGroup(
          	gl_contentPane.createParallelGroup(Alignment.LEADING)
          		.addGroup(gl_contentPane.createSequentialGroup()
          			.addGap(62)
          			.addComponent(question1Panel, GroupLayout.PREFERRED_SIZE, 771, GroupLayout.PREFERRED_SIZE)
          			.addContainerGap(439, Short.MAX_VALUE))
          );
          gl_contentPane.setVerticalGroup(
          	gl_contentPane.createParallelGroup(Alignment.LEADING)
          		.addGroup(gl_contentPane.createSequentialGroup()
          			.addGap(33)
          			.addComponent(question1Panel, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
          			.addContainerGap(424, Short.MAX_VALUE))
          );
          
          JTextArea textArea = new JTextArea();
          textArea.setText("1.public (1) class practice { \r\n \tpublic static void main(String(2)[] args) { \r\n\t\t(3)int num;\r\n \t\tnum = 7; \r\n\t\tSystem.out.println(\"My Number: \" (4)num);\r\n\t}\r\n }");
          
          JButton btnEnter1 = new JButton("A");
          btnEnter1.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          	}
          });
          
          textField1 = new JTextField();
          textField1.setColumns(10);
          
          JRadioButton radioButton1 = new JRadioButton("(1)");
          
          JRadioButton radioButton2 = new JRadioButton("(2)");
          
          JRadioButton radioButton3 = new JRadioButton("(3)");
          
          JRadioButton radioButton4 = new JRadioButton("(4)");
          GroupLayout gl_question1Panel = new GroupLayout(question1Panel);
          gl_question1Panel.setHorizontalGroup(
          	gl_question1Panel.createParallelGroup(Alignment.TRAILING)
          		.addGroup(gl_question1Panel.createSequentialGroup()
          			.addGap(24)
          			.addGroup(gl_question1Panel.createParallelGroup(Alignment.TRAILING)
          				.addGroup(gl_question1Panel.createSequentialGroup()
          					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE)
          					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
          				.addGroup(gl_question1Panel.createSequentialGroup()
          					.addComponent(radioButton1)
          					.addPreferredGap(ComponentPlacement.UNRELATED)
          					.addComponent(radioButton2)
          					.addPreferredGap(ComponentPlacement.UNRELATED)
          					.addComponent(radioButton3)
          					.addPreferredGap(ComponentPlacement.UNRELATED)
          					.addComponent(radioButton4)
          					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
          					.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
          					.addGap(44)))
          			.addComponent(btnEnter1)
          			.addGap(45))
          );
          gl_question1Panel.setVerticalGroup(
          	gl_question1Panel.createParallelGroup(Alignment.LEADING)
          		.addGroup(gl_question1Panel.createSequentialGroup()
          			.addGroup(gl_question1Panel.createParallelGroup(Alignment.LEADING, false)
          				.addGroup(gl_question1Panel.createSequentialGroup()
          					.addGap(58)
          					.addComponent(btnEnter1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
          				.addGroup(gl_question1Panel.createSequentialGroup()
          					.addContainerGap()
          					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
          					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          					.addGroup(gl_question1Panel.createParallelGroup(Alignment.BASELINE)
          						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
          						.addComponent(radioButton1)
          						.addComponent(radioButton2)
          						.addComponent(radioButton3)
          						.addComponent(radioButton4))))
          			.addContainerGap(68, Short.MAX_VALUE))
          );
          
          
          question1Panel.setLayout(gl_question1Panel);
          contentPane.setLayout(gl_contentPane);
          
   }
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}