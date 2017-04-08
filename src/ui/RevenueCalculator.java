/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: RevenueCalculator.java
 * Date Modified:   4/8/17
 * Description:     Revenue Calculator where user inputs start and end month amounts to compute total revenue.
 */
package ui;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

public class RevenueCalculator  {
    private static JFrame revenueFrame;
    private static JLabel startMonthLabel;
    private static JTextField startMonthField;
    private static JLabel endMonthLabel;
    private static JTextField endMonthField;
    private static JLabel resultField; //This is a JLabel because we don't want people editing it
    private static JButton calculateButton;
    private static JButton resetButton;
    private static JButton homeButton;
    private static JLabel resultLabel;

    public static void initComponents() {

        revenueFrame = new JFrame();
        startMonthLabel = new JLabel();
        startMonthField = new JTextField();
        endMonthLabel = new JLabel();
        endMonthField = new JTextField();
        resultField = new JLabel();
        calculateButton = new JButton();
        resetButton = new JButton();
        homeButton = new JButton();
        resultLabel = new JLabel();

        //----- revenueFrame ------
        revenueFrame.setTitle("Finance Pro");
        revenueFrame.setSize(new Dimension(500, 500));
        revenueFrame.setLayout(new GridLayout(3, 1));


        Container editTextContainer = new Container();
        editTextContainer.setLayout(new GridLayout(2, 2));
        //---- startMonthLabel ----
        startMonthLabel.setText("Start Month Amount: ");
        startMonthLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- endMonthLabel ----
        endMonthLabel.setText("End Month Amount: ");
        endMonthLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));


        editTextContainer.add(startMonthLabel, BorderLayout.EAST);
        editTextContainer.add(startMonthField, BorderLayout.WEST);
        editTextContainer.add(endMonthLabel, BorderLayout.EAST);
        editTextContainer.add(endMonthField, BorderLayout.WEST);

        resultLabel.setText("Revenue: ");
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        resultField.setFont(new Font("Tahoma", Font.PLAIN, 16));

        Container resultContainer = new Container();
        resultContainer.setLayout(new GridLayout(2, 1));
        resultContainer.add(resultLabel, BorderLayout.EAST);
        resultContainer.add(resultField, BorderLayout.WEST);

        //---- calculateButton ----
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(new Color(73, 208, 43));

        //---- resetButton ----
        resetButton.setText("RESET");
        resetButton.setBackground(new Color(254, 119, 125));

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));

        Container buttonContainer = new Container();
        buttonContainer.setLayout(new GridLayout(1, 3));
        buttonContainer.add(calculateButton, BorderLayout.EAST);
        buttonContainer.add(resetButton, BorderLayout.CENTER);
        buttonContainer.add(homeButton, BorderLayout.WEST);

        revenueFrame.add(editTextContainer, BorderLayout.NORTH);
        revenueFrame.add(resultContainer, BorderLayout.CENTER);
        revenueFrame.add(buttonContainer, BorderLayout.SOUTH);
        revenueFrame.setVisible(true);

    }

}

