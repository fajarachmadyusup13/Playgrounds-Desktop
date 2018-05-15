/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertexceltodb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghost
 */
public class ConvertExcelToDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileOperations fo = new FileOperations();
        ArrayList<News> ns = fo.getData(1);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Hoax_Detector", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Data_Training WHERE newsID BETWEEN 'B4001' AND 'B5000' ORDER BY newsID");
//            PreparedStatement ps = con.prepareStatement("insert into Data_Training values(?,?,?,?,?,?)");
//                for (News n : ns) {
//                    ps.setString(1, n.getNewsID());
//                    ps.setInt(2, n.getLike());
//                    ps.setInt(3, n.getProvocation());
//                    ps.setInt(4, n.getComment());
//                    ps.setInt(5, n.getEmotion());
//                    ps.setInt(6, n.getHoax());
//                    
//                    int i = ps.executeUpdate();
//                    System.out.println(i + " stored");
//                }
            while (rs.next()) {
                System.out.println(rs.getString(1)+ " - " + rs.getInt(2));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConvertExcelToDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConvertExcelToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }
    
}
