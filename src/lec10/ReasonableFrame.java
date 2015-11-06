import javax.swing.JFrame;

public class ReasonableFrame extends JFrame {

    public ReasonableFrame(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ReasonableFrame frame = new ReasonableFrame("I am reasonable!");
        frame.setSize(550, 500);
    }
}
