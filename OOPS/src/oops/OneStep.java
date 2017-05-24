package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OneStep extends JFrame {

	private JPanel contentPane;
	private ImageIcon image;
	final int frame_Height = 900;
	final int frame_Width = 1300;
private Main main;

	

	/**
	 * Create the frame.
	 */
	public OneStep(Main main_input) {
		
		this.main=main_input;
		  setTitle("One Step");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(100, 100, frame_Width, frame_Height);
	      
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
	}

}
