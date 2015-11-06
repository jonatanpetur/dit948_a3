import javax.swing.*;
import java.awt.event.*;

public class QuitListener implements ActionListener {
    QuitMenuCity qmc;

    public QuitListener(QuitMenuCity qmc) {
        this.qmc = qmc;
    }

    public void actionPerformed(ActionEvent ae) {
        qmc.quit();
    }
}
