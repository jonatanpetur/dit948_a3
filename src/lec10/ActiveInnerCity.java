import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import becker.robots.*;


public class ActiveInnerCity extends RestartMenuCity {

    public ActiveInnerCity() {
        super();
    }


    public class SettingsListener implements ActionListener {
        int bombs;

        public SettingsListener(int bombs) {
            this.bombs = bombs;
        }

        public void actionPerformed(ActionEvent ae) {
            changeNumBombs(bombs);
        }
    }


    public void changeNumBombs(int bombs) {
        this.bombs = bombs;
        restart();
    }

    public JMenu makeSettingsMenu() {
        // create the menu items
        JRadioButtonMenuItem one = new JRadioButtonMenuItem("1");
        JRadioButtonMenuItem ten = new JRadioButtonMenuItem("10");
        ten.setSelected(true); // ten bombs by default
        JRadioButtonMenuItem twenty = new JRadioButtonMenuItem("20");

        // add listeners
        one.addActionListener(new SettingsListener(1));
        ten.addActionListener(new SettingsListener(10));
        twenty.addActionListener(new SettingsListener(20));

        // new step: put buttons in a group, so that we know only
        // one of them can be selected at a time
        ButtonGroup settingsGroup = new ButtonGroup();
        settingsGroup.add(one);
        settingsGroup.add(ten);
        settingsGroup.add(twenty);

        // add the items to the menu
        // (Hey Java, why can't I just add the group?)
        JMenu settings = new JMenu("Settings");
        settings.add(one);
        settings.add(ten);
        settings.add(twenty);
        return settings;
    }

    public static void main(String[] args) {

        ActiveInnerCity framedCity = new ActiveInnerCity();

        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.addMenu();

    }

}
