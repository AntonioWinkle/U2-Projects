import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {
JFrame window;
static JLabel output;
static JTextField inputField1;
static JTextField inputField2;
static JTextField inputField3;
static JTextField inputField4;
    public RPGCharacterGUI(){
        JPanel panel = new JPanel();
        JButton button = new JButton("Calculate the stats");
        JLabel inputLabel1 = new JLabel("Enter Strength Stat: ");
        JLabel inputLabel2 = new JLabel("Enter Mind Stat: ");
        JLabel inputLabel3 = new JLabel("Enter Nimble Stat: ");
        JLabel inputLabel4 = new JLabel("Enter Soul Stat: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        inputField3 = new JTextField(10);
        inputField4 = new JTextField(10);
        output = new JLabel("Your Rpg character's stats are: ");
        window = new JFrame("RPGCharacter GUI");

        window.setSize(500,450);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new actionListener());
        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);
        panel.add(inputLabel3);
        panel.add(inputField3);
        panel.add(inputLabel4);
        panel.add(inputField4);
        panel.add(button);
        panel.add(output);

        window.add(panel);
        window.setVisible(true);
    }


    public static class actionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int strengthStat = Integer.parseInt(inputField1.getText());
            int mindStat = Integer.parseInt(inputField2.getText());
            int nimbleStat = Integer.parseInt(inputField3.getText());
            int soulStat = Integer.parseInt(inputField4.getText());

            strengthStat = strengthStat / 10;
            mindStat = mindStat / 10;
            nimbleStat = nimbleStat / 10;
            soulStat = soulStat / 10;

            int level = strengthStat + mindStat + nimbleStat + soulStat % 4;

            output.setText("Level: " + level + "Strength: " + strengthStat + " Mind: " + mindStat + " Nimble: " + nimbleStat + " Soul " + soulStat);
        }
    }
}
