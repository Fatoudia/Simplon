package heritageExAnimal;

public class Lapin extends Herbivore{

	public Lapin() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void fragilite() {
		System.out.println("Je ne supporte pas le courant d'air , la chaleur, trop d'odeur");
	}
	
	Lion L = new Lion();
	
	public String toString() {
		
		return super.toString() + ", je dors dans une : " + L.setMaison("cage");
	}
	
}