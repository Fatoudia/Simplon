package gestionUniversite;

public class utilisateur 
{
	
	private int id_Utilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	
	
	public int getId_Utilisateur() 
	{
		return id_Utilisateur;
	}
	
	
	public void setId_Utilisateur(int id_Utilisateur) 
	{
		this.id_Utilisateur = id_Utilisateur;
	}
	
	
	public String getNom()
	{
		return nom;
	}
	
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	
	public String getPrenom() 
	{
		return prenom;
	}
	
	
	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}
	
	
	public String getEmail()
	{
		return email;
	}
	
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	public String getPassword() 
	{
		return password;
	}
	
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
    public String getFullName()
    {
    	
    	return this.getNom() + ":" + this.getPrenom();
    }
	
    public String toString() {
    	
    	return "mon numero user:" + this.getId_Utilisateur() + "Je m'appel : " + this.getFullName();
    }

	
}
