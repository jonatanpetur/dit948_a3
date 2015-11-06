import javax.swing.*;

import becker.robots.*;


public class AddStartStop extends CityInFrame {

    JButton startStop;

    public AddStartStop() {
        super();
    }

    public void addStartStop() {
        startStop = roboComps.getStartStopButton();

        frame.add(startStop);

        frame.pack();
    }        

    public static void main(String[] args) {

        AddStartStop framedCity = new AddStartStop();

        framedCity.addCity();
        framedCity.addStartStop();
    }

}
