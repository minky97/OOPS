package oops;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Clock extends JPanel implements ActionListener {

	private ImageIcon icon = new ImageIcon("time.png");
	
	Timer mTimer = new Timer(1000,this);
	int mTime = 3;
	
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
		mTimer.start();
	}

	public void paintComponent(Graphics g)
	{
		g.drawString(""+mTime, 300, 300);
		g.drawImage(icon.getImage(), 0, 0, null);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(mTimer == arg0.getSource())
		{
			mTime--;
			if(mTime <= 0)
			{
			    mTimer.stop();
				JOptionPane.showMessageDialog(this, "GameOver", "info", JOptionPane.INFORMATION_MESSAGE);
			}
			repaint();
		}
	}
}
