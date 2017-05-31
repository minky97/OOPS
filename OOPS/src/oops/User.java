package oops;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class User extends JPanel{
   
//	private Life ulife;
	private ArrayList<User> user = new ArrayList<User>();
    private int lf;
//   @Override
//   protected void paintComponent(Graphics g) {
//      
//      Image image = new ImageIcon("life.jpg").getImage();
//      g.drawImage(image, 60, 300, this); 
//      
//   }
   
   public void userlist(User u)
   {
	  user.add(u); 
   }

}