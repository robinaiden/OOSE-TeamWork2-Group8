package TemplateFactory;

public class LemonTeaFactory extends TeaFactory{
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new LemonTeaProduct();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 30;
	}

}
