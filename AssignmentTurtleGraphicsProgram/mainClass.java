import java.awt.*;
import java.io.IOException;
import javax.swing.*;

import uk.ac.leedsbeckett.oop.LBUGraphics;

public class mainClass extends LBUGraphics
{
    public static JFrame MainFrame;


    public static void main(String[] args)
    {
        new mainClass(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
    }

    public mainClass()
    {
        JFrame MainFrame = new JFrame();                //create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout());  //not strictly necessary
        MainFrame.add(this);                                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
        MainFrame.pack();                                               //set the frame to a size we can see
        MainFrame.setVisible(true);                             //now display it
        about();                                                                //call the LBUGraphics about method to display version information.
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

        switch(inputCommand) {
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

            case "save":
                int width = mainClass.MainFrame.getWidth();
                int height = mainClass.MainFrame.getHeight();

                if (width > 0 && height > 0) {
                    try {
                        saveFunction.saveImage(mainClass.MainFrame, "TGFile.png");
                        System.out.println("Image Saved");
                    } catch (IOException e) {
                        System.out.println("Failed to save image: " + e.getMessage());
                    }

                } else {
                    System.out.println("Image Not Saved, DEBUG INFO: " + width + "x" + height);

                break;
            }

            default:
                System.out.println("Unknown command: " + command + " Please try again.");
                break;





        }



        //String parameter is the text typed into the LBUGraphics JTextfield
        //lands here if return was pressed or "ok" JButton clicked

        //TO DO
    }
}
