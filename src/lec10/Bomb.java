import becker.robots.*;

import java.awt.Color;

public class Bomb extends Thing {
    public Bomb(City city, int st, int av) {
        super(city, st, av);

        setCanBeCarried(false);

        setColor(Color.RED);

    }

}

