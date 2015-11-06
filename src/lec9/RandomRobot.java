package lec9;
import becker.robots.*;

import static dit948.Random.*;

import java.awt.Color;

public class RandomRobot extends SmartRobot {

    public RandomRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
    }

    public void randomMove() {
        int nrTurns = randomInt(4);
        double speed = getSpeed();
        if (nrTurns > 0)
            setSpeed(nrTurns*speed);
        for (int i = 0; i < nrTurns; i++)
            turnLeft();
        setSpeed(speed);
        move();
    }

    public void go(int steps) {
        for(int i = 0; i != steps; i++) { // a potentially infinite loop
            pickThing();
            randomMove();
        }
    }

    public static void main(String[] args) {
        FirstWorld world = new FirstWorld(11);
        world.putWalls();
        world.distributeThings(20);

        RandomRobot rob = new RandomRobot(world, 5, 5, Direction.NORTH);
        rob.go(1000);

    }

}
