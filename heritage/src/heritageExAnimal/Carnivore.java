package heritageExAnimal;

public class Carnivore extends Animal{
	//attribut
	
	private String nourriture;
	private int nbresCarnivores = 0;
	
	//constructeur
	
	public Carnivore(String nourriture) {
		super();
		this.nourriture = nourriture;
		this.nbresCarnivores++;
	}
	
	@Override
	public void nourrir() {
		
		System.out.println("Je mange de la " + this.getNourriture());
		
	}
	
	public String setNourriture(String nourrir) {
		
		return this.nourriture = nourrir;
	}
	
	public int getNbresCarnivores() {
		
		return this.nbresCarnivores;
	}
	
	public String getNourriture() {
		
		return this.nourriture;
	}
	
	public String toString() {
		
		return super.toString() + "Je suis de type carnivore je mange de la  :" + this.getNourriture(); 
	}
	
	}


