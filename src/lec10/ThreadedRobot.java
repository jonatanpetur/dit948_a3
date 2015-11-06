import becker.robots.*;

import static dit948.Random.*;

import java.awt.Color;

public class ThreadedRobot extends ExplodingRobot implements Runnable {

    public ThreadedRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
    }

    public void run() {
        go(1000);
    }

    public static void main(String[] args) {
        int sz = 11;
        int bombs = 11;
        BombCity world = new BombCity(sz, bombs);

        ThreadedRobot rob = new ThreadedRobot(world, 5, 5, Direction.NORTH);
        ThreadedRobot bor = new ThreadedRobot(world, 5, 5, Direction.NORTH);
        bor.setColor(Color.magenta);

        Thread robThread = new Thread(rob);
        Thread borThread = new Thread(bor);

        robThread.start();
        borThread.start();

    }

}
