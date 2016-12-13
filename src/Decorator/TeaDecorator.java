package Decorator;

public class TeaDecorator implements TeaComponent{
	
	protected TeaComponent tempTea;

	public TeaDecorator(TeaComponent newTea){
		tempTea = newTea;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempTea.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempTea.getCost();
	}

}
