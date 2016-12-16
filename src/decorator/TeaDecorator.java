package decorator;

public class TeaDecorator implements TeaComponent {
	
	protected TeaComponent tempTea;

	public TeaDecorator(TeaComponent newTea){
		tempTea = newTea;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
