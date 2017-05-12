package oops;

import javax.swing.JFrame;

public class OOPSTest  {

	private Main main;
	private Start start;
	private End end;
	private Introduce introduce;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {

		if (main == null)
			System.out.println("error");
		this.main = main;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		if (start == null)
			System.out.println("error");
		this.start = start;
	}

	public End getEnd() {
		return end;
	}

	public void setEnd(End end) {
		if (end == null)
			System.out.println("error");

		this.end = end;
	}

	public Introduce getIntroduce() {
		return introduce;
	}

	public void setIntroduce(Introduce introduce) {
		if (introduce == null)
			System.out.println("error");
		this.introduce = introduce;
	}

	public static void main(String[] args) {

		OOPSTest test = new OOPSTest();

		final int frame_Height = 900;
		final int frame_Width = 1300;

		test.main = new Main();
		test.start = new Start();
		test.end = new End();
		test.introduce = new Introduce();

		test.setMain(test.main);
		test.getMain().setSize(frame_Width, frame_Height);
		test.getMain().setTitle("OOPS!");
		test.getMain().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.getMain().setVisible(true);

	}

//	public void change(String panelName) {
//		if (panelName.equals("Start")) {
//			getContentPane().removeAll();
//			// getContentPane().add(start);
//			revalidate();
//			repaint();
//		} else if (panelName.equals("Introduce")) {
//			getContentPane().removeAll();
//			// getContentPane().add(introduce);
//			revalidate();
//			repaint();
//		}
//	}

}
