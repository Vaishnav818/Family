package Jdbc;
import java.sql.SQLException;
public class Test {
        public static void main(String[] args) {
            Insert insertEmployee = new Insert();
            Select selectEmployees = new Select();
            //Update updateEmployee = new UpdateEmployee();
            //Delete deleteEmployee = new DeleteEmployee();

            try {
                // Insert records
                insertEmployee.insertRecord("Vaishnav", "MLAE",  525225222);
                insertEmployee.insertRecord("ASWATHY", "FEMALE",  235522352);
                insertEmployee.insertRecord("NAVANEETH", "MALE",  595352262);

                // Select records
                System.out.println("After inserting records:");
                selectEmployees.selectAllRecords();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
