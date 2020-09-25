package heritageExAnimal;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		System.out.println(animal.getMamifere());
		System.out.println("Le nombre d'animal que j'ai declare est " + animal.getNbresAnimaux());
		System.out.println("Le nombre d'animal que j'ai declare est " + animal.getMamifere());

	   /** Carnivore C = new Carnivore("viande");
		System.out.println(C);
		
		System.out.println("Le nombre de carnivore est " + C.getNbresCarnivores());
		
		Lion L = new Lion();
		System.out.println(L);

		
		L.communiquer();
        
		Hyene H = new Hyene("cri");
        System.out.println(H);
        
        String rire = H.setRire("efrayant");
        System.out.println(rire);

		System.out.println("Le nombre d'animal que j'ai declare est " + animal.getNbresAnimaux()); 
		
		System.out.println(H.toString());*/
		
		Lapin lapin = new Lapin();
		System.out.println(lapin.toString());
		lapin.fragilite();
       
	}

}
