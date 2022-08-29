/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Gautam Rawat
 */
public class connectionProvider {
    public static Connection getConn()
    {
        Connection conn= null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Connection failed!");
        }
        return conn;
    }
    public static void main(String[] args)
    {
        System.out.println(getConn());
    }
            
    
}
