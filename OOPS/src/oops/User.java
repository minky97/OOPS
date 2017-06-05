package oops;

import java.util.ArrayList;

import oops.step.FourStep;
import oops.step.OneStep;
import oops.step.ThreeStep;
import oops.step.TwoStep;

public class User extends Login {

	public User(Main main_input) {
		super(main_input);
		// TODO Auto-generated constructor stub
	}

	// private ArrayList<Integer> scorelist = new ArrayList<Integer>();
	private OneStep onestep;
	private TwoStep twostep;
	private ThreeStep threestep;
	private FourStep fourstep;
	private String user;

	public void step(OneStep onestep) {
		this.onestep = onestep;
	}

	public void step(TwoStep twostep) {
		this.twostep = twostep;
	}

	public void step(ThreeStep threestep) {
		this.threestep = threestep;
	}

	public void step(FourStep fourstep) {
		this.fourstep = fourstep;
	}

	public int score() {
		int score_int = onestep.getScore() ;
		if(twostep!=null)
		score_int = score_int + twostep.getScore();
		if(threestep!=null)
			score_int = score_int +threestep.getScore();
		if(fourstep!=null)
			score_int = score_int + fourstep.getScore();


		return score_int;
	}

	public String user() {
		user = super.getuser_list().get(super.getindex_user());
		return user;
	}

}