package application;
import java.util.Scanner;
public class EssaiAmi {
	public EssaiAmi() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
     
     System.out.print("Donnez le nom de la personne seule : ");     
	 Personne personneSeule = new Personne(scan.next());
	 
     System.out.print("Donnez le nom de ami1 : ");  
     Personne ami1 = new Personne(scan.next());

     System.out.print("Donnez le nom de ami2 : ");  
     Personne ami2 = new Personne(scan.next());
     
     ami1.setAmi(ami2);
     ami2.setAmi(ami1);
     
     System.out.println(personneSeule.toString());
     System.out.println(ami1.toString());
     System.out.println(ami2.toString());

	}

}
