package decorator;

public abstract class TeaDecorator implements TeaComponent {
	
	protected TeaComponent tempTea;

	public TeaDecorator(TeaComponent newTea) {
		tempTea = newTea;
	}

}
