package dit948_a3;
import becker.robots.*;


import static dit948.Random.*;


public class RandomRobot extends SmartRobot {
	
	IsRobot isRobot;

	public RandomRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
        this.isRobot = new IsRobot();

    }

    public void randomMove() {
        	this.getCity().examineRobots().forEach(robot -> {
            	if(this.getIntersection() == robot.getIntersection() && this != robot){
                try{
                    PlayerRobot pr = (PlayerRobot)robot;
                    pr.breakRobot();
                }catch(ClassCastException cs)
                {
                    ;
                }}
        });
        	   int nrTurns = randomInt(4);
               if (nrTurns > 0)
               for (int i = 0; i < nrTurns; i++)
                   turnLeft();
              super.move();
               
           }
    
    public void go(int steps) {
        for(int i = 0; i != steps; i++) { // a potentially infinite loop
           //pickThing();
           randomMove();   
        }
    }


}
