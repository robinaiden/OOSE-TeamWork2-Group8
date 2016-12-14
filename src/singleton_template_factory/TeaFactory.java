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
		teaproduct.boilWater();
		teaproduct.brew();
		teaproduct.addIce();
		teaproduct.addSugar();
		teaproduct.cupTea();
		return teaproduct;
	}
	
	public void getDiscountStrategy() {
		// ���P�������N�|�o�줣�P�����G
        strategy.discount();
    }

}
