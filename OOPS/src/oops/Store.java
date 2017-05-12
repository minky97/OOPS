package oops;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Store extends JPanel implements ActionListener {

	
	//Clock c = new Clock();
	//Hint h = new Hint();
	//User u = new User();

	private int price;
	private int num;

	public Store(){
		
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<=0) System.out.println();
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void addTime(){
		
	}
	public void addHint(){
		
	}
	public void addLife(){
		
	}
	public void caculate(){
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		
	}
}
