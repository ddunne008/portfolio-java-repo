import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class saveFunction {
    public static void saveImage(JFrame frame, String filename) throws IOException {

        int width = frame.getWidth();
        int height = frame.getHeight();

        if (width <= 0 || height <= 0) {
            System.out.println("Width and Height must be more than 0");
        }

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        frame.paint(graphics);
        graphics.dispose();

        ImageIO.write(image, "png", new File(filename));
        System.out.println("Saved image as " + filename);

        System.out.println("Width: " + frame.getWidth() + ", Height: " + frame.getHeight());



    }
}
