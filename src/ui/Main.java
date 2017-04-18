package ui;

import utils.DatabaseUtils;

public class Main {
    public static void main(String[] args) {
        DatabaseUtils.createNewDatabase("FinancePro.db"); //If the database exists, the database is automatically connected.
        MainScreen.initComponents();
    }
}
