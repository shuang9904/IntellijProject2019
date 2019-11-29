import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//This is the main game
public class Game {
    private JPanel Game;
    private JButton Water;
    private JButton Nature;
    private JButton Fire;
    private JLabel countDownLabel;
    private JLabel computerScore;
    private int myChoice;
    private int computerChoice;
    private static int gamePlayed=0;

    public Game()  {
        //gamePlayed = 0; //store the times of game played
        JFrame frame = new JFrame("The Elements");
        frame.setContentPane(this.Game);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);
        //Game.add(countDownLabel);
        new HurdlerTimer(this).start();

                  //if the times of game played is more than 5 times , execute the following code
                   if (gamePlayed >= 5) {
                       GameResult();
                       MainMenu mainMenu = new MainMenu();
                   }

                   else{
                       Water.addActionListener( new ActionListener()
                       {
                           @Override
                           //Water counter Fire , Nature counter water
                           public void actionPerformed( ActionEvent e )
                           {
                               //check if game is over
                               int select;
                               select = JOptionPane.showConfirmDialog( null, "You're using the power of water", "Water", JOptionPane.YES_NO_OPTION );

                               if ( select == JOptionPane.YES_OPTION )
                               {
                                   myChoice = 0;
                                   computerChoice = computerPlays();
                                   conditionsAndDisplayResults( myChoice, computerChoice );
                                   System.out.println(gamePlayed);
                               }
                           }
                       } );


                       Fire.addActionListener( new ActionListener()
                       {
                           @Override
                           public void actionPerformed( ActionEvent e )
                           {
                               int select = JOptionPane.showConfirmDialog( null, "You're using the power of fire", "Fire", JOptionPane.YES_NO_OPTION );

                               if ( select == JOptionPane.YES_OPTION )
                               {
                                   myChoice = 1;
                                   computerChoice = computerPlays();
                                   conditionsAndDisplayResults( myChoice, computerChoice );

                               }
                           }
                       } );

                      Nature.addActionListener( new ActionListener()
                       {
                           @Override
                           public void actionPerformed( ActionEvent e )
                           {
                               int select = JOptionPane.showConfirmDialog( null, "You're using the power of nature", "Nature", JOptionPane.YES_NO_OPTION );

                               if ( select == JOptionPane.YES_OPTION )
                               {
                                   myChoice = 2;
                                   computerChoice = computerPlays();
                                   conditionsAndDisplayResults( myChoice, computerChoice );

                               }


                           }
                       } );}



                   /*else{ //else which when the times of game played is more than 5 times , execute the following code

                       GameResult();
                       MainMenu mainMenu = new MainMenu();

                   }*/
    }

           //Setting count down
           public void setCountDownLabelText(String text) {
               countDownLabel.setText(text);
           }

    public void conditionsAndDisplayResults(int myChoice, int computerChoice){
      //compares your choice and comp choice to see who wins
        //0 = water , 1 = fire , 2 = nature
        //0 counters 1 , 1 counters 2 , 2 counters 0
        if(myChoice == computerChoice)
        {
            JOptionPane.showMessageDialog(null, "Tie! You earned 0 point from this fight !");
            gamePlayed+=0;
        }
        //My choice is water
        else if(myChoice == 0 && computerChoice == 1)
        {
            JOptionPane.showMessageDialog(null, "Win ! You earned 1 point from this fight ! ");
            gamePlayed+=1;

        }
        else if(myChoice == 0 && computerChoice == 2)
        {
            JOptionPane.showMessageDialog(null, "Lose ! Computer earned 1 point from this fight !");
            gamePlayed+=0;
        }
        //My choice is Fire
        else if(myChoice == 1 && computerChoice == 0)
        {
            JOptionPane.showMessageDialog(null, "Lose ! Computer earned 1 point from this fight !");
            gamePlayed+=0;
        }
        else if(myChoice == 1 && computerChoice == 2)
        {
            JOptionPane.showMessageDialog(null, "Win ! You earned 1 point from this fight ! ");
            gamePlayed+=1;
        }
        //My choice is Nature
        else if(myChoice == 2 && computerChoice == 1)
        {
            JOptionPane.showMessageDialog(null, "Lose ! Computer earned 1 point from this fight !");
            gamePlayed+=0;
        }
        else if(myChoice == 2 && computerChoice == 0)
        {
            JOptionPane.showMessageDialog(null, "Win ! You earned 1 point from this fight ! ");
            gamePlayed+=1;
        }
    }
    static int computerPlays() {
               int choice;

               choice = (int)(Math.random() * 3);
               if(choice == 0)
                   JOptionPane.showMessageDialog(null,"Computer chose Water");
               if(choice == 1)
                   JOptionPane.showMessageDialog(null,"Computer chose Fire");
               if(choice == 2)
                   JOptionPane.showMessageDialog(null,"Computer chose Nature");

               return choice;

           }

     //Display when the times of game played reached 5 times
           public void GameResult(){
             JOptionPane.showMessageDialog(null,"You win this time");
             System.exit(0);
           }

       }
//Timer
class HurdlerTimer {
    private static final int TIMER_PERIOD = 1000;
    protected static final int MAX_COUNT = 60;
    private Game welcome; // holds a reference to the Welcome class
    private int count;

    public HurdlerTimer(Game welcome) {
        this.welcome = welcome; // initializes the reference to the Welcome class.
        String text = "Time: " + (MAX_COUNT - count) + " sec";
        welcome.setCountDownLabelText(text);
    }

    public void start() {
        new Timer(TIMER_PERIOD, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < MAX_COUNT) {
                    count++;
                    String text = "Time: " + (MAX_COUNT - count) + " sec";
                    welcome.setCountDownLabelText(text); // uses the reference to Welcome
                } else {
                    ((Timer) e.getSource()).stop();
                    Game newGame = new Game();
                }
            }
        }).start();
    }

}




