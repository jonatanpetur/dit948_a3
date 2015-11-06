import javax.swing.JFrame;

public class EmptyFrame {
    public static void main(String[] args) {
        // Uncomment the commented lines one by one
        JFrame emptyFrame = new JFrame("This frame is empty!");
        emptyFrame.setVisible(true);
        emptyFrame.setSize(100, 200);
        emptyFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        emptyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
