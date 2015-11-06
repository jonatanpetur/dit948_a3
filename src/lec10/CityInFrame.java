import javax.swing.JFrame;

import becker.robots.*;


public class CityInFrame {

    ReasonableFrame frame;
    int size;
    int bombs;

    BombCity bombCity;

    RobotUIComponents roboComps;

    public CityInFrame() {
        frame = new ReasonableFrame("City in a frame");
        size = 11;
        bombs = 10;
    }

    public void addCity() {

        City.showFrame(false);

        bombCity = new BombCity(size, bombs);

        roboComps = new RobotUIComponents(bombCity, 0, 0, size, size);

        CityView view = roboComps.getCityView();

        frame.add(view);

        frame.pack();

    }

    public static void main(String[] args) {

        CityInFrame framedCity = new CityInFrame();

        framedCity.addCity();

    }

}
