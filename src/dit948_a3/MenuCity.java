package dit948_a3;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuCity extends CityInFrame {
	
	public MenuCity() {
        super();
    }

	public JMenu makeActionsMenu() {

        // first create the menu items..
        JMenuItem pr = new JMenuItem("Pause/ Restart");
        

        // then add them to the menu
        JMenu actions = new JMenu("Actions");
        actions.add(pr);
        
        return actions;
    }
	
	public JMenu makeSettingsMenu() {
        // create the menu items
        JRadioButtonMenuItem easy = new JRadioButtonMenuItem("Easy");
        JRadioButtonMenuItem medium = new JRadioButtonMenuItem("Medium");
        medium.setSelected(true); // ten bombs by default
        JRadioButtonMenuItem hard = new JRadioButtonMenuItem("Hard");

        // new step: put buttons in a group, so that we know only
        // one of them can be selected at a time
        ButtonGroup settingsGroup = new ButtonGroup();
        settingsGroup.add(easy);
        settingsGroup.add(medium);
        settingsGroup.add(hard);

        // add the items to the menu
        // (Hey Java, why can't I just add the group?)
        JMenu settings = new JMenu("Settings");
        settings.add(easy);
        settings.add(medium);
        settings.add(hard);
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
}
