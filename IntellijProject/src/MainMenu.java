import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class MainMenu {
    private JButton exitButton;
    private JPanel MainMenu;
    private JButton startButton;

    public MainMenu() {
        exitButton.addActionListener(new ActionListener() {



            @Override
            public void actionPerformed(ActionEvent e) {
                int exitButton = JOptionPane.YES_NO_OPTION;

                exitButton = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Warning", JOptionPane.YES_NO_OPTION);
                if(exitButton == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
                else
                {

                }

            }
        });
    }
    //Main Menu GUI setup
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Menu");
        frame.setContentPane(new MainMenu().MainMenu);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));
        frame.pack();
        frame.setVisible(true);
    }

}
