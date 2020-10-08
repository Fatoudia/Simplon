package gestionUniversite;
//import java.util.Scanner;

public class directeur extends utilisateur {
	char sex;
	public directeur(String nom, String prenom,String email,String password, char leSex) 
	{
	//Scanner scan = new Scanner(System.in);
	//System.out.println("Donnee votre nom");
	//nom = scan.next();
	super.setNom(nom);
	super.setPrenom(prenom);
	super.setEmail(email);
	super.setPassword(password);
	this.sex = leSex;	
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public String toString() 
	{
	String genre = (this.sex == 'M' || this.sex == 'm')? " Le Directeur" : " La Directrice" ;
	
	return "Je suis " + genre + super.toString();
		
	}
	
	
	

}
