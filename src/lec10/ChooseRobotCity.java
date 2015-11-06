import javax.swing.*;

import java.awt.*;

import becker.robots.*;


public class ChooseRobotCity extends ActiveMenuCity {


    public ChooseRobotCity() {
        super();
    }


    public void chooseRobot() {
        // the user must select one of the two colors for the game to start
        Object[] options = {"Red", "Magenta"};

        int selectedValue =  JOptionPane.showOptionDialog(null, "Choose your robot", "Let the games begin!",
                                     JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                                     null, options, options[0]);
        System.out.println("You chose " + selectedValue);

        startStop.doClick();
    }


    public static void main(String[] args) {

        ChooseRobotCity framedCity = new ChooseRobotCity();

        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.addMenu();
        framedCity.chooseRobot();

    }

}
