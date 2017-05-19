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
	}


	public void test(String panelName) {
		
		if (panelName.equals("Introduce")) {
			introduce=new Introduce();
			main.setVisible(false);
			
		}
		else{
			System.out.println("kk");
		}
	}

}
