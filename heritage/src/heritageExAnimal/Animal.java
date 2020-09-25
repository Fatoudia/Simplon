package heritageExAnimal;

public class Animal {
	//attribut
	
	private String mamifere;
	private static int nbresAnimaux = 0;
	// constructeur
	public Animal()
	{
	
    this.mamifere = "vertebre";
    this.nbresAnimaux++;
		
	}
	
	//methode
	
	public String getMamifere() {
		return this.mamifere;
	}
	
	public int getNbresAnimaux() {
		
		return this.nbresAnimaux;
	}
	
	public void communiquer() {
		
		System.out.println("Je communique d'une certaines façons");
	}
	
	public void nourrir() {
			
			System.out.println("Je mange de tous");
		}

	public void deplacement() {
			
			System.out.println("Je me deplace  d'une certaines façons");
		}
	public String toString() {
			
			return "Je suis un animal";
		}

}
