package decorator;

public class GrassJellyDecorator extends TeaDecorator {
	
	public GrassJellyDecorator(TeaComponent newTea) {
		super(newTea);
		System.out.println("	Adding GrassJelly");
	}
	
	// Returns the result of calling getDescription() for
	// ConcreteHamburger and adds "Bacon" to it
	
	public String getDescription() {
		return tempTea.getDescription() + "  GrassJelly";
	}
	
	public double getCost() {
		return tempTea.getCost() + 5;
	}
}
