package oops;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.Timer;

import oops.step.Step;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Clock extends JPanel implements ActionListener {

	private User user;
	private ImageIcon icon = new ImageIcon("time.png");
	Timer timer = new Timer(1000, this);
	int time;
	private Step step;
	private Main main;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		if(time < 0 ) {
			System.out.println("error!");
		}
		this.time = time;
	}

	public void setStep(Step step) {
		if(step == null) {
			System.out.println("error!");
		}
		this.step = step;
	}

	public Clock(User user, Main main_input) {
		this.user = user;
		this.main = main_input;
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 450, Short.MAX_VALUE));
		groupLayout
				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 300, Short.MAX_VALUE));
		setLayout(groupLayout);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 400, 400);
		Font f = new Font("Times", Font.BOLD, 100);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawString("" + time, 230, 200);
		g.drawImage(icon.getImage(), 0, 0, null);
	}

	//https://m.blog.naver.com/PostView.nhn?blogId=rlaauddlf200&logNo=30146684375&proxyReferer=http%3A%2F%2Fwww.google.co.kr%2Furl%3Fsa%3Dt%26rct%3Dj%26q%3D%26esrc%3Ds%26source%3Dweb%26cd%3D7%26ved%3D0ahUKEwj71JWw_cPUAhVBW7wKHQTZBkMQFghHMAY%26url%3Dhttp%253A%252F%252Fm.blog.naver.com%252Frlaauddlf200%252F30146684375%26usg%3DAFQjCNHMNWpfV5CkwRi_9_I2_969YYO1GA
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (timer == arg0.getSource()) {
			time--;
			if (time <= 0) {
				timer.stop();
			}
			repaint();
		}
		if (time == 0) {

			End end = new End(user);
			end.setVisible(true);
			step.dispose();
			step.setSound(false);

		}
	}

	public void stop() {
		timer.stop();
	}

	public void restart() {
		timer.start();
	}
}
