package Ex01;

public abstract class Telefon {
	
	protected String marca;
	protected String model;
	
	public Telefon(String marca, String model) {
		
		this.marca = marca;
		this.model = model;
	}
	
	public void trucar (String numTelefon) {
		
		System.out.println("S'està trucant al número " + numTelefon);
	}

}
