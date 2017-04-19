/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: DisbursementCalculator.java
 * Date Modified:   4/8/17
 * Description:     Disbursement Calculator computes totals for each co-owner of business for profits to be disbursed properly.
*/
package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class DisbursementCalculator  {
    private static JFrame disbursementFrame;
    private static JLabel profitAmountLabel;
    private static JTextField profitAmountField;
    private static JLabel percentProfitLabel;
    private static JTextField percentProfitField;
    // private static JLabel resultField; //This is a JLabel because we don't want people editing it
    private static JButton calculateButton;
    private static JButton homeButton;
    private static JTextField disburseResultField;
    private static JLabel resultField;
    private static JLabel resultLabel;

    public static void initComponents() {

        disbursementFrame = new JFrame();
        profitAmountLabel = new JLabel();
        profitAmountField = new JTextField();
        percentProfitLabel = new JLabel();
        percentProfitField = new JTextField();
        calculateButton = new JButton();
        homeButton = new JButton();
        disburseResultField = new JTextField();
        resultLabel = new JLabel();
        resultField = new JLabel();


        //------ disbursementFrame -----
        disbursementFrame.setTitle("Finance Pro");
        disbursementFrame.setSize(new Dimension(500, 500));
        disbursementFrame.setLayout(new GridLayout(3, 1));


        Container editTextContainer = new Container();
        editTextContainer.setLayout(new GridLayout(2, 2));
        //---- profitAmountLabel ----
        profitAmountLabel.setText("Profit Amount: ");
        profitAmountLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- percentProfitLabel ----
        percentProfitLabel.setText("Percent of Profit:");
        percentProfitLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        //---- profitAmountField ----
        profitAmountField.setFont(new Font("Tahoma", Font.BOLD, 36));

        //---- percentProfitField ----
        percentProfitField.setFont(new Font("Tahoma", Font.BOLD, 36));


        editTextContainer.add(profitAmountLabel, BorderLayout.EAST);
        editTextContainer.add(profitAmountField, BorderLayout.WEST);
        editTextContainer.add(percentProfitLabel, BorderLayout.EAST);
        editTextContainer.add(percentProfitField, BorderLayout.WEST);


        resultLabel.setText("DISB: ");
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
            public void actionPerformed(ActionEvent e){

            } // <-- Cody adds magic to make method work here
        });

        //---- homeButton ----
        homeButton.setText("HOME");
        homeButton.setBackground(new Color(232, 234, 63));
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disbursementFrame.dispose();
            }
        });
        disbursementFrame.setVisible(true);




        Container buttonContainer = new Container();
        buttonContainer.setLayout(new GridLayout(1, 3));
        buttonContainer.add(calculateButton, BorderLayout.EAST);
        buttonContainer.add(homeButton, BorderLayout.WEST);

        disbursementFrame.add(editTextContainer, BorderLayout.NORTH);
        disbursementFrame.add(resultContainer, BorderLayout.CENTER);
        disbursementFrame.add(buttonContainer, BorderLayout.SOUTH);
        disbursementFrame.setVisible(true);


        // INSERT CODY MAGIC HERE:  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  --------------------- //

    }

}
