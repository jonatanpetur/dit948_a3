import javax.swing.*;
import java.awt.event.*;

public class SettingsListener implements ActionListener {
    ActiveMenuCity amc;
    int bombs;

    public SettingsListener(ActiveMenuCity amc, int bombs) {
        this.amc = amc;
        this.bombs = bombs;
    }

    public void actionPerformed(ActionEvent ae) {
        amc.changeNumBombs(bombs);
    }
}