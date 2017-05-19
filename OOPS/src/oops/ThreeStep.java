package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ThreeStep extends JFrame {

   private JPanel contentPane;
   private ImageIcon image;
   final int frame_Height = 900;
   final int frame_Width = 1300;

   /**
    * Launch the application.
    */
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
   }

   /**
    * Create the frame.
    */
   public ThreeStep() {
      
      setTitle("Three Step");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, frame_Width, frame_Height);
      
      image = new ImageIcon("step3.png");
      
      contentPane = new JPanel(){ 
            public void paintComponent(Graphics g) {
                g.drawImage(image.getImage(), 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
             }
          };
          
          contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
          setContentPane(contentPane);
   }

