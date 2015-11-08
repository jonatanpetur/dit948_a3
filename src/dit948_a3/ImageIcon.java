package dit948_a3;

import becker.robots.icons.Icon;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by jpp on 11/8/15.
 */
public class ImageIcon extends Icon {
    @Override
    protected void paintIcon(Graphics graphics) {
        try
        {
            File f = new File("images/prize.jpeg");
           // System.err.println(f.getAbsolutePath());
            BufferedImage bi = ImageIO.read(f);
            Image img = bi.getScaledInstance(100,100,Image.SCALE_SMOOTH);
            BufferedImage bi2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);

            graphics.drawImage(img, 0, 0, null);
        }
        catch(IOException ioe)
        {
            System.err.println("asdf");
            graphics.setColor(Color.blue);
            //graphics.fill(new Rectangle2D.Double(0.0, 0.0, 1.0, 1.0));
        }

        super.paintIcon(graphics);
    }
}
