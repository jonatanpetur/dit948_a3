import becker.robots.*;

import static dit948.Random.*;

public class BombCity extends City {

    int size;

    int numBombs;

    public BombCity(int size, int numBombs) {
        super(size, size);

        this.size = size;
        this.numBombs = numBombs;

        distributeBombs();

        putWalls();

    }

    void distributeBombs() {

        showThingCounts(true);

        for (int i = 0; i < numBombs; i++) {
            int st = 0;
            int av = 0;

            do {
                st = randomInt(size);
                av = randomInt(size);
            } while (st == 5 && av == 5);
            new Bomb(this, st, av);
        }
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

        BombCity world = new BombCity(11, 10);
        RandomRobot rob = new RandomRobot(world, 5, 5, Direction.NORTH);
        for (int i = 0; i < 1000; i++) {
            rob.randomMove();
            rob.pickThing();
        }


    }

}
