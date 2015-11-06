import becker.robots.*;

import static dit948.Random.*;

import java.awt.Color;

public class ExplodingRobot extends RandomRobot {

    IsBomb isBomb;

    public ExplodingRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
        isBomb = new IsBomb();

        if (isBesideThing(isBomb))
            breakRobot("Aaargh!");
    }

    public void move() {
        super.move();
        if (isBesideThing(isBomb))
            breakRobot("Aaargh!");
    }        
        
    public static void main(String[] args) {
        int size = 11;
        int bombs = 10;
        BombCity world = new BombCity(size, bombs);

        ExplodingRobot rob = new ExplodingRobot(world, 5, 5, Direction.NORTH);
        ExplodingRobot bor = new ExplodingRobot(world, 5, 5, Direction.NORTH);
        bor.setColor(Color.magenta);

        rob.go(1000);
        bor.go(1000);
    }

}
