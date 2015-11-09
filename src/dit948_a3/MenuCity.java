package dit948_a3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

import becker.robots.Direction;
import becker.robots.icons.BrokenIcon;

public class MenuCity extends CityInFrame {
	JButton pick;
	JButton left;
	JButton right;
	JButton up;
	JButton down;
	JPanel panel;
	JButton ss;
	JButton restart;
	JRadioButtonMenuItem easy;
	JRadioButtonMenuItem medium;
	JRadioButtonMenuItem hard;
	
	public MenuCity() {
        super();
    }
	public void addCity(){
		super.addCity();
        rob = new ThreadedRobot(prizeCity,(int) (Math.random()*size),(int) (Math.random()*size), Direction.NORTH);
        rob.setColor(Color.MAGENTA);
        player = new PlayerRobot(prizeCity,5,5,Direction.SOUTH, this);
        player.move(0);
        rob.setSpeed(player.getSpeed() / 5);
        Thread robThread = new Thread(rob);
        robThread.start();	        

	}
	public void restart(String dificulty) {
        addMainPanel();
        addCity();
        addMenu();
        addButtons();
        switch(dificulty){
        case "Easy":
        easy.setSelected(true);
        rob.setColor(Color.MAGENTA);
        double speedEasy = player.getSpeed() / 5;
        rob.setSpeed(speedEasy);
        break;
        case "Medium":
        medium.setSelected(true);
        rob.setColor(Color.BLUE);
        double speedMedium = player.getSpeed() / 2;
        rob.setSpeed(speedMedium);
        break;
        case "Hard":
        hard.setSelected(true);
        rob.setColor(Color.BLACK);
        rob.setSpeed(player.getSpeed());
        break;   
        }    
    }
	public JMenu makeActionsMenu() {
        ss = roboComps.getStartStopButton();
        ss.doClick();
        
        JMenuItem pr = new JMenuItem("Pause/ Restart");
        pr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ss.doClick();
			}
		});
        
        
        // then add them to the menu
        JMenu actions = new JMenu("Actions");
        actions.add(pr);
                      
        return actions;
    }
	
	public JMenu makeSettingsMenu() {
        // create the menu items
        easy = new JRadioButtonMenuItem("Easy");
        medium = new JRadioButtonMenuItem("Medium");
        hard = new JRadioButtonMenuItem("Hard");
        easy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				restart("Easy");
			}
		});
        medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				restart("Medium");
			}
		});
        hard.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				restart("Hard");
			}
		});
        easy.setSelected(true);

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
	        up.addActionListener((ActionEvent evt)->{
				player.moveUp();
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
					if(player.countThingsInBackpack() > 0){
						ss.doClick();
						
						try {
							rob.breakRobot();
						} catch (Exception e2) {
							int choice = JOptionPane.showConfirmDialog(null, "You Win! \n Restart game?", "Game Over", JOptionPane.YES_NO_OPTION);
				            if (choice == JOptionPane.YES_OPTION){
				            	restart("Easy");
				            }
				            else{
				                System.exit(0);
				            }

						}
						
						//rob.setIcon(new BrokenIcon(rob.getIcon()));
					}
					
				}
			});
		    
		    left = new JButton("Left");       
	        bc.gridx = 2;
	        bc.gridy = 1;
	        left.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(left, bc);
	        left.addActionListener((ActionEvent e) ->{
				player.moveLeft();
			});
	        
	        right = new JButton("Right");
	        bc.gridx = 4;
	        bc.gridy = 1;
	        right.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(right, bc);
	        right.addActionListener((ActionEvent evt)->{
				player.moveRight();
			});

	        down = new JButton("Down");
	        bc.gridx = 3;
	        bc.gridy = 2;
	        down.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(down, bc);
	        down.addActionListener((ActionEvent evt)->{
			 player.moveDown();
			});
	       
	        secondPanel.validate();
	 } 
}
