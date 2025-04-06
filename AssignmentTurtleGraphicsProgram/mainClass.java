import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import uk.ac.leedsbeckett.oop.LBUGraphics;

public class mainClass extends LBUGraphics {
    public static mainClass canva;
    private String path;


    public static void main(String[] args) {
        new mainClass(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
    }

    public mainClass() {
        canva = this;

        JFrame MainFrame = new JFrame("Turtle");                //create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                                               //set the frame to a size we can see
        MainFrame.setVisible(true);                             //now display it
        about();                                                                //call the LBUGraphics about method to display version information.
    }


    BufferedImage backgroundImage;

    public void loadBackground(String path) {
        try {
            backgroundImage = ImageIO.read(new File(path));
            repaint();
        } catch (IOException i) {
            System.out.println("Image could not be loaded" + i.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
        }
    }

    public void processCommand(String command)      //this method must be provided because LBUGraphics will call it when it's JTextField is used
    {

        String[] part = command.split(" ");
        String inputCommand = part[0];
        int distance = 50;

        if (part.length > 1) {
            try {
                distance = Integer.parseInt(part[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid distance, please try again");
                return;
            }

        }

        switch (inputCommand) {
            case "about":
                about();
                break;

            case "pendown", "pen down":
                setPenState(true);
                break;

            case "penup", "pen up":
                setPenState(false);
                break;

            case "forward":
                if (distance == 0)
                    forward(90);
                else if (distance > 1)
                    forward(distance);
                break;


            case "turn right", "right":
                right();
                break;

            case "turn left", "left":
                left();
                break;

            case "black":
                setPenColour(Color.black);
                break;

            case "green":
                setPenColour(Color.green);
                break;

            case "red":
                setPenColour(Color.red);
                break;

            case "white":
                setPenColour(Color.WHITE);
                break;


            case "reset":
                reset();
                break;

            case "clear":
                clear();
                break;

            case " ":
                about();
                break;

            case "save", "copy", "download": //This code saves the image the turtle has drawn
                if (mainClass.canva != null) {
                    int width = mainClass.canva.getWidth();
                    int height = mainClass.canva.getHeight();

                    if (width > 0 && height > 0) {
                        try {
                            saveFunction.saveImage(mainClass.canva, "TGFile.png");
                            System.out.println("Image Saved");
                        } catch (IOException i) {
                            System.out.println("Failed to save image: " + i.getMessage());
                        }

                    } else {
                        System.out.println("Image Not Saved, DEBUG INFO: " + width + "x" + height);

                        break;

                    }

                        //String parameter is the text typed into the LBUGraphics JTextfield
                        //lands here if return was pressed or "ok" JButton clicked

                        //TO DO

                }
                break;

                case "load", "load image":
                    if (part.length > 1) {
                        String path = part[1];
                        mainClass.canva.loadBackground(path);
                    } else {
                        System.out.println("Add a file name e.g. turtle1.PNG");
                    }
                    break;
                }

        default:
            System.out.println("Unknown command: " + command + " Please try again.");
        }
    }

