import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class MainMenu {
    private JButton exitButton;
    private JPanel mainMenu;
    private JButton startButton;
    private JButton gameRecordButton;

    public  MainMenu() {
        JFrame frame = new JFrame("Main Menu");
        frame.setContentPane(this.mainMenu);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //The X button won't close the program
        frame.setMinimumSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);

        //actions when clicking exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int exitButton = JOptionPane.YES_NO_OPTION;
              //can only exit the program when click on exit button
                exitButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Warning", JOptionPane.YES_NO_OPTION);
                if (exitButton == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }

            }
        });

        //Start the game
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                 new Game();
            }
        });

        //Check the record
        gameRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new GameRecord();
            }
        });


    }
    //The tutorial
    public void tutorial(){
      JOptionPane.showMessageDialog(null,
              "In this game , we have 3 elements \n Fire     Water    Nature\n\n You have to pick 1 from the elements "+
                      "to fight with a random elements chose by the enemy to win\n\nThe condition to win \n-The Fire will perish Nature" +
                      "\n-The Water will perish Fire\n-The Nature will perish Water",
              "Tutorial",JOptionPane.INFORMATION_MESSAGE);
    }
}
