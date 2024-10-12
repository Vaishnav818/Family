package Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insert {
    private static final String INSERT_CHILD_SQL = "INSERT INTO child (name, gender,phoneNo) VALUES (?, ?, ?);";

    public void insertRecord(String name, String gender, int phoneNo) throws SQLException {
        // Establishing a Connection
        try (Connection connection = MainJDBC.getConnection();
             // Creating a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CHILD_SQL)){
            // Setting parameters
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, gender);
            preparedStatement.setInt(3,phoneNo);

            // Executing the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            MainJDBC.printSQLException(e);
        }
    }
}
