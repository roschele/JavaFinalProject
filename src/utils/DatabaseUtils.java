package utils;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:/Users/Cody/IdeaProjects/School/JavaFinalProject/sqlite/db/" + fileName;
        File file = new File(url);

        try (Connection conn = DriverManager.getConnection(url)) {
            if (file.exists()) {
                System.out.println("Connected to the database with the name " + fileName);
            }
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("A new database has been created with the name " + fileName);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
