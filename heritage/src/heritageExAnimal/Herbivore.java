package heritageExAnimal;

public class Herbivore  extends Animal{

	public Herbivore() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	
	Carnivore C = new Carnivore("herbes");
	Lion L = new Lion();
	public String toString() {
		
		return super.toString() + "Je suis de type herbivore je mange des " + C.setNourriture("herbes");
	}

}
