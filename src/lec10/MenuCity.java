import javax.swing.*;

import java.awt.*;

import becker.robots.*;


public class MenuCity extends LayoutGallery {

    public MenuCity() {
        super();
    }

    public JMenu makeActionsMenu() {

        // first create the menu items..
        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem quit = new JMenuItem("Quit");

        // then add them to the menu
        JMenu actions = new JMenu("Actions");
        actions.add(restart);
        actions.add(quit);
        return actions;
    }

    public JMenu makeSettingsMenu() {
        // create the menu items
        JRadioButtonMenuItem one = new JRadioButtonMenuItem("1");
        JRadioButtonMenuItem ten = new JRadioButtonMenuItem("10");
        ten.setSelected(true); // ten bombs by default
        JRadioButtonMenuItem twenty = new JRadioButtonMenuItem("20");

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

    public void addMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu actions = makeActionsMenu(); 
        menuBar.add(actions);

        // Once again for the settings menu

        JMenu settings = makeSettingsMenu();
        // add the menu to the menu bar
        menuBar.add(settings);

        // finally, add the menu bar to the frame

        frame.setJMenuBar(menuBar);

        frame.pack(); // show the menu now, please

    }
        
    public static void main(String[] args) {

        MenuCity framedCity = new MenuCity();

        framedCity.addCity();
        framedCity.addStartStop();
        framedCity.addMenu();

    }

}
