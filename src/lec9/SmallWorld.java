package lec9;
import becker.robots.*;

public class SmallWorld extends FirstWorld {
    public SmallWorld() {
        super(5);
    }

    public static void main(String[] args) {
        SmallWorld smallWorld = new SmallWorld();
        Robot rob = new Robot(smallWorld, 2, 2, Direction.NORTH);

        smallWorld.putWalls();

        smallWorld.distributeThings(1);

        // rob.pickThing();
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
    }
}
