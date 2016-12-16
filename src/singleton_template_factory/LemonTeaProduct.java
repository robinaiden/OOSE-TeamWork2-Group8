package singleton_template_factory;

public class LemonTeaProduct extends TeaProduct{
	
	@Override
	public String getDescription() {
		return "LemonTea";
	}

	@Override
	public double getCost() {
		return 30;
	}
}
