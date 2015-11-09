package dit948_a3;

import becker.robots.*;

public class ThreadedRobot extends RandomRobot implements Runnable {
	


    public ThreadedRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
    }
    
    public void breakRobot()
    {
        super.breakRobot("Oh no!");
    }
    
    public void run() {
        go(1000);
    }
}
