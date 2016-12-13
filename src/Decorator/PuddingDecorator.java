package Decorator;

public class PuddingDecorator extends TeaDecorator{
	
	public PuddingDecorator(TeaComponent newTea) {
		super(newTea);
		// TODO Auto-generated constructor stub
		System.out.println("	Adding Pudding");
	}
	
	// Returns the result of calling getDescription() for
	// ConcreteHamburger and adds "Bacon" to it
	
	public String getDescription() {
		return tempTea.getDescription() + "  Pudding";
	}
	
	public double getCost() {
		System.out.println("Cost of Pudding: " + 5);
		return tempTea.getCost() + 5;
	}
}
