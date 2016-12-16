package singleton_template_factory;

public class GreenTeaProduct extends TeaProduct{

	@Override
	public String getDescription() {
		return "GreenTea";
	}

	@Override
	public double getCost() {
		return 25;
	}
}
