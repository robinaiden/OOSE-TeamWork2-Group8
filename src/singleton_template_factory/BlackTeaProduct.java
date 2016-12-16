package singleton_template_factory;

public class BlackTeaProduct extends TeaProduct{

	@Override
	public String getDescription() {
		return "BlackTea";
	}

	@Override
	public double getCost() {
		return 20;
	}

}
