package application;

public class Personne {
	

	private String nom;
	private Personne ami;
	
	
	public Personne(String nom) {
		this.nom = nom;
	
		
	}
	
	
	
	public Personne(String nom , Personne ami) {
		this.nom = nom;
		this.ami = ami;
		
	}
	
	public Personne getAmi() {
		return this.ami;
	}
	
	public void setAmi(Personne ami) {
		this.ami = ami;
	}
	public String toString(){
		
			if(this.ami == null) {
			return "Je suis"+ this.nom + "Je n'ai pas d'ami";
		}else {
			
			return "Je suis"+ this.nom + "Mon ami s'appel "+ this.ami;
			
		}

		}
	}

