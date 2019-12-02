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
    private JLabel Player;
    private JLabel Computer;
    private int myChoice;
    private int computerChoice;
    private static int playerScore=0; //Store the score you earned
    private static int computerScore =0;//Store the score computer earned



    //Display when the times of game played reached 5 times
    public void GameResult(){
        JOptionPane.showMessageDialog(null,"You win this time");

    }
    public Game()  {

        JFrame gameFrame = new JFrame("The Elements");
        gameFrame.setContentPane(this.Game);
        gameFrame.setMinimumSize(new Dimension(500, 500));
        gameFrame.pack();
        gameFrame.setVisible(true);


        new HurdlerTimer(this).start();



                  //if the times of game played is more than 5 times , execute the following code
                   if (playerScore >= 5|| computerScore >=5) {
                       GameResult();
                       gameFrame.dispose();
                        new MainMenu();
                   }

                   else if(playerScore <= 5|| computerScore <=5)
                       {
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
                                   System.out.println(playerScore);
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





    }

               //Setting count down
               public void setCountDownLabelText(String text)
               {
                   countDownLabel.setText(text);
               }
               public void setPlayerLabelText(String text)
               {
                    Player.add(new JLabel("Player:" + playerScore));
                }
               public void setComputerLabelText(String text)
               {
                  Computer.add(new JLabel("Computer" + computerScore));
               }




    public void conditionsAndDisplayResults(int myChoice, int computerChoice){
      //compares your choice and comp choice to see who wins
        //0 = water , 1 = fire , 2 = nature
        //0 counters 1 , 1 counters 2 , 2 counters 0
        if(myChoice == computerChoice)
        {
            JOptionPane.showMessageDialog(null, "Tie! You earned 0 point from this fight !");
            playerScore+=0;
            computerScore +=0;
        }
        //My choice is water
        else if(myChoice == 0 && computerChoice == 1)
        {
            JOptionPane.showMessageDialog(null, "Win ! You earned 1 point from this fight ! ");
            playerScore+=1;
            computerScore +=0;

        }
        else if(myChoice == 0 && computerChoice == 2)
        {
            JOptionPane.showMessageDialog(null, "Lose ! Computer earned 1 point from this fight !");
            playerScore+=0;
            computerScore +=1;
        }
        //My choice is Fire
        else if(myChoice == 1 && computerChoice == 0)
        {
            JOptionPane.showMessageDialog(null, "Lose ! Computer earned 1 point from this fight !");
            playerScore+=0;
            computerScore +=1;
        }
        else if(myChoice == 1 && computerChoice == 2)
        {
            JOptionPane.showMessageDialog(null, "Win ! You earned 1 point from this fight ! ");
            playerScore+=1;
            computerScore +=0;
        }
        //My choice is Nature
        else if(myChoice == 2 && computerChoice == 1)
        {
            JOptionPane.showMessageDialog(null, "Lose ! Computer earned 1 point from this fight !");
            playerScore+=0;
            computerScore +=1;
        }
        else if(myChoice == 2 && computerChoice == 0)
        {
            JOptionPane.showMessageDialog(null, "Win ! You earned 1 point from this fight ! ");
            playerScore+=1;
            computerScore +=0;
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



       }
//Timer
class HurdlerTimer {
    private static final int TIMER_PERIOD = 1000;
    protected static final int MAX_COUNT = 60;
    private Game timer; // holds a reference to the timer class
    private int count;

    public HurdlerTimer(Game timer) {
        this.timer = timer; // initializes the reference to the timer class.
        String text = "Time: " + (MAX_COUNT - count) + " sec";
        timer.setCountDownLabelText(text);
    }

    public void start() {

        new Timer(TIMER_PERIOD, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < MAX_COUNT) {
                    count++;
                    String text = "Time: " + (MAX_COUNT - count) + " sec";
                    timer.setCountDownLabelText(text); // uses the reference to timer
                } else {
                    ((Timer) e.getSource()).stop();
                    JOptionPane.showMessageDialog(null,"Going back to Main Menu","Error",JOptionPane.ERROR_MESSAGE );
                    new MainMenu();


                    //Close the Game GUI after the timer stops
                }
            }
        }).start();
    }

}




