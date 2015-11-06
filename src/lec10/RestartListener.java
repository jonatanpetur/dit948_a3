import javax.swing.*;
import java.awt.event.*;

public class RestartListener implements ActionListener {
    RestartMenuCity rmc;

    public RestartListener(RestartMenuCity rmc) {
        this.rmc = rmc;
    }

    public void actionPerformed(ActionEvent ae) {
        rmc.restart();
    }
}
