package decorator;

public class TeaDecorator implements TeaComponent {
	
	protected TeaComponent tempTea;

	public TeaDecorator(TeaComponent newTea){
		tempTea = newTea;
	}

	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public double getCost() {
		return 0;
	}

}
