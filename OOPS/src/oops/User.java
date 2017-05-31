package oops;

import java.util.ArrayList;

public class User{
   
   private Main main = new Main();
   private ArrayList<Integer> scorelist = new ArrayList<Integer>();
    private Join join = new Join(main);
    private Login login = new Login(main);
    private OneStep onestep = new OneStep(main);
    //private TwoStep twostep = new TwoStep(main);
    //private ThreeStep threestep = new ThreeStep(main);
    //private FourStep fourstep = new FourStep(main);
    public int score(int index)
    {   
       int score_int = onestep.getScore();//+twostep.getScore()+threestep.getScore()+fourstep.getScore()
       
       scorelist.add(index, score_int);
       
       return scorelist.get(index);
    }

    
}