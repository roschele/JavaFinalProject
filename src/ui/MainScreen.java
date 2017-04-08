/*
 * Name:            Dakota DeWolfe, David Salay, Roschele Henry
 * Name of Program: MainScreen.java
 * Date Modified:   4/8/17
 * Description:     Main Screen for launching the different calculators.
 */
package ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;


public class MainScreen  {
    private static JFrame mainFrame;
    private static JButton revenueButton;
    private static JButton savingButton;
    private static JButton profitButton;
    private static JButton incomeButton;


    public static void initComponents() {
        mainFrame = new JFrame();
        revenueButton = new JButton();
        savingButton = new JButton();
        profitButton = new JButton();
        incomeButton = new JButton();

        mainFrame.setTitle("Finance Pro");
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(2, 2));

        //---- revenueButton ----
        revenueButton.setText("REVENUE CALCULATOR");
        revenueButton.setBackground(new Color(188, 238, 117));
        revenueButton.setFont(new Font("Sitka Text", Font.PLAIN, 17));
        revenueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RevenueCalculator.initComponents();
            }
        });

        //---- savingButton ----
        savingButton.setText("SAVINGS CALCULATOR");
        savingButton.setBackground(new Color(60, 219, 248));
        savingButton.setFont(new Font("Sitka Text", Font.PLAIN, 17));
        savingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SavingCalculator.initComponents();
            }
        });

        //---- profitButton ----
        profitButton.setText("PROFIT CALCULATOR");
        profitButton.setBackground(new Color(73, 208, 43));
        profitButton.setFont(new Font("Sitka Text", Font.PLAIN, 17));
        profitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProfitCalculator.initComponents();
            }
        });

        //---- incomeButton ----
        incomeButton.setText("INCOME CALCULATOR");
        incomeButton.setBackground(new Color(232, 234, 63));
        incomeButton.setFont(new Font("Sitka Text", Font.PLAIN, 17));
        incomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisbursementCalculator.initComponents();
            }
        });

        mainFrame.add(revenueButton, BorderLayout.WEST);
        mainFrame.add(savingButton, BorderLayout.WEST);
        mainFrame.add(profitButton);
        mainFrame.add(incomeButton);
        mainFrame.setVisible(true);
    }

    public static void revenueButtonClicked(MouseEvent e) {
        // Add Cody magic here
    }

    public static void savingButtonClicked(MouseEvent e) {
        // Add Cody magic here
    }

    public static void profitButtonClicked(MouseEvent e) {
        // Add Cody magic here
    }

    public static void incomeButtonClicked(MouseEvent e) {
        // Add Cody magic here
    }
}
