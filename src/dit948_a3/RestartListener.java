package dit948_a3;
import javax.swing.*;
import java.awt.event.*;

public class RestartListener implements ActionListener {
    MenuCity rmc;

    public RestartListener(MenuCity rmc) {
        this.rmc = rmc;
    }

    public void actionPerformed(ActionEvent ae) {
        rmc.restart();
    }
}
