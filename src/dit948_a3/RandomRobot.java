package dit948_a3;
import becker.robots.*;
import static dit948.Random.*;
import java.awt.Color;

public class RandomRobot extends SmartRobot {
	
	public RandomRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
    }

    public void randomMove() {
    	int nrTurns = randomInt(4);
        //double speed = this.getSpeed();
        if (nrTurns > 0)
           //setSpeed(nrTurns*speed);
        for (int i = 0; i < nrTurns; i++)
            turnLeft();
      // setSpeed(speed);
        move();
        this.getCity().examineRobots().forEach(robot -> {
            if(this.getIntersection() == robot.getIntersection() && this != robot)
            {
                try{
                    PlayerRobot pr = (PlayerRobot)robot;
                    pr.breakRobot(null);
                }catch(ClassCastException cs)
                {
                    ;
                }
            }
        });
    }

    public void go(int steps) {
        for(int i = 0; i != steps; i++) { // a potentially infinite loop
           pickThing();
           randomMove();
           
        }
    }


}
