import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class saveFunction {
    public static void saveImage(JFrame frame, String filename) throws IOException {

        BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        frame.paint(g);
        g.dispose();

        ImageIO.write(image, "png", new File(filename));
        System.out.println("Saved image as " + filename);

        System.out.println("Width: " + frame.getWidth() + ", Height: " + frame.getHeight());



    }
}
