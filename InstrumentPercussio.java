package n1Exercici1;

public class InstrumentPercussio extends Instrument {
	

	// Instance Initialization Block
    {
        System.out.println("Instance Initialization Block (percussió) "  + super.nom + " Preu " + super.preu);
    }
    
    // static Initialization Block
    static {
        System.out.println("static Initialization Block (percussió) ");
    }
	
	public InstrumentPercussio(String nom, int preu) {
		super(nom, preu);
	}


	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");

	}

}
