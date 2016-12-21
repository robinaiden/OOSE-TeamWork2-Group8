package decorator;

public class TapiocaBallDecorator extends TeaDecorator {
		
	public TapiocaBallDecorator(TeaComponent newTea) {
		super(newTea);
		System.out.println("	Adding TapiocaBall");
	}
	
	// Returns the result of calling getDescription() for
	// ConcreteHamburger and adds "Bacon" to it
	
	public String getDescription() {
		return tempTea.getDescription() + "  TapiocaBall";
	}
	
	public double getCost() {
		return tempTea.getCost() + 5;
	}
	
}
