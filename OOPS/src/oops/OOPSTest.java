package oops;


public class OOPSTest  {//conversion of screen  ( main <-> start,introduce)

	private Main main;
	private Start start;
	private Introduce introduce;
	
	
	
	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		if(start == null) {
			System.out.println("error!");
		}
		this.start = start;
	}

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
			start=new Start(main,this);
			start.start(false);
			
		}
		else if(panelName.equals("Exit")){
			System.exit(0);
		}

		
	}

}
