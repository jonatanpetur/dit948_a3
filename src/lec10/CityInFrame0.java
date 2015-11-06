import javax.swing.JFrame;

import becker.robots.*;


public class CityInFrame0 {

    ReasonableFrame frame;
    int size;
    int bombs;

    BombCity bombCity;

    public CityInFrame0() {
        frame = new ReasonableFrame("City in a frame");
        size = 11;
        bombs = 10;
    }

    public void addCity() {
        bombCity = new BombCity(size, bombs);
        frame.add(bombCity);
    }


    public static void main(String[] args) {

        CityInFrame0 framedCity = new CityInFrame0();

        framedCity.addCity();

    }

}
