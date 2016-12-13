package Decorator;

public class GrassJellyDecorator extends TeaDecorator{
	
	public GrassJellyDecorator(TeaComponent newTea) {
		super(newTea);
		// TODO Auto-generated constructor stub
		System.out.println("	Adding GrassJelly");
	}
	
	// Returns the result of calling getDescription() for
	// ConcreteHamburger and adds "Bacon" to it
	
	public String getDescription() {
		return tempTea.getDescription() + "  GrassJelly";
	}
	
	public double getCost() {
		System.out.println("Cost of GrassJelly: " + 5);
		return tempTea.getCost() + 5;
	}
}
