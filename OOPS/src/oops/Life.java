package oops;

import java.awt.*;
import java.awt.image.ImageObserver;

import javax.swing.*;
public class Life  {
	
	Image img;
	
	
	JLabel ImgBox;
	
	private int userlife;
	public Life(int num_life,Graphics g){
	img = new ImageIcon("life.png").getImage();
	while(true){
	if(num_life==0)
	{
		End end = new End();
	}
	else if(num_life==1){
		g.drawImage(img, 0, 50,(ImageObserver) this);
	}
	else if(num_life==2){
		g.drawImage(img, 50, 50,(ImageObserver) this);
	}
	else if(num_life==3){
		g.drawImage(img, 100, 50,(ImageObserver) this);
	}
		}

//라이프 닳면 이미지 사라지는것
}

public int getLife() {
	return userlife;
}

public void setLife(int life) {
	if(life>=0)
	this.userlife = life;
	
}



}
