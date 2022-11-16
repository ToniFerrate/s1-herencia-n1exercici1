package n1Exercici1;

public class InstrumentCorda extends Instrument {
	

	// Instance Initialization Block
    {
        System.out.println("Instance Initialization Block (corda) "  + super.nom + " Preu " + super.preu);
    }
    
	// static Initialization Block
    static {
        System.out.println("static Initialization Block (corda) ");
    }

	public InstrumentCorda(String nom, int preu) {
		super(nom, preu);
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");

	}

}
