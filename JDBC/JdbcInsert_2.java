import java.io.*;
import java.sql.*;

public class JdbcInsert_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("smartphones.csv"));
        String line;

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartphonesDB", "root", "Tvkreddy@2014");
            Statement stmt = con.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS smartphones (SmartphoneId INT NOT NULL AUTO_INCREMENT, Smartphone VARCHAR(255) , Brand VARCHAR(40) , Model VARCHAR(40) , RAM INT , Storage INT , Color VARCHAR(40) , Free BOOLEAN, FinalPrice DOUBLE , PRIMARY KEY (SmartphoneId) )";
            stmt.executeUpdate(createTableSQL);


            String insertSQL = "INSERT INTO smartphones (Smartphone,Brand,Model,RAM,Storage,Color,Free,FinalPrice) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length < 8) {
                    continue;
                }

                pstmt.setString(1, columns[0].isEmpty() ? "Unknown" : columns[0]);
                pstmt.setString(2, columns[1].isEmpty() ? "Unknown" : columns[1]);
                pstmt.setString(3, columns[2].isEmpty() ? "Unknown" : columns[2]);
                pstmt.setInt(4, columns[3].isEmpty() ? 0 : Integer.parseInt(columns[3]));
                pstmt.setInt(5, columns[4].isEmpty() ? 0 : Integer.parseInt(columns[4]));
                pstmt.setString(6, columns[5].isEmpty() ? "Unknown" : columns[5]);
                pstmt.setBoolean(7, columns[6].isEmpty() ? false : Boolean.parseBoolean(columns[6]));
                pstmt.setDouble(8, columns[7].isEmpty() ? 0.0 : Double.parseDouble(columns[7]));

                pstmt.executeUpdate();
            }

            pstmt.close();
            con.close();
            br.close();

            System.out.println("Data has been inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
