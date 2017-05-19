package oops;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class User extends JPanel{
   
   @Override
   protected void paintComponent(Graphics g) {
      
      Image image = new ImageIcon("life.jpg").getImage();
      g.drawImage(image, 60, 300, this); 
      
   }
   
   public void life() {
      
      
   }
   
   public void money() {
      
      
   }
   
   public void userId() {

      
   }

}