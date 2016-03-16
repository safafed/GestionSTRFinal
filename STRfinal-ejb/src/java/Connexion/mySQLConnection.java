package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class mySQLConnection {
	
	  //Nom du user
	  private String user = "root";
	  //Mot de passe de l'utilisateur
	  private String passwd = "root";
	  //URL de connexion
	  private String url = "jdbc:mysql://localhost:3306/defiledb";
	  //Objet Connection
	  private static Connection connect;
	   
	  //Constructeur privé
	  private mySQLConnection(){
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	        // Setup the connection with the DB
	        connect = DriverManager.getConnection(url,user,passwd);
	        System.out.println("conncetion good");
	    } catch (Exception e) {
	    	System.out.println("conncetion failed");
	      e.printStackTrace();
	    }
	  }
	   
	  //M�thode qui va nous retourner notre instance et la cr�er si elle n'existe pas
	  public static Connection getInstance(){
		  if(connect == null){
			  new mySQLConnection();
		  }
		  return connect;   
	  }
}
