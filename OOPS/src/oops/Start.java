package oops;

import javax.swing.*;

public class Start extends JFrame{

	private JLabel label;
	private Join join;
	private Main main;
	public Start(Main main_input,boolean log_in){
		this.main = main_input;
		if(log_in == true){
			
		}
		else if(log_in == false){
			join = new Join(main);
			join.setVisible(true);
			main.setVisible(false);
		}
	}
}
