import javax.swing.*;

import java.awt.*;

import becker.robots.*;


public class Game extends ChooseRobotCity{


    GameRobot red;
    GameRobot blue;

    public Game() {
        super();
    }

    public void restart() {
        super.restart();
        chooseRobot();
    }

    public void addCity() {

        City.showFrame(false);

        bombCity = new BombCity(size, bombs);

        red = new GameRobot(bombCity, 5, 5, Direction.NORTH, this);
        blue = new GameRobot(bombCity, 5, 5, Direction.NORTH, this);
        blue.setColor(Color.blue);


        roboComps = new RobotUIComponents(bombCity, 0, 0, size, size);

        CityView view = roboComps.getCityView();

        panel.add(view);

        frame.pack();

    }

    public void chooseRobot() {
        // the user must select one of the two colors for the game to start
        Object[] options = {"Red", "Blue"};

        int selectedValue =  JOptionPane.showOptionDialog(null, "Choose your robot", "Let the games begin!",
                                     JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                                     null, options, options[0]);
        // selectedValue is the index of the chosen color
        if (selectedValue == 0) {
            red.identity = 0;
            blue.identity = 1;
        } else {
            red.identity = 1;
            blue.identity = 0;
        }

        Thread redThread = new Thread(red);
        Thread blueThread = new Thread(blue);

        redThread.start();
        blueThread.start();

        startStop.doClick();

    }


    public static void main(String[] args) {

        Game framedCity = new Game();

        framedCity.addMenu();
        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.chooseRobot();


    }

}
