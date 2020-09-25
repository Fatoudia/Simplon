package tets;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("coucou");
     Coucou t = new Coucou();
     t.setNom("Fatou");
    Scanner scan = new Scanner(System.in);
    System.out.println("Quel est votre nom?");
    String monNom = scan.nextLine();
    t.setNom(monNom);
    System.out.println("Je m'appel : " + monNom);

	}

}
