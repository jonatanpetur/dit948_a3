import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import becker.robots.*;
import dit948_a3.MenuCity;


public class QuitMenuCity extends MenuCity {

    public QuitMenuCity() {
        super();
    }

    public void quit() {
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }


    public JMenu makeActionsMenu() {

        // first create the menu items..
        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem quit = new JMenuItem("Quit");

        quit.addActionListener(new QuitListener(this));

        // then add them to the menu
        JMenu actions = new JMenu("Actions");
        actions.add(restart);
        actions.add(quit);
        return actions;
    }

        
    public static void main(String[] args) {

        QuitMenuCity framedCity = new QuitMenuCity();

        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.addMenu();

    }

}
