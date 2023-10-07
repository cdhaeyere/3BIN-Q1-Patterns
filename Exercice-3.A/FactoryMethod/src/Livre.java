
public class Livre implements Product {
	public static final double PRIX=14.99;
	private String name;
	private int anneeDeParution;
	private double prix;

	public Livre(String name, int anneeDeParution){
		this.name=name;
		this.anneeDeParution=anneeDeParution;
		this.prix=PRIX;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAnneeDeParution() {
		return anneeDeParution;
	}

	@Override
	public double getPrix() {
		return prix;
	}

	@Override
	public void setPrix(int prix){
		this.prix=prix;
	}
}