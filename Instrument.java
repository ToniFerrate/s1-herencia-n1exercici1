package n1Exercici1;

class Instrument {
	String nom;
	int preu;
	
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}



	public void tocar() {
		System.out.println("Està sonant un instrument");
	}
}
