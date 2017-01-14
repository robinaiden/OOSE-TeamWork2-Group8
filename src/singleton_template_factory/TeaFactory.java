package singleton_template_factory;

public class TeaFactory {
	
	private static TeaFactory teaFactory = new TeaFactory();
	
	public TeaProduct createBlackTeaProduct() {
		TeaProduct blackTeaProduct = new BlackTea();
		blackTeaProduct.teaRecipe();
		return blackTeaProduct;
	}
	
	public TeaProduct createGreenTeaProduct() {
		TeaProduct greenTeaProduct = new GreenTea();
		greenTeaProduct.teaRecipe();
		return greenTeaProduct;
	}
	
	public TeaProduct createLemonTeaProduct() {
		TeaProduct lemonTeaProduct = new LemonTea();
		lemonTeaProduct.teaRecipe();
		return lemonTeaProduct;
	}
	
	public static TeaFactory getInstance() {
		return teaFactory;
	}
	
}
