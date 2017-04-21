/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: SavingCalculator.java
 * Date Modified:   4/8/17
 * Description:     Savings Calculator where user inputs Profit amount and percent saved to determine savings.
 */
package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

import static java.lang.Integer.parseInt;

public class SavingCalculator  {
    private static JFrame savingsFrame;
    private static JLabel profitAmountLabel;
    private static JTextField profitAmountTextField;
    private static JLabel percentSavedLabel;
    private static JTextField percentSavedTextField;
    private static JLabel resultField; //This is a JLabel because we don't want people editing it
    private static JButton calculateButton;
    private static JButton homeButton;
    private static JLabel resultLabel;

    public static void initComponents() {

        savingsFrame = new JFrame();
        profitAmountLabel = new JLabel();
        profitAmountTextField = new JTextField();
        percentSavedLabel = new JLabel();
        calculateButton = new JButton();
        percentSavedTextField = new JTextField();
        homeButton = new JButton();
        resultField = new JLabel();
        resultLabel = new JLabel();


        //-------- savingsFrame ------
        savingsFrame.setTitle("Finance Pro");
        savingsFrame.setSize(new Dimension(500, 500));
        savingsFrame.setLayout(new GridLayout(3, 1));


        Container editTextContainer = new Container();
        editTextContainer.setLayout(new GridLayout(2, 2));
        //---- profitAmountLabel ----
        profitAmountLabel.setText("Profit Amount: ");
        profitAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- percentSavedLabel ----
        percentSavedLabel.setText("Percent Saved:");
        percentSavedLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- profitAmountTextField ----
        profitAmountTextField.setFont(new Font("Tahoma", Font.BOLD, 36));

        //---- percentSavedTextField ----
        percentSavedTextField.setFont(new Font("Tahoma", Font.BOLD, 36));

        editTextContainer.add(profitAmountLabel, BorderLayout.EAST);
        editTextContainer.add(profitAmountTextField, BorderLayout.WEST);
        editTextContainer.add(percentSavedLabel, BorderLayout.EAST);
        editTextContainer.add(percentSavedTextField, BorderLayout.WEST);


        resultLabel.setText("Savings: ");
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
            } // <-- Cody adds magic to make method work here
        });


        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savingsFrame.dispose();
            }
        });
        savingsFrame.setVisible(true);


        Container buttonContainer = new Container();
        buttonContainer.setLayout(new GridLayout(1, 3));
        buttonContainer.add(calculateButton, BorderLayout.EAST);
        buttonContainer.add(homeButton, BorderLayout.WEST);

        savingsFrame.add(editTextContainer, BorderLayout.NORTH);
        savingsFrame.add(resultContainer, BorderLayout.CENTER);
        savingsFrame.add(buttonContainer, BorderLayout.SOUTH);
        savingsFrame.setVisible(true);
    }

        public static void calculate() {
            if (!profitAmountTextField.getText().equals("") && !percentSavedTextField.getText().equals("")) {
                float profitAmount = parseInt(profitAmountTextField.getText());
                float percentSaved = parseInt(percentSavedTextField.getText());
                float savings = profitAmount * percentSaved;

                if (savings > 0) {
                    resultField.setForeground(Color.GREEN);
                } else {
                    resultField.setForeground(Color.RED);
                }

                resultField.setText("$" + savings);


            } else {
                resultField.setFont(new Font("Tahoma", Font.PLAIN, 12));
                resultField.setText("Please enter numerical values above.");
            }
        }


        // INSERT CODY MAGIC HERE:  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  --------------------- //

    }


