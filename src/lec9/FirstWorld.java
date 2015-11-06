package lec9;
import becker.robots.*;

import static dit948.Random.*;

public class FirstWorld extends City {

    int size;

    public FirstWorld(int size) {
        super(size, size);

        this.size = size;
    }

    public void distributeThings(int numThings) {

        showThingCounts(true);

        for (int i = 0; i < numThings; i++)
            new Thing(this, randomInt(size), randomInt(size));
    }

    void putWalls() {

        for (int i = 0; i < size; i++) {
            new Wall(this, 0, i, Direction.NORTH);
            new Wall(this, size-1, i, Direction.SOUTH);
            new Wall(this, i, 0, Direction.WEST);
            new Wall(this, i, size-1, Direction.EAST);
        }

    }

    public static void main(String[] args) {

        FirstWorld world = new FirstWorld(11);
        world.putWalls();
        world.distributeThings(20);
        Robot rob = new Robot(world, 5, 5, Direction.NORTH);


    }

}
