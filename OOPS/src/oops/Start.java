package oops;

import javax.swing.*;

import oops.step.OneStep;

public class Start extends JFrame {//ȭ�� ��ȯ (start<->login,onestep

	private JLabel label;
	private Login login;
	private Main main;
	private OneStep onestep;
	private User user;
	private OOPSTest test;
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Start(Main main_input,OOPSTest test){
		this.main = main_input;
		this.test=test;
		
		
		login = new Login(main,test);
		user = new User(login);
	}

	public void start(boolean log_in) {
		
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
