package gestionUniversite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connectionBD {

	
	public static void main(String[] args) 
	{
	 Connection connect = null;
     try
     {
       String protocol = "jdbc:";
       String sous_protocol = "mysql://";
       String ip = "localhost:3306/";
       String baseDeDonnees = "p_universite";
       String parametre = "?useSSL=false&serverTimezone=Europe/Paris";
       String url = protocol+sous_protocol+ip+baseDeDonnees+parametre;
       
       
       connect = DriverManager.getConnection(url,"root","root");
       System.out.println("Succes");
       
       String requete = "INSERT INTO p_universite.directeur (nom_directeur, prenom_directeur, password_directeur, email_directeur) VALUES(?,?,?,?)";
       PreparedStatement prepareRequete = connect.prepareStatement(requete);
       prepareRequete.setString(1,"DIARRA");
       prepareRequete.setString(2, "Fatoumata");
       prepareRequete.setString(3, "titi");
       prepareRequete.setString(4, "fatou@gmail.com");
       
       int result = prepareRequete.executeUpdate();
       
       if(result == 1) 
       {
    	   
    	 System.out.println("Vos informations ont été enregistré avec succes!");  
       }
       else 
       {
    	 System.out.println("Vos informations n'ont pas été enregistre"); 
       }
     } 
     catch(SQLException e) 
     {
      e.printStackTrace();	 
     }
	}

}
