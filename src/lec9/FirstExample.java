package lec9;
import becker.robots.*;

import static dit948.Random.*;

public class FirstExample {

    public static void main(String[] args) {

        int size = 11;
        int numThings = 10;

        City city = new City(size, size);

        // randomly distribute generic things

        for (int i = 0; i < numThings; i++)
            new Thing(city, randomInt(size), randomInt(size));

        // show the number of things at each intersection

        city.showThingCounts(true);

        // put a wall around the city

        for (int i = 0; i < size; i++) {
            new Wall(city, 0, i, Direction.NORTH);
            new Wall(city, size-1, i, Direction.SOUTH);
            new Wall(city, i, 0, Direction.WEST);
            new Wall(city, i, size-1, Direction.EAST);
        }

        // put a robot in the middle

        // question: when is (size / 2, size / 2) the center of the city?

        Robot rob = new Robot(city, size / 2, size / 2, Direction.NORTH);

    }

}
