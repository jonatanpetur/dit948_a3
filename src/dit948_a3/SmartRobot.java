package dit948_a3;
import becker.robots.*;
import static dit948.Random.*;
import java.awt.Color;

public class SmartRobot extends Robot {
	
	IsRobot isRobot;
	
	public SmartRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
        this.isRobot = new IsRobot();
    }

    public void turnRight() {
      double speed = this.getSpeed();
      setSpeed(3 * speed);
        turnLeft();
        turnLeft();
        turnLeft();
      setSpeed(speed);
    }

    public void putThing() {
        if (countThingsInBackpack() > 0)
            super.putThing();
    }

    public void pickThing() {
        if (canPickThing())
            super.pickThing();
    }
    
    public void justMove(){
    	if(frontIsClear()){
    		super.move();
    	}
    }
    
    public void move() {
        
        try{
        this.getIntersection().getNeighbor(this.getDirection()).examineRobots(isRobot).forEach(robot -> { 
            try{
                PlayerRobot pr = (PlayerRobot)robot;
                if(pr.isBesideThing(isRobot)){
                pr.breakRobot();
                }
                else{
                	System.out.println("nope");
                }
            }catch(ClassCastException cs)
            {
                ;
            }
    });
	
    }
       finally{
       	if (frontIsClear()){
            super.move();
    	}
       }
    }
    public void turnAround() {
       double speed = getSpeed();
       setSpeed(2 * speed);
        turnLeft();
        turnLeft();
       setSpeed(speed);
    }
    @Override
    public void turnLeft(){
    	super.turnLeft();
    }
        
    public void move(int nrSteps) {
    	
        for (int i = 0; i < nrSteps; i++) {
            move();
        }
    }
    
}
