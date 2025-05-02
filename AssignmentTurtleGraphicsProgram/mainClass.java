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

    private static final File cmdHistory = new File("cmd_history.txt");

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
            System.out.println("Image could not be loaded");
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

        String[] part = command.split("\\s+", 2);
        String inputCommand = part[0].toLowerCase();
        int distance = 90;
        String parameter = part.length > 1 ? part[1] : "";

        switch (inputCommand) {
            case "about":
                about();
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "move":
                if (parameter.isEmpty()) {
                    System.out.println("TERMINAL Missing Parameter, using Default = 90");
                    forward(90);
                    break;
                }
                try {
                    distance = Integer.parseInt(parameter);

                    if (distance == 0) {
                        System.out.println("TERMINAL Missing parameter: Using default = 90");
                        forward(90);
                    } else if (distance > 200 || distance < -200) {
                        System.out.println("TERMINAL Exceeded Parameter limit");
                    } else {
                        forward(distance);
                    }
                    cmdHistoryFunction.saveCmdToLog(inputCommand);
                } catch (NumberFormatException e) {
                    System.out.println("TERMINAL Invalid parameter");
                }
                break;

            case "pendown", "pen down":
                setPenState(true);
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "penup", "pen up":
                setPenState(false);
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "forward":
                if (!parameter.isEmpty()) {
                    System.out.println("TERMINAL No parameter specified, using Default 90");
                    forward(90);
                    break;

                }
                try {
                    distance = Integer.parseInt(parameter);

                    if (distance == 0) {
                        System.out.println("TERMINAL Missing parameter: Using default = 90");
                        forward(90);
                    } else if (distance > 200 || distance < -200) {
                        System.out.println("TERMINAL Exceeded Parameter limit");
                    } else{
                        forward(distance);
                    }
                    cmdHistoryFunction.saveCmdToLog(inputCommand);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid parameter");
                }
                break;


            case "reverse":
                if (!parameter.isEmpty()) {
                    System.out.println("TERMINAL No parameter specified, using Default 90");
                    forward(-90);
                    break;
                }
                try {
                    distance = Integer.parseInt(parameter);

                    if (distance == 0) {
                        System.out.println("TERMINAL Missing parameter: Using default = 90");
                        forward(-90);
                    } else if (distance > 200 || distance < -200) {
                        System.out.println("TERMINAL Exceeded Parameter limit");
                    } else {
                        forward(-distance);
                    }
                    cmdHistoryFunction.saveCmdToLog(inputCommand);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid parameter");
                }
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "turn right", "right":
                right();
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "turn left", "left":
                left();
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "black":
                setPenColour(Color.black);
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "green":
                setPenColour(Color.green);
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "red":
                setPenColour(Color.red);
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "white":
                setPenColour(Color.WHITE);
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;


            case "reset":
                reset();
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "clear":
                clear();
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case " ":
                about();
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;

            case "save", "copy", "download": //This code saves the image the turtle has drawn
                if (mainClass.canva != null) {
                    int width = mainClass.canva.getWidth();
                    int height = mainClass.canva.getHeight();

                    if (width > 0 && height > 0) {
                        try {
                            saveFunction.saveImage(mainClass.canva, "TGFile.png");
                            System.out.println("Image Saved");
                        } catch (IOException e) {
                            System.out.println("Failed to save image");
                        }

                    } else {
                        System.out.println("Image Not Saved, DEBUG INFO: " + width + "x" + height);
                    }
                    cmdHistoryFunction.saveCmdToLog(inputCommand);
                }
                break;
            //String parameter is the text typed into the LBUGraphics JTextfield
            //lands here if return was pressed or "ok" JButton clicked

            //TO DO

            case "load":
                if (!parameter.isEmpty()) {
                    BufferedImage loadedImage = loadImageFunction.loadImageFunction(parameter);
                    if (loadedImage != null) {
                        backgroundImage = loadedImage;
                        repaint();
                    }

                } else {
                    System.out.println("Add a file name e.g. turtle1.PNG");
                }
                cmdHistoryFunction.saveCmdToLog(command);
                break;

            case "replay":
                new File("history").mkdir();
                cmdHistoryFunction.saveCmdToLog(command);
                try {
                    replayCmdLog.replay(cmd -> mainClass.canva.processCommand(cmd));
                } catch (IOException e) {
                    System.out.println("Failed to replay the command: ");
                }

                break;

            default:
                System.out.println("TERMINAL " + "Unknown command: " + command + " Please try again.");
                cmdHistoryFunction.saveCmdToLog(inputCommand);
                break;
        }
    }

}