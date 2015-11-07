package dit948_a3;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

package assignment3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

import becker.robots.Direction;

public class MenuCity extends CityInFrame {
	JButton pick;
	JButton left;
	JButton right;
	JButton up;
	JButton down;
	JPanel panel;
	
	public MenuCity() {
        super();
    }
	
	public void restart() {
//		frame.remove(mainpanel);
        addMainPanel();
        addCity();
        addMenu();
        addButtons();
        
    }

	public JMenu makeActionsMenu() {

        // first create the menu items..
        JButton pr = new JButton("Pause/ Restart");
        
//        JButton ss = new JButton();
//        ss = roboComps.getStartStopButton();
//        ss.doClick();
//        
//        JButton restart = new JButton("Restart");
//        restart.addActionListener(new RestartListener(this));
        
        // then add them to the menu
        JMenu actions = new JMenu("Actions");
        actions.add(pr);
  //      actions.add(restart);
                      
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
	
	 public void addButtons() {
		 	
	     	up = new JButton("Up");   
	        bc.gridx = 3;
	        bc.gridy = 0;
	        up.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(up,bc);
	        up.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Direction d = player.getDirection();
					
					switch (d) {
					case NORTH:
						player.move();
						break;
					case SOUTH:
						player.turnAround();
						break;
					case EAST:
						player.turnLeft();
						break;
					case WEST:
						player.turnRight();
						break;
					default:
						break;
					}
					
					
				}
			});
	        pick = new JButton("Pick");	
	      	bc.gridx = 3;
		    bc.gridy = 1;
		    pick.setPreferredSize(new Dimension(80, 40));
		    secondPanel.add(pick, bc);
		    pick.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					player.pickThing();
					
				}
			});
		    
		    left = new JButton("Left");       
	        bc.gridx = 2;
	        bc.gridy = 1;
	        left.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(left, bc);
	        left.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Direction d = player.getDirection();
					
					switch (d) {
					case NORTH:
						player.turnLeft();
						break;
					case SOUTH:
						player.turnRight();
						break;
					case EAST:
						player.turnAround();
						break;
					case WEST:
						player.move();
						break;
					default:
						break;
					}
					
					
				}
			});
	        
	        right = new JButton("Right");
	        bc.gridx = 4;
	        bc.gridy = 1;
	        right.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(right, bc);
	        right.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Direction d = player.getDirection();
					
					switch (d) {
					case NORTH:
						player.turnRight();
						break;
					case SOUTH:
						player.turnLeft();
						break;
					case EAST:
						player.move();
						break;
					case WEST:
						player.turnAround();
						break;
					default:
						break;
					}
					
					
				}
			});
	        
	        down = new JButton("Down");
	        bc.gridx = 3;
	        bc.gridy = 2;
	        down.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(down, bc);
	        down.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Direction d = player.getDirection();
					
					switch (d) {
					case NORTH:
						player.turnAround();
						break;
					case SOUTH:
						player.move();
						break;
					case EAST:
						player.turnRight();
						break;
					case WEST:
						player.turnLeft();
						break;
					default:
						break;
					}
					
					
				}
			});
	       
	        secondPanel.validate();
	 } 
}

