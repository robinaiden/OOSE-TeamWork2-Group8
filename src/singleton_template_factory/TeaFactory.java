package singleton_template_factory;

import decorator.TeaComponent;
import decorator.TeaDecorator;
import strategy.DiscountStrategy;

public abstract class TeaFactory {
	
	private DiscountStrategy strategy = null;
	
	protected TeaFactory(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
	
	protected abstract TeaProduct CreateTea();
	
	public TeaComponent orderTea() {
		//There is Information hiding, but you can put in client.
		TeaProduct teaproduct = CreateTea();
		teaproduct.TeaRecipe();
//		teaproduct.brew();
//		teaproduct.addIce();
//		teaproduct.addSugar();
//		teaproduct.cupTea();
		return teaproduct;
	}
	
	public void getDiscountStrategy() {
		// 不同的策略將會得到不同的結果
        strategy.discount();
    }

}
