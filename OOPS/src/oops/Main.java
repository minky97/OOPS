package oops;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {// OOPs first screen

	private JButton start_btn;// start button
	private JButton introduce_btn;// introduce button
	private JButton Exit_btn;// Exit button
	private JButton Setting_btn;// Setting button
	private Font f1;
	private JScrollPane scrollPane;
	private OOPSTest ex;

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
		
		ImageIcon image = new ImageIcon("image.png");

		JPanel panel= new JPanel() {
			public void paintComponent(Graphics g){
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		panel.add(start_btn);
		panel.add(introduce_btn);
		panel.add(Setting_btn);
		panel.add(Exit_btn);

		
		 scrollPane = new JScrollPane(panel);
	     setContentPane(scrollPane);
	
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

//		if(arg0.getSource().equals(start_btn))
//		{
//			
//		}
//		else if(arg0.getSource().equals(Exit_btn))
//			ex.change("Exit");
//		else if(arg0.getSource().equals(Setting_btn))
//			ex.change("Setting");
//		else if(arg0.getSource().equals(introduce_btn))
//			ex.change("Introduce");
	}
	
	

}