import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;


public class saveFunction {
    public static void saveImage(JComponent comp, String filename) throws IOException {

        int width = comp.getWidth();
        int height = comp.getHeight();

        if (width <= 0 || height <= 0) {
            System.out.println("The width and height are less than zero");
        }

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = img.getGraphics();
        comp.paint(graphics);
        graphics.dispose();

        File dir = new File("images"); // This code created a directory for images so it can be saved here
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(dir, filename);
        ImageIO.write(img, "png", file);

        ImageIO.write(img, "png", new File(filename));
        System.out.println("Saved image as " + filename);






    }
}
