package dit948_a3;

import becker.robots.City;
import becker.robots.Direction;

public class PlayerRobot extends SmartRobot {
	
	public PlayerRobot(City c, int st, int av, Direction d) {
        super(c, st, av, d);
    }

    public void moveUp()
    {
        Direction d = this.getDirection();
        switch (d) {
            case NORTH:
                this.move();
                break;
            case SOUTH:
                this.turnAround();
                break;
            case EAST:
                this.turnLeft();
                break;
            case WEST:
                this.turnRight();
                break;
            default:
                break;
    }}

    public void moveLeft() {
        Direction d = this.getDirection();

        switch (d) {
            case NORTH:
                this.turnLeft();
                break;
            case SOUTH:
                this.turnRight();
                break;
            case EAST:
                this.turnAround();
                break;
            case WEST:
                this.move();
                break;
            default:
                break;
        }
    }

    public void moveRight() {
        Direction d = this.getDirection();

        switch (d) {
            case NORTH:
                this.turnRight();
                break;
            case SOUTH:
                this.turnLeft();
                break;
            case EAST:
                this.move();
                break;
            case WEST:
                this.turnAround();
                break;
            default:
                break;
        }
    }

    public void moveDown() {
        Direction d = this.getDirection();

        switch (d) {
            case NORTH:
                this.turnAround();
                break;
            case SOUTH:
                this.move();
                break;
            case EAST:
                this.turnRight();
                break;
            case WEST:
                this.turnLeft();
                break;
            default:
                break;
        }
    }

    @Override
    public void turnRight() {
        Thread t = new Thread(() -> {
            super.turnRight();
        });
        t.start();

    }

    @Override
    public synchronized void turnLeft() {
        Thread t = new Thread(() -> {
            super.turnLeft();
        });
        t.start();
    }

    @Override
    public void turnAround() {
        Thread t = new Thread(() -> {
            super.turnAround();
        });
        t.start();
    }

    @Override
    public void move() {
        Thread t = new Thread(() -> {
            super.move();
        });
        t.start();
    }
}
