package dit948_a3;

import becker.robots.*;

import static dit948.Random.*;

public class PrizeCity extends City {

    int size;

    int numPrizes;

    public PrizeCity(int size, int numPrizes) {
        super(size,numPrizes);

        this.size = size;
        this.numPrizes = numPrizes;

        distributePrizes();

        putWalls();

    }

    void distributePrizes() {

      
           Prize p = new Prize(this, randomInt(size), randomInt(size));
            p.setIcon(new ImageIcon());
        }
    

    void putWalls() {

        for (int i = 0; i < size; i++) {
            new Wall(this, 0, i, Direction.NORTH);
            new Wall(this, size-1, i, Direction.SOUTH);
            new Wall(this, i, 0, Direction.WEST);
            new Wall(this, i, size-1, Direction.EAST);
        }

    }

//    public static void main(String[] args) {
//
//        PrizeCity world = new BombCity(11, 10);
//        RandomRobot rob = new RandomRobot(world, 5, 5, Direction.NORTH);
//        for (int i = 0; i < 1000; i++) {
//            rob.randomMove();
//            rob.pickThing();
//        }
//
//
//    }

}
