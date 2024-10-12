package Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    private static final String SELECT_ALL_CHILD = "SELECT * FROM child;";

    public void selectAllRecords() throws SQLException {
        // Establishing a Connection
        try (Connection connection = MainJDBC.getConnection();
             // Creating a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CHILD)) {
            // Executing the query and getting the result set
            ResultSet rs = preparedStatement.executeQuery();
            // Processing the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String phoneNo = rs.getString("phoneNo");
                System.out.println(id+","+name+","+gender+","+phoneNo);
            }
        } catch (SQLException e) {
            MainJDBC.printSQLException(e);
        }
    }

}
