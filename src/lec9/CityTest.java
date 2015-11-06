package lec9;
import becker.robots.*;

public class CityTest {
    public static void main(String[] args) {
        City berlin = new City(); // default constructor
        City verona = new City(12, 4);  // visible streets and avenues
        City boston = new City(5, 5, 10, 20, 10); // first visible st and av, 
                                                  //visible st and av, 
                                                  // intersection size(?)
        // Note: close one, you close them all
    }
}
