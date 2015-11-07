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
	    int bombs;
	    PrizeCity prizeCity;
	    RobotUIComponents roboComps;
	    JPanel mainpanel;
	    JPanel firstPanel;
	    JPanel secondPanel;
	    GridBagConstraints bc = new GridBagConstraints();
	    
	    
	    public CityInFrame() {
	        frame = new JFrame("Pac Robot");
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //frame.setSize(new Dimension(720,1500));
	        //frame.setResizable(false);
	        
	        
	        JPanel mainPanel = new JPanel();
    	    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

    	    firstPanel = new JPanel();
    	    //firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));
    	    //firstPanel.setMaximumSize(new Dimension(900, 400));
    	    bc.insets = new Insets(3,3,3,3);
    	    secondPanel = new JPanel();
    	    secondPanel.setLayout(new GridBagLayout());
    	    secondPanel.setVisible(true);
    	    
    	    
    	    //secondPanel.setMaximumSize(new Dimension(220, 200));
    	    
    	    mainPanel.add(firstPanel);
    	    mainPanel.add(secondPanel);
    	    frame.setContentPane(mainPanel);
    	    frame.setPreferredSize(new Dimension(625,800));
    	    frame.pack();
    	    
    	    
	        size = 11;
	        bombs = 1;
	        
	    }

	    public void addCity() {

	        City.showFrame(false);

	        prizeCity = new PrizeCity(size, bombs);

	        roboComps = new RobotUIComponents(prizeCity, 0, 0, size, size);

	        CityView view = roboComps.getCityView();

	        firstPanel.add(view);

	        frame.pack();
	        frame.setVisible(true);

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



