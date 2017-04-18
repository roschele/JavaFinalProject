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
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                if (file.getAbsoluteFile().exists()) {
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
