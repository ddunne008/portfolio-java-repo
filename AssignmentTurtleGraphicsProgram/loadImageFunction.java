import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class loadImageFunction {

    public static BufferedImage loadImageFunction(String filename) {
        String resourcePath = "C:/Users/ddunn/IdeaProjects/oop-portfolio-2025-ddunne008/images" + filename;
        try {
            URL resource = loadImageFunction.class.getResource("/" + resourcePath);

            if (resource == null) {
                System.out.println("The resource is not found");
                return null;
            }
            BufferedImage background = ImageIO.read(resource);
            System.out.println("Image Loaded");
            return background;
        } catch (IOException e) {
            System.out.println("Error loading image");
            e.printStackTrace();
            return null;
        }
    }
}
