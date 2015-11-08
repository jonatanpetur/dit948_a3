package dit948_a3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
    	    
    	    
	        size = 11;
	        prize = 1;
	        
	    }

	    public void addCity() {

	        City.showFrame(false);
	        
	        
	        prizeCity = new PrizeCity(size, prize);
	        
	        rob = new ThreadedRobot(prizeCity,(int) (Math.random()*size),(int) (Math.random()*size), Direction.NORTH);
	        player = new PlayerRobot(prizeCity,5,5,Direction.SOUTH);
	        player.move(0);
	        rob.setSpeed(player.getSpeed() / 5);
	        roboComps = new RobotUIComponents(prizeCity, 0, 0, size, size);

	        CityView view = roboComps.getCityView();

	        firstPanel.add(view);
	        Thread robThread = new Thread(rob);
	        robThread.start();
	        //playerThread.start();
	        
	        
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

	   
	   

//	    public static void main(String[] args) {
//
//	        CityInFrame framedCity = new CityInFrame();
//
//	        framedCity.addCity();
//	        framedCity.addMenu();
//
//	    }

	}



