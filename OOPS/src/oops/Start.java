package oops;

import javax.swing.*;

public class Start extends JFrame {

	private JLabel label;
	private Login login;
	private Main main;
	private OneStep onestep;
	private TwoStep twostep;
	private ThreeStep threestep;


	public Start(Main main_input, boolean log_in, int num) {
		this.main = main_input;

		if (log_in == true) {
			if (num == 1) {
				onestep = new OneStep(main);
				login = new Login(main);
				onestep.setVisible(true);
				login.setVisible(false);
			} else if (num == 2) {
				onestep = new OneStep(main);
				twostep = new TwoStep(main);
				twostep.setVisible(true);
				onestep.setVisible(false);
			}

		} else if (log_in == false) {
			login = new Login(main);
			login.setVisible(true);
			main.setVisible(false);
		}
		
	}
}
