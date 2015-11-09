package dit948_a3;

import becker.robots.City;
import becker.robots.Thing;

public class Prize extends Thing {
	
	
	
	 public Prize(City city, int st, int av) {
	        super(city, st, av);
	        setCanBeCarried(true);       
	  }
}
