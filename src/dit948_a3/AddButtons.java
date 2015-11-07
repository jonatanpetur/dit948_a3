package dit948_a3;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AddButtons extends MenuCity{
	JButton pick;
	JButton left;
	JButton right;
	JButton up;
	JButton down;
	JPanel panel;
	
	
		
	public AddButtons() {
        super();
    }
	
//	public void addGridPanel () {
//    	panel = new JPanel();
//    	panel.setLayout(new GridLayout(7,3));
//    	gridpanel.setContentPane(panel);
//    	frame.pack();
//    }
	 public void addButtons() {
		 	
	     	up = new JButton("Up");   
	        bc.gridx = 3;
	        bc.gridy = 0;
	        up.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(up,bc);
	        
	        pick = new JButton("Pick");	
	      	bc.gridx = 3;
		    bc.gridy = 1;
		    pick.setPreferredSize(new Dimension(80, 40));
		    secondPanel.add(pick, bc);
		    
		    left = new JButton("Left");       
	        bc.gridx = 2;
	        bc.gridy = 1;
	        left.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(left, bc);
	        
	        right = new JButton("Right");
	        bc.gridx = 4;
	        bc.gridy = 1;
	        right.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(right, bc);
	        
	        down = new JButton("Down");
	        bc.gridx = 3;
	        bc.gridy = 2;
	        down.setPreferredSize(new Dimension(80, 40));
	        secondPanel.add(down, bc);
	       
	        
	        secondPanel.validate();
	       
	       

//	        pick.setPreferredSize(d);
//	        down.setPreferredSize(d);
//	        left.setPreferredSize(d);
//	        right.setPreferredSize(d);
	        
	        
	        
	        
	        
	   
	        
	        

	    } 
	
}
