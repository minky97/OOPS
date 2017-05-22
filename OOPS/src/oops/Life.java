package oops;

import java.awt.*;
import javax.swing.*;
public class Life  {
	
	Image img1;
	Image img2;
	Image img3;
	
	JLabel ImgBox;
	
private int userlife;

public int getLife() {
	return userlife;
}

public void setLife(int life) {
	if(life>=0)
	this.userlife = life;
	
}

public void life(Graphics g){

	while(true){
	if(userlife==0)
	{
		//End end = new End();
	}
		}
//img1 = new ImageIcon("life.png").getImage();
//img2 = new ImageIcon("life.png").getImage();
//img3 = new ImageIcon("life.png").getImage();
//g.drawImage(img1, 0, 50, this);
//g.drawImage(img2, 50, 50, this);
//g.drawImage(img3, 50, 50, this);
//라이프 닳면 이미지 사라지는것
}

}

