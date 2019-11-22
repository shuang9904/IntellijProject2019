import javax.swing.*;
import java.awt.*;

public class GameRecord {
    private JPanel gameRecord;
    private JLabel gameRecordTitle;


public GameRecord(){
    JFrame frame = new JFrame("Game Record");
    ///// Game IS ALWAYS NULL WITHOUT THE NEXT LINE!!!
    frame.setContentPane(this.gameRecord);
    frame.setMinimumSize(new Dimension(500, 500));
    frame.pack();
    frame.setVisible(true);
}
}