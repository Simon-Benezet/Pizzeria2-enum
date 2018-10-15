package Pizzeria;

public class Pizza{
	String code;
	String designation;
	float prix;
	Type categorie;
	
	public Pizza(String code, String designation, float prix, Type categorie) 
	{
		super();
		this.code = code;
		this.designation = designation;
		this.prix = prix;
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Pizza [code=" + code + ", designation=" + designation + ", prix=" + prix + ", categorie=" + categorie.getNom()
				+ "]";
	}
	
}
