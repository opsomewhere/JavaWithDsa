package newtech.JsonAttach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:mydata.db"; // Creates a file named mydata.db

        try (Connection conn = DriverManager.getConnection(url)) {
            // Create Table
            String sqlCreate = "CREATE TABLE IF NOT EXISTS users (name TEXT, amount REAL, id INTEGER)";
            conn.createStatement().execute(sqlCreate);

            // Insert Data
            String sqlInsert = "INSERT INTO users(name, amount, id) VALUES(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sqlInsert);
            pstmt.setString(1, "Alice");
            pstmt.setDouble(2, 500.50);
            pstmt.setInt(3, 101);
            pstmt.executeUpdate();

            System.out.println("Data Saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}