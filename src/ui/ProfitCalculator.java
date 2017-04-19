/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: ProfitCalculator.java
 * Date Modified:   4/8/17
 * Description:     Profit Calculator where user inputs revenue amount, and selects expenses to calculate profit.
*/
package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private static JLabel resultField;
    private static JLabel resultLabel;

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
        resultLabel = new JLabel();
        resultField = new JLabel();

        //------- profitFrame ------
        profitFrame.setTitle("Finance Pro");
        profitFrame.setSize(new Dimension(500, 500));
        profitFrame.setLayout(new GridLayout(3, 1));


        Container editTextContainer = new Container();
        editTextContainer.setLayout(new GridLayout(2, 2));
        //---- revenueAmountLabel ----
        revenueAmountLabel.setText("Revenue Amount: ");
        revenueAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- expenseTypeLabel ----
        expenseTypeLabel.setText("Select Expense Type:");
        expenseTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- revenueAmountField ----
        revenueAmountField.setFont(new Font("Tahoma", Font.BOLD, 36));


        editTextContainer.add(revenueAmountLabel, BorderLayout.EAST);
        editTextContainer.add(revenueAmountField, BorderLayout.WEST);
        editTextContainer.add(expenseTypeLabel, BorderLayout.EAST);
        editTextContainer.add(expenseItemSelection, BorderLayout.WEST);


        resultLabel.setText("Profit: ");
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        resultField.setFont(new Font("Tahoma", Font.PLAIN, 24));

        Container resultContainer = new Container();
        resultContainer.setLayout(new GridLayout(1, 2));
        resultContainer.add(resultLabel, BorderLayout.EAST);
        resultContainer.add(resultField, BorderLayout.WEST);

        //---- addExpenseButton ----
        addExpense.setText("ADD EXPENSE");
        addExpense.setBackground(new Color(254, 119, 125));
        addExpense.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            } // <-- Cody adds magic to make method work here
        });

        //---- calculateButton ----
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(new Color(73, 208, 43));
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

            } // <-- Cody adds magic to make method work here
        });

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                profitFrame.dispose();
            }
        });

        Container buttonContainer = new Container();
        buttonContainer.setLayout(new GridLayout(1, 2));
        buttonContainer.add(calculateButton, BorderLayout.EAST);
        buttonContainer.add(homeButton, BorderLayout.WEST);

        profitFrame.add(editTextContainer, BorderLayout.NORTH);
        profitFrame.add(resultContainer, BorderLayout.CENTER);
        profitFrame.add(buttonContainer, BorderLayout.SOUTH);
        profitFrame.setVisible(true);



    }
}
