import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;import java.util.Random;

public class Game {
    private JPanel Game;
    private JProgressBar progressBar1;
    private JButton Water;
    private JButton Nature;
    private JButton Fire;
    Random random = new Random();


    public Game() {
        JFrame frame = new JFrame("The Elements");
        ///// Game IS ALWAYS NULL WITHOUT THE NEXT LINE!!!

        frame.setDefaultCloseOperation();
        frame.setContentPane(this.Game);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to exit the program?", "Exit Program Message Box",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });

        Water.addActionListener(new ActionListener() {
            @Override
            //Water counter Fire , Nature counter water
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showConfirmDialog(null,
                        "You're using the power of water", "Water",
                        JOptionPane.YES_NO_OPTION);

            }
        });
        Fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,
                        "You're using the power of fire","Water",
                        JOptionPane.YES_NO_OPTION);
            }
        });
        Nature.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 JOptionPane.showConfirmDialog(null,
                         "You're using the power of nature","Water",
                         JOptionPane.YES_NO_OPTION);

            }
        });
    Game.addContainerListener(new ContainerAdapter() { } );}
    static void computerPlays() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 1 + 1;
        int randomInt = (int) randomDouble;

    }
    public void conditions(int Water, int Fire , int Nature){
         Water=0 ;
         Fire =1 ;
         Nature =2;

        if( Water <= Fire ) //If choose Water , computer choose Fire , you win
        {
            System.out.print("Water win");
        }


    }
}
