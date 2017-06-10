package oops;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import oops.step.OneStep;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Clock extends JPanel implements ActionListener {

	private User user;
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	private ImageIcon icon = new ImageIcon("time.png");
	
	Timer timer = new Timer(1000,this);
	int time;

	private boolean check=false;
	
	public Clock(User user) {
		this.user=user;
		
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
		timer.start();
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, 400, 400);
		Font f = new Font("Times", Font.BOLD, 100);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString(""+time, 230, 200);
		g.drawImage(icon.getImage(), 0, 0, null);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(timer == arg0.getSource())
		{
			time--;
			if(time <= 0)
			{
			    timer.stop();
			}
			repaint();
		}
		if(time==0){
			setend(true);
			End end = new End(user);
			end.setVisible(true);
		}
	}
	public void setend(boolean check){
		this.check=check;
	}
	public boolean getend(){
		return check;
	}
	public void stop()
	{
		timer.stop();
	}
	
	public void restart()
	{
		timer.start();
	}
}

