package dit948_a3;
import becker.robots.*;
import static dit948.Random.*;
import java.awt.Color;

public class SmartRobot extends Robot {
	
	public SmartRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
    }

    public void turnRight() {
      //double speed = this.getSpeed();
      //setSpeed(3 * speed);
        turnLeft();
        turnLeft();
        turnLeft();
      //setSpeed(speed);
    }

    public void putThing() {
        if (countThingsInBackpack() > 0)
            super.putThing();
    }

    public void pickThing() {
        if (canPickThing())
            super.pickThing();
    }
    public void move() {
        if (frontIsClear())
            super.move();
    }
    public void turnAround() {
       // double speed = getSpeed();
        //setSpeed(2 * speed);
        turnLeft();
        turnLeft();
       // setSpeed(speed);
    }

    public void move(int nrSteps) {
    	
        for (int i = 0; i < nrSteps; i++) {
            move();
        }
    }
    
}
