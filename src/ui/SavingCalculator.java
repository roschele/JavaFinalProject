/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: SavingCalculator.java
 * Date Modified:   4/8/17
 * Description:     Savings Calculator where user inputs Profit amount and percent saved to determine savings.
 */
package ui;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class SavingCalculator  {
    private static JFrame savingsFrame;
    private static JLabel profitAmountLabel;
    private static JTextField profitAmountTextField;
    private static JLabel percentSavedLabel;
    private static JTextField percentSavedTextField;
    private static JButton calculateButton;
    private static JButton homeButton;
    private static JTextField resultField;

    public static void initComponents() {

        savingsFrame = new JFrame();
        profitAmountLabel = new JLabel();
        profitAmountTextField = new JTextField();
        percentSavedLabel = new JLabel();
        percentSavedTextField = new JTextField();
        calculateButton = new JButton();
        homeButton = new JButton();
        resultField = new JTextField();


        //-------- savingsFrame ------
        savingsFrame.setTitle("Finance Pro");
        savingsFrame.setSize(new Dimension(500, 500));
        Container maingSavingsFrame = savingsFrame.getContentPane();

        //---- profitAmountLabel ----
        profitAmountLabel.setText("Profit Amount: ");
        profitAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- percentSavedLabel ----
        percentSavedLabel.setText("Percent Saved:");
        percentSavedLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- calculateButton ----
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(new Color(73, 208, 43));

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));

        savingsFrame.setVisible(true);
    }

}
