import javax.swing.*;

import java.awt.*;

import becker.robots.*;


public class RestartMenuCity extends QuitMenuCity {

    public RestartMenuCity() {
        super();
    }

    public void restart() {
        frame.remove(panel);

        addPanel();
        addCity();
        addStartStop();
        addMenu();
    }

    public JMenu makeActionsMenu() {

        // first create the menu items..
        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem quit = new JMenuItem("Quit");

        quit.addActionListener(new QuitListener(this)); // notice subtle use of inheritance

        restart.addActionListener(new RestartListener(this));

        // then add them to the menu
        JMenu actions = new JMenu("Actions");
        actions.add(restart);
        actions.add(quit);
        return actions;
    }

    public static void main(String[] args) {

        RestartMenuCity framedCity = new RestartMenuCity();

        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.addMenu();

    }

}
