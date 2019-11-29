import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
    //https://stackoverflow.com/questions/6811064/jlabel-displaying-countdown-java


    public class test extends JPanel {

        private static final String INTRO = "intro";
        private static final String USED_BEFORE = "used before";
        private JLabel countDownLabel = new JLabel("", SwingConstants.CENTER);

        public test() {
            JPanel introSouthPanel = new JPanel();
            introSouthPanel.add(new JLabel("Status:"));
            introSouthPanel.add(countDownLabel);

            JPanel introPanel = new JPanel();
            introPanel.setPreferredSize(new Dimension(400, 300));
            introPanel.setLayout(new BorderLayout());
            introPanel.add(new JLabel("WELCOME", SwingConstants.CENTER), BorderLayout.CENTER);
            introPanel.add(introSouthPanel, BorderLayout.SOUTH);




            add(introPanel, INTRO);//add the layout

            //new HurdlerTimer(this).start();
        }

        private static void createAndShowUI() {
            JFrame frame = new JFrame("Welcome");
            frame.getContentPane().add(new test());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    createAndShowUI();
                }
            });
        }

        public void setCountDownLabelText(String text) {//Setting count down
            countDownLabel.setText(text);
        }

       /* public void showNextPanel() {
            cardLayout.next(this);
        }*/
    }

/*class HurdlerTimer {
    private static final int TIMER_PERIOD = 1000;
    protected static final int MAX_COUNT = 1;
    private test welcome; // holds a reference to the Welcome class
    private int count;

    public HurdlerTimer(test welcome) {
        this.welcome = welcome; // initializes the reference to the Welcome class.
        String text = "(" + (MAX_COUNT - count) + ") seconds left";
        welcome.setCountDownLabelText(text);
    }

    public void start() {
        new Timer(TIMER_PERIOD, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < MAX_COUNT) {
                    count++;
                    String text = "(" + (MAX_COUNT - count) + ") seconds left";
                    welcome.setCountDownLabelText(text); // uses the reference to Welcome
                } else {
                    ((Timer) e.getSource()).stop();
                    Game newGame = new Game();
                }
            }
        }).start();
    }

}*/





