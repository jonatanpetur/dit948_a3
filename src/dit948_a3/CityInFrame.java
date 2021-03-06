package dit948_a3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;
import becker.robots.*;


	public class CityInFrame {

	    JFrame frame;
	    int size;
	    int prize;
	    PrizeCity prizeCity;
	    RobotUIComponents roboComps;
	    JPanel mainpanel;
	    JPanel firstPanel;
	    JPanel secondPanel;
	    GridBagConstraints bc = new GridBagConstraints();
	    PlayerRobot player;
	    ThreadedRobot rob;
	    
	    
	    public CityInFrame() {
	        frame = new JFrame("Pac Robot");
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        addMainPanel();
    	    frame.pack();
	        this.size = 11;
	        this.prize = 1;
	        
	    }

	    public void addCity() {

	        City.showFrame(false);
	        prizeCity = new PrizeCity(size, prize);
	        
//	        rob = new ThreadedRobot(prizeCity,(int) (Math.random()*size),(int) (Math.random()*size), Direction.NORTH);
//	        rob.setColor(Color.MAGENTA);
//	        player = new PlayerRobot(prizeCity,5,5,Direction.SOUTH);
//	        player.move(0);
//	        rob.setSpeed(player.getSpeed() / 5);
//	        Thread robThread = new Thread(rob);
//	        robThread.start();	        

	        roboComps = new RobotUIComponents(prizeCity, 0, 0, size, size);

	        CityView view = roboComps.getCityView();
	        
	        firstPanel.add(view);
	        frame.pack();
	        frame.setVisible(true);

	    }
	    
	    public void addMainPanel(){
	    	
	    	JPanel mainPanel = new JPanel();
    	    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

    	    firstPanel = new JPanel();
    	    bc.insets = new Insets(3,3,3,3);
    	    secondPanel = new JPanel();
    	    secondPanel.setLayout(new GridBagLayout());
    	    secondPanel.setVisible(true);
   
    	    mainPanel.add(firstPanel);
    	    mainPanel.add(secondPanel);
    	    frame.setContentPane(mainPanel);
    	    frame.setPreferredSize(new Dimension(625,800)); 	
	    }
	}



