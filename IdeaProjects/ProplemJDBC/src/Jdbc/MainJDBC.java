package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/family?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Root@123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }




}
