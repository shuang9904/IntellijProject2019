import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login {
    public static void main(String[] args) {
        String userName;
        int option;

        //This will ask user to input the username
        userName = JOptionPane.showInputDialog(null,"Please enter your name","Welcome", JOptionPane.INFORMATION_MESSAGE);

        while(userName.length() < 3) //This is to make sure the username that user enter is more than 3 characters
        {
            userName = JOptionPane.showInputDialog(null,"Please enter your name with more than 3 characters","Welcome", JOptionPane.ERROR_MESSAGE);
        }

        //Display option
        option =JOptionPane.showOptionDialog(null, "Welcome " + userName + "\n\nWould you like to have a tutorial about this game?",
                "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);


        //Ok to continue to the tutorial
        if(option == JOptionPane.OK_OPTION)
        {
         MainMenu mainMenuGUI = new MainMenu();
         mainMenuGUI.tutorial();
        }

        else //If select cancel will proceed to the Main menu
        {
         MainMenu mainMenu = new MainMenu();

        }




    }

}

 class tutorial{

}
