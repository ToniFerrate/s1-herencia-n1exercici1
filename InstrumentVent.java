package n1Exercici1;

public class InstrumentVent extends Instrument{
	
	// Instance Initialization Block
    {
        System.out.println("Instance Initialization Block (vent) " + super.nom + " Preu " + super.preu);
    }
    
	// static Initialization Block
    static {
        System.out.println("static Initialization Block (vent) ");
    }
	
	public InstrumentVent(String nom, int preu) {
		super(nom, preu);
	}
	

	static void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}
}
