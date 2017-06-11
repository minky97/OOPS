package oops;


public class OOPSTest  {//화면 전환 ( main <-> start,introduce)

	private Main main;
	private Start start;
	private Introduce introduce;
	
	
	
	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
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

		//else로 빠지는지 확인할려고 ㅎㅎ .. kk
		else {
			System.out.println("kk");
		}
	}

}
