/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: DisbursementCalculator.java
 * Date Modified:   4/8/17
 * Description:     Disbursement Calculator computes totals for each co-owner of business for profits to be disbursed properly.
*/
package ui;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class DisbursementCalculator  {
    private static JFrame disbursementFrame;
    private static JLabel profitAmountLabel;
    private static JTextField profitAmountField;
    private static JLabel percentProfitLabel;
    private static JTextField percentProfitField;
    private static JButton calculateButton;
    private static JButton homeButton;
    private static JTextField disburseResultField;

    public static void initComponents() {

        disbursementFrame = new JFrame();
        profitAmountLabel = new JLabel();
        profitAmountField = new JTextField();
        percentProfitLabel = new JLabel();
        percentProfitField = new JTextField();
        calculateButton = new JButton();
        homeButton = new JButton();
        disburseResultField = new JTextField();

        //------ disbursementFrame -----
        disbursementFrame.setTitle("Finance Pro");
        Container frame1ContentPane = disbursementFrame.getContentPane();

        //---- profitAmountLabel ----
        profitAmountLabel.setText("Profit Amount: ");
        profitAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- percentProfitLabel ----
        percentProfitLabel.setText("Percent of Profit:");
        percentProfitLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- percentProfitField ----
        percentProfitField.setFont(new Font("Tahoma", Font.BOLD, 36));

        //---- calculateButton ----
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(new Color(73, 208, 43));

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));



    }

}
