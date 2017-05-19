package oops;

import javax.swing.JFrame;

public class OOPSTest  {

	private Main main;
	private Start start;
	private End end;
	private Introduce introduce;
	public static void main(String[] args) {

		OOPSTest test = new OOPSTest();
	
	}
	
	public OOPSTest(){
		main=new Main();
		main.setVisible(true);
	}


	public void test(String panelName) {
		
		if (panelName.equals("Introduce")) {
			introduce=new Introduce();
			main.setVisible(false);
			introduce.setVisible(true);
		}
		else{
			System.out.println("kk");
		}
	}

}
