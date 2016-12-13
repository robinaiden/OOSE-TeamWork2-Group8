package singleton_template_factory;

import decorator.TeaComponent;

public abstract class TeaFactory implements TeaComponent{
	
	public TeaFactory() {
		// TODO Auto-generated constructor stub
	}
	
	protected abstract TeaProduct CreateTea();
	
	public void orderTea() {
		//There is Information hiding, but you can put in client.
		TeaProduct teaproduct = CreateTea();
		teaproduct.boilWater(); 
		teaproduct.brew(); 
		teaproduct.addIce();
		teaproduct.addSugar(); 
		teaproduct.cupTea(); 
	}

}
