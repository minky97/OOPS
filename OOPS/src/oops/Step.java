package oops;

import java.util.ArrayList;

import javax.swing.JLabel;

public interface Step {

	abstract public void setSound(boolean start, BackSound sound);

	abstract public void showlife(int num, ArrayList<JLabel> imageArray);
}
