package oops;

import javax.swing.*;

import oops.step.OneStep;

public class Start extends JFrame {

	private JLabel label;
	private Login login;
	private Main main;
	private OneStep onestep;
	private User user;

	public Start(Main main_input, boolean log_in) {
		this.main = main_input;
		user = new User(main);
		login = new Login(main);
		if (log_in == true) {
		
			onestep = new OneStep(main,user);
			user.step(onestep);
			onestep.setVisible(true);
			login.setVisible(false);
		}

		else if (log_in == false) {
		
			login.setVisible(true);
			main.setVisible(false);
		}

	}
}
