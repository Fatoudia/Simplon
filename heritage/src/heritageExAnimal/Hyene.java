package heritageExAnimal;

public class Hyene extends Carnivore {
	private String rire;

	public Hyene(String rire) {
		// TODO Auto-generated constructor stub
		super("viande");
		this.rire = rire;
	}
	Lion L = new Lion();
	
	public String setRire(String rire) {
		
		return this.rire = rire;
	}
	
	public String getRire() {
		
	return	this.rire;
	}
	
	public String toString() {
		
	return  L.toString() +" J'ai un rire : " + this.getRire();	
	}

}
