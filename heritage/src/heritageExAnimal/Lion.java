package heritageExAnimal;

public class Lion extends Carnivore{
	private String maison;

	public Lion() {
		// TODO Auto-generated constructor stub
		super("viande");
		this.maison = "tanniere";
	}
	public Lion(String uneMaison) {
		// TODO Auto-generated constructor stub
		super("viande");
		this.maison = uneMaison;
	}
	
	public String setMaison(String uneMaison) {
		
		return this.maison = uneMaison;
	}

	public String getMaison() {
		
		return this.maison;
	}
	
	
	public void communiquer() {
		
		System.out.println("Je rugis");
	}
	
	public String toString() {
		return super.toString() + " et je dors dans une :" + this.getMaison(); 
	}
	
}
