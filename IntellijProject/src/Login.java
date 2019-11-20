import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login {
    public static void main(String[] args) {
        String userName;
        int option;

        //This will ask user to input the username
        userName = JOptionPane.showInputDialog(null,"Please enter your name","Welcome", JOptionPane.INFORMATION_MESSAGE);

        //Display option
        option =JOptionPane.showOptionDialog(null, "Welcome " + userName + "\n\nWould you like to have a tutorial about this game?",
                "Welcome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);


        //Ok to continue to the tutorial
        if(option == JOptionPane.OK_OPTION)
        {
        }

        else //If select cancel will proceed to the Main menu
        {

        }




    }

}
