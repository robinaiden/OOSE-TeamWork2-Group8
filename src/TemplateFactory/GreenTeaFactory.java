package TemplateFactory;

public class GreenTeaFactory extends TeaFactory{
	
	@Override
	protected TeaProduct CreateTea() {
		// TODO Auto-generated method stub
		return new GreenTeaProduct();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 25;
	}

}
