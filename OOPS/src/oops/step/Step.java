package oops.step;

import java.util.ArrayList;

import javax.swing.JLabel;

import oops.BackSound;
import oops.User;

public interface Step {

	abstract public int getScore();
	abstract public void setSound(BackSound Sound);
	abstract public void showlife(int num, ArrayList<JLabel> imageArray,User user);
}
