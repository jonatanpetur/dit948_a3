import becker.robots.*;

import static dit948.Random.*;

import javax.swing.JOptionPane;
import java.awt.Color;

public class GameRobot extends ThreadedRobot {

    int identity; // 0 for user, 1 for adversary
    Game g;

    public GameRobot(City c, int st, int av, Direction d, Game g) {
        super(c, st, av, d);
        this.g = g;
    }

    public void run() {
        go(1000);
    }

    public void breakRobot(String message) {
        g.startStop.doClick();
        if (identity == 0) { // we died, we lose
            int choice = JOptionPane.showConfirmDialog(null,
                                                       "You Lose! \n Restart game?", 
                                                       "Game Over", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION)
                g.restart();
            else
                g.quit();
        } else { // they died, we win
            int choice = JOptionPane.showConfirmDialog(null,
                                                       "You Win! \n Restart game?", 
                                                       "Game Over", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION)
                g.restart();
            else
                g.quit();
        }
    }

}
