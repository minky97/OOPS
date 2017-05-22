package oops;

import javax.swing.JFrame;

public class OOPSTest  {

	private Main main;
	private Start start;
	private End end;
	private Setting setting;
	private Introduce introduce;
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
		else if(panelName.equals("Setting")){
			setting = new Setting(main);
			setting.setVisible(true);
			main.setVisible(false);
			
		}
		else if(panelName.equals("Start")){
			join=new Join(main);
			join.setVisible(true);
			main.setVisible(false);
		}
		else if(panelName.equals("Start_game")){
			start=new Start(main);
			start.setVisible(true);
			join.setVisible(false);
		}
		else {
			System.out.println("kk");
		}
	}

}
