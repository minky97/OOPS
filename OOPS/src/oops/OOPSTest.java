package oops;
import javax.swing.JFrame;

public class OOPSTest {

	public void createFrame() {
		final int frame_Height =900;
		final int frame_Width = 1300;

		JFrame frame = new JFrame("OOPS!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//OOPS oops = new OOPS();
	//	frame.add(oops);
		Main main = new Main();
		frame.add(main.main());
		
		
		frame.setSize(frame_Width, frame_Height);
		frame.setVisible(true);
		

		}

	public static void main(String[] args) {

		OOPSTest test = new OOPSTest();
		test.createFrame();
	
	}
}
