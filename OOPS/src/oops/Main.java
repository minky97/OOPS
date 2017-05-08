package oops;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Main extends JPanel implements ActionListener {// OOPs first screen

	private JButton start_btn;// start button
	private JButton introduce_btn;// introduce button
	private JButton Exit_btn;// Exit button
	private JButton Setting_btn;// Setting button
	private Font f1;

	public Main() {

		f1 = new Font("妓崇", Font.BOLD, 15);
		start_btn = new JButton("START"); // start button 持失
		start_btn.setFont(f1);
		
		introduce_btn = new JButton("INTRODUCE");// introduce button 持失
		introduce_btn.setFont(f1);
		
		Setting_btn = new JButton("SETTING");// Setting button 持失
		Setting_btn.setFont(f1);
		
		Exit_btn = new JButton("EXIT");// Exit button 持失
		Exit_btn.setFont(f1);
	}

	public void start() {
		start_btn.addActionListener(this);
	}

	public void introduce() {
		introduce_btn.addActionListener(this);
	}

	public void setting() {
		Setting_btn.addActionListener(this);
	}

	public void exit() {
		Exit_btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}