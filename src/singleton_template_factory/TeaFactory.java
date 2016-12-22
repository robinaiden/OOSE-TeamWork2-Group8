package singleton_template_factory;

public class TeaFactory {
	
	private static TeaFactory teaFactory = new TeaFactory();
	
	public TeaProduct createBlackTeaProduct() {
		TeaProduct blackTeaProduct = new BlackTeaProduct();
		blackTeaProduct.teaRecipe();
		return blackTeaProduct;
	}
	
	public TeaProduct createGreenTeaProduct() {
		TeaProduct greenTeaProduct = new GreenTeaProduct();
		greenTeaProduct.teaRecipe();
		return greenTeaProduct;
	}
	
	public TeaProduct createLemonTeaProduct() {
		TeaProduct lemonTeaProduct = new LemonTeaProduct();
		lemonTeaProduct.teaRecipe();
		return lemonTeaProduct;
	}
	
	public static TeaFactory getInstance() {
		return teaFactory;
	}
	
}
