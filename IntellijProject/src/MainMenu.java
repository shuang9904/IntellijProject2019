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
    private JButton historyButton;

    public MainMenu() {
        JFrame frame = new JFrame("Main Menu");
        ///// mainMenu IS ALWAYS NULL WITHOUT THE NEXT LINE!!!
        frame.setContentPane(this.mainMenu);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);

        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 int exitButton = JOptionPane.YES_NO_OPTION;

                exitButton = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Warning", JOptionPane.YES_NO_OPTION);
                if (exitButton == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }

            }
        });
    }

    public void tutorial(){
      JOptionPane.showMessageDialog(null,"In this game , we have 3 elements \n Fire   Water    Nature\n\n You have to pick 1 from the elements "+
                      "to fight with a random elements choosen by the enemy to win\n\nThe condition to win \n- Fire perish Nature\n-Water perish Fire\n-Nature perish Water",
              "Tutorial",JOptionPane.INFORMATION_MESSAGE);
    }
}
