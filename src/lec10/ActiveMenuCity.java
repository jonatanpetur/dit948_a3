import javax.swing.*;

import java.awt.*;

import becker.robots.*;


public class ActiveMenuCity extends RestartMenuCity {

    public ActiveMenuCity() {
        super();
    }

    public void changeNumBombs(int bombs) {
        this.bombs = bombs;
        restart();
    }

    public JMenu makeSettingsMenu() {
        // create the menu items
        JRadioButtonMenuItem one = new JRadioButtonMenuItem("1");
        JRadioButtonMenuItem ten = new JRadioButtonMenuItem("10");
        // ten.setSelected(true); // ten bombs by default
        JRadioButtonMenuItem twenty = new JRadioButtonMenuItem("20");

        switch(bombs) {
        case 1:
            one.setSelected(true);
            break;
        case 10:
            ten.setSelected(true);
            break;
        case 20:
            twenty.setSelected(true);
            break;
        default:
            System.err.println("Something has gone terribly wrong: bombs = " + bombs);
            break;
        }
        // add listeners
        one.addActionListener(new SettingsListener(this, 1));
        ten.addActionListener(new SettingsListener(this, 10));
        twenty.addActionListener(new SettingsListener(this, 20));

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

        ActiveMenuCity framedCity = new ActiveMenuCity();

        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.addMenu();

    }

}
