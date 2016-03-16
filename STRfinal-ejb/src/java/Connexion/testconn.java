/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.persistence.Query;

/**
 *
 * @author safa
 */
public class testconn {
   

    public static void main(String[] argv) throws SQLException {

        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/STRDB", "root", "root");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            PreparedStatement ps = null;
            System.out.println("You made it, take control your database now!");
            

            try {
                    ps = connection.prepareStatement("insert into Arret (nomArret,adresseArret) values (?,?)");
                    ps.setString(1, "safa");
                    ps.setString(2, "62 rue philippe fabia");
		    ps.executeUpdate();
                     System.out.println("ajoutéééééééé");
                    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            
        } else {
            System.out.println("Failed to make connection!");
        }
    }
}

