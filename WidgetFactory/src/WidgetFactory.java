import javax.swing.*;
import java.text.DecimalFormat;

/*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */
public class WidgetFactory {

    DecimalFormat round = new DecimalFormat("#,000.00");

    public static void main(String[] args) {

        int widgetNumber = Integer.parseInt(JOptionPane.showInputDialog("Number of widgets: "));

        JOptionPane.showMessageDialog(null,"Number of Widgets: " + widgetNumber);
        JOptionPane.showMessageDialog(null,"Number of Days: " + widgetDays(widgetNumber));

        System.exit(0);
    }

    public static int widgetDays (int widgetNumber){
        return widgetNumber%16-1;
    }

    public double COP(int widgetNumber){
        return 10*(16.50*widgetDays(widgetNumber));
    }
}
