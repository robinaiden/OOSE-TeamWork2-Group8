package decorator;

public class TapiocaBallDecorator extends TeaDecorator {
		
	public TapiocaBallDecorator(TeaComponent newTea) {
		super(newTea);
		// TODO Auto-generated constructor stub
		System.out.println("	Adding TapiocaBall");
	}
	
	// Returns the result of calling getDescription() for
	// ConcreteHamburger and adds "Bacon" to it
	
	public String getDescription() {
		return tempTea.getDescription() + "  TapiocaBall";
	}
	
	public double getCost() {
		//System.out.println("Cost of TapiocaBall: " + 5);
		return tempTea.getCost() + 5;
	}
	
}
