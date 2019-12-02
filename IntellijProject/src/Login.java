import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is the main java
//Loads the Main menu Form
//Loads the Game GUI
//Loads the Game Record GUI


public class Login {
    public static void main(String[] args) {
        String userName;
        int tutorial;

        //ask user to input the username
        userName = JOptionPane.showInputDialog(null,
                "Please enter your username","Welcome",
                JOptionPane.INFORMATION_MESSAGE);
        //make sure the username that user enter is more than 3 characters
        //make sure the username has to be unique no duplicate
        while(userName.length() < 3 || userName.length()>25)
        {
            userName = JOptionPane.showInputDialog(null,
                    "Your username has to be more than 3 characters and less than 25 characters","Username Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        //Display tutorial
        tutorial =JOptionPane.showOptionDialog(null,
                "Welcome " + userName + "\n\nWould you like to have a tutorial about this game?", "Welcome",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);


        //Ok to continue to the tutorial
        if(tutorial == JOptionPane.OK_OPTION)
        {
            MainMenu callTutorial = new MainMenu();
            callTutorial.tutorial();



        }

        else //If select cancel will proceed to the Main menu
        {
         new MainMenu();
        }




    }

}
