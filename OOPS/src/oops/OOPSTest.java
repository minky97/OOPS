package oops;

import javax.swing.JFrame;

public class OOPSTest  {

	private Main main;
	private Start start;
	private End end;
	private Introduce introduce;
	private Login login;
	private Join join;
	public OOPSTest(Main input_main)
	{
		this.main = input_main;
	}
	
	public void test(String panelName) 
	{		
		if (panelName.equals("Introduce"))
		{
			introduce=new Introduce(main);
			introduce.setVisible(true);
			main.setVisible(false);
			
		}
	
		else if(panelName.equals("Start")){
			start=new Start(main,false);
			
		}

		else {
			System.out.println("kk");
		}
	}

}
