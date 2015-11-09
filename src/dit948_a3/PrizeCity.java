package dit948_a3;

import becker.robots.*;
import test.ImageIcon;

import static dit948.Random.*;

import java.util.Random;

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
    
    public int getRandomWithExclusion(Random rnd, int start, int end, int[] exclude) {
        int random = start + rnd.nextInt(end - start + 1 - exclude.length);
        for (int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }


    void distributePrizes(){
    	Random rand1 = new Random();
        Random rand2 = new Random();
     
        int[] ex = { 3, 4, 5, 6 };
        int prizeRand = getRandomWithExclusion(rand1, 0, 10, ex);
        int prizeRand2 = getRandomWithExclusion(rand2, 0, 10, ex);
                       
            Prize p = new Prize(this, prizeRand, prizeRand2);
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
}
