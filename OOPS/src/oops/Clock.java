package oops;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.Timer;

import oops.step.OneStep;
import oops.step.Step;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Clock extends JPanel {

	private ImageIcon icon = new ImageIcon("time.png");
	
	Timer timer = new Timer();
	public void start()
	{
	//	timer.cancel();
	TimerTask tt = new TimerTask() {
		
		@Override
		public void run() {
			
			
			if(time <= 0)
			{
				timer.cancel();
			}
		}
	};
	//timer = new Timer();
	timer.schedule(tt, 1000);	
	}
	
	int time;
	
	public Clock() {
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		
	}

	public void paintComponent(Graphics g)
	{
		while(time>0)
		{
		g.setColor(Color.white);
		g.fillRect(0, 0, 400, 400);
		Font f = new Font("Times", Font.BOLD, 100);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString(""+time, 230, 200);
		time--;
		}
		g.drawImage(icon.getImage(), 0, 0, null);
    }

	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	
}

