package decorator;

public class PuddingDecorator extends TeaDecorator{
	
	public PuddingDecorator(TeaComponent newTea) {
		super(newTea);
		System.out.println("	Adding Pudding");
	}
	
	// Returns the result of calling getDescription() for
	// ConcreteHamburger and adds "Bacon" to it
	
	public String getDescription() {
		return tempTea.getDescription() + "  Pudding";
	}
	
	public double getCost() {
		return tempTea.getCost() + 5;
	}
}
