/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: ProfitCalculator.java
 * Date Modified:   4/8/17
 * Description:     Profit Calculator where user inputs revenue amount, and selects expenses to calculate profit.
*/
package ui;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class ProfitCalculator  {
    private static JFrame profitFrame;
    private static JLabel revenueAmountLabel;
    private static JTextField revenueAmountField;
    private static JLabel expenseTypeLabel;
    private static JTextField expenseResultField;
    private static JButton addExpense;
    private static JButton calculateButton;
    private static JButton homeButton;
    private static JComboBox expenseItemSelection;

    public static void initComponents() {

        profitFrame = new JFrame();
        revenueAmountLabel = new JLabel();
        revenueAmountField = new JTextField();
        expenseTypeLabel = new JLabel();
        expenseResultField = new JTextField();
        addExpense = new JButton();
        calculateButton = new JButton();
        homeButton = new JButton();
        expenseItemSelection = new JComboBox();

        //------- profitFrame ------
        profitFrame.setTitle("Finance Pro");
        Container frame1ContentPane = profitFrame.getContentPane();

        //---- revenueAmountLabel ----
        revenueAmountLabel.setText("Revenue Amount: ");
        revenueAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- expenseTypeLabel ----
        expenseTypeLabel.setText("Select Expense Type:");
        expenseTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- addExpense ----
        addExpense.setText("CALCULATE");
        addExpense.setBackground(new Color(254, 119, 125));

        //---- calculateButton ----
        calculateButton.setText("ADD EXPENSE");
        calculateButton.setBackground(new Color(73, 208, 43));

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));



    }
}
