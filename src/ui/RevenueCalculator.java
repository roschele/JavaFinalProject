/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: RevenueCalculator.java
 * Date Modified:   4/8/17
 * Description:     Revenue Calculator where user inputs start and end month amounts to compute total revenue.
 */
package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;

import static java.lang.Integer.parseInt;
import static javafx.application.Platform.exit;

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

        resultField.setFont(new Font("Tahoma", Font.PLAIN, 24));

        Container resultContainer = new Container();
        resultContainer.setLayout(new GridLayout(1, 2));
        resultContainer.add(resultLabel, BorderLayout.EAST);
        resultContainer.add(resultField, BorderLayout.WEST);

        //---- calculateButton ----
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(new Color(73, 208, 43));
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        //---- resetButton ----
        resetButton.setText("RESET");
        resetButton.setBackground(new Color(254, 119, 125));
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revenueFrame.dispose();
            }
        });

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

    public static void calculate() {
        if (!startMonthField.getText().equals("") && !endMonthField.getText().equals("")) {
            //Ensures that the calculator doesn't try to calculate the difference between empty values
            float startMonth = parseInt(startMonthField.getText());
            float endMonth = parseInt(endMonthField.getText());
            float difference = endMonth - startMonth;

            if (difference > 0) {
                resultField.setForeground(Color.GREEN);
            } else {
                resultField.setForeground(Color.RED);
            }

            resultField.setText("$" + difference);
        } else {
            resultField.setFont(new Font("Tahoma", Font.PLAIN, 12));
            resultField.setText("Please enter numerical values above.");
        }
    }
    public static void reset() {
        startMonthField.setText("");
        endMonthField.setText("");
        resultField.setText("");
    }
}

