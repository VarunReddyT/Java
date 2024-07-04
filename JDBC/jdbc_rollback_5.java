// insert, delete, commit, rollback, savepoint

import java.sql.*;
public class jdbc_rollback_5 {
    public static void main(String[] args) throws SQLException{
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/operations", "root","Tvkreddy@2014");
            con.setAutoCommit(false);

            String insertSQL = "INSERT INTO Students (FirstName,LastName,Gender,DateOfBirth,Email,PhoneNumber,Address,City,State,ZipCode,EnrollmentDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);

            pstmt.setString(1, "Charan");
            pstmt.setString(2, "Reddy");
            pstmt.setString(3, "M");
            pstmt.setDate(4, Date.valueOf("2005-10-01"));
            pstmt.setString(5, "charan@gmail.com");
            pstmt.setString(6, "1234567890");
            pstmt.setString(7, "Narayanguda");
            pstmt.setString(8, "Hyderabad");
            pstmt.setString(9, "Telangana");
            pstmt.setString(10, "500092");
            pstmt.setDate(11, Date.valueOf("2022-10-31"));

            pstmt.executeUpdate();

            pstmt.close();
            
            Savepoint savepoint = con.setSavepoint();


            String deleteSQL = "DELETE FROM Students WHERE StudentID = ?";
            pstmt = con.prepareStatement(deleteSQL);
            pstmt.setInt(1, 4);
            pstmt.executeUpdate();
            

            con.rollback(savepoint);

            con.commit();

            con.close();    

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
