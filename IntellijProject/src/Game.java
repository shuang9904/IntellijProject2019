import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.lang.reflect.Array;
import java.util.Random;

public class Game {
    private JPanel Game;
    private JProgressBar progressBar1;
    private JButton Water;
    private JButton Nature;
    private JButton Fire;
    private int[] choices = {0,1,2};
    private int myChoice;
    private int computerChoice;


    public Game() {
        JFrame frame = new JFrame("The Elements");
        ///// Game IS ALWAYS NULL WITHOUT THE NEXT LINE!!!


        frame.setContentPane(this.Game);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);


        Water.addActionListener(new ActionListener() {
            @Override
            //Water counter Fire , Nature counter water
            public void actionPerformed(ActionEvent e) {
                int select;
                select= JOptionPane.showConfirmDialog(null,
                        "You're using the power of water", "Water",
                        JOptionPane.YES_NO_OPTION);

                if(select == JOptionPane.YES_OPTION)
                {
                    myChoice = 0;
                    computerChoice = computerPlays();
                    JOptionPane.showMessageDialog(null, computerChoice);
                    conditionsDisplayResults(myChoice, computerChoice);
                }

            }
        });
        Fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int select = JOptionPane.showConfirmDialog(null,
                        "You're using the power of fire","Fire",
                        JOptionPane.YES_NO_OPTION);

                if(select == JOptionPane.YES_OPTION)
                {
                    myChoice = 1;
                    computerChoice = computerPlays();
                    JOptionPane.showMessageDialog(null, computerChoice);
                    conditionsDisplayResults(myChoice, computerChoice);
                }
            }
        });
        Nature.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 int select = JOptionPane.showConfirmDialog(null,
                         "You're using the power of nature","Nature",
                         JOptionPane.YES_NO_OPTION);

                if(select == JOptionPane.YES_OPTION)
                {
                    myChoice = 2;
                    computerChoice = computerPlays();
                    JOptionPane.showMessageDialog(null, "Computer chose"+computerChoice );
                    conditionsDisplayResults(myChoice, computerChoice);
                }

            }
        });
    Game.addContainerListener(new ContainerAdapter() { } );}

    //computer chooses
    static String computerPlays() {
        int choice;
        String choiceAsString;
        choiceAsString = "";

        choice = (int)(Math.random() * 3);

        JOptionPane.showMessageDialog(null,choiceAsString);

        return choiceAsString;

    }

    //compares your choice and comp choice to see who wins
    //0 = water , 1 = fire , 2 = nature
    //0 counters 1 , 1 counters 2 , 2 counters 0
    public void conditionsDisplayResults(int myChoice, int computerChoice){
//

        if(myChoice == computerChoice)
        {
            JOptionPane.showMessageDialog(null, "Tie");
        }
        //My choice is water
        else if(myChoice == 0 && computerChoice == 1)
        {
            JOptionPane.showMessageDialog(null, "Win");
        }
        else if(myChoice == 0 && computerChoice == 2)
        {
            JOptionPane.showMessageDialog(null, "Lose");
        }
        //My choice is Fire
        else if(myChoice == 1 && computerChoice == 0)
        {
            JOptionPane.showMessageDialog(null, "Lose");
        }
        else if(myChoice == 1 && computerChoice == 2)
        {
            JOptionPane.showMessageDialog(null, "Win");
        }
        //My choice is Nature
        else if(myChoice == 2 && computerChoice == 1)
        {
            JOptionPane.showMessageDialog(null, "Lose");
        }
        else if(myChoice == 2 && computerChoice == 0)
        {
            JOptionPane.showMessageDialog(null, "Win");
        }



    }
}
