import javax.swing.*;

import java.awt.*;

import becker.robots.*;


public class LayoutGallery extends CityInFrame {

    JButton startStop;
    JPanel panel;
    //    CityView view;

    public LayoutGallery() {
        super();
        addPanel(); // the other components rely on it
    }

    public void addCity() { // we override addCity and add robots while we're at it

        City.showFrame(false);

        bombCity = new BombCity(size, bombs);

        ThreadedRobot rob = new ThreadedRobot(bombCity, 5, 5, Direction.NORTH);
        ThreadedRobot bor = new ThreadedRobot(bombCity, 5, 5, Direction.NORTH);
        bor.setColor(Color.magenta);

        Thread robThread = new Thread(rob);
        Thread borThread = new Thread(bor);

        robThread.start();
        borThread.start();


        roboComps = new RobotUIComponents(bombCity, 0, 0, size, size);

        CityView view = roboComps.getCityView();
        
        view = roboComps.getCityView();

        panel.add(view);

        frame.pack();

    }

    public void addStartStop() {
        startStop = roboComps.getStartStopButton();

        panel.add(startStop);

        frame.pack();
    }        

    public void addPanel() {
        // panel = new JPanel(new FlowLayout()); // FlowLayout is the default

        //panel.add(view);
        //panel.add(startStop);

        // addCity();
        // startStop = roboComps.getStartStopButton();
        //        panel = new JPanel(new BorderLayout());

        // panel.add(view, BorderLayout.NORTH);

        // panel.add(startStop, BorderLayout.SOUTH);

        // panel = new JPanel(new GridLayout(2, 1)); // two rows, one column

        // panel.add(view);
        // panel.add(startStop);

        panel = new JPanel(null);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setContentPane(panel);

        frame.pack();

    }


        
    public static void main(String[] args) {

        LayoutGallery framedCity = new LayoutGallery();

        framedCity.addCity();
        framedCity.addStartStop();
    }

}
