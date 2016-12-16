package singleton_template_factory;

import strategy.DiscountStrategy;

public abstract class TeaFactory {
	
	public boolean customerWantsIce = false;
	public boolean customerWantsSugar = false;
	
	protected abstract TeaProduct CreateTea();
	
	public final TeaProduct teaRecipe(){
		
		//Concrete Method
		boilWater();
		
		//Primitive Method
		brew();
		
		//Hook Method
		if(customerWantsIce()){
			addIce();
			customerWantsIce = true;
		}
		
		//Hook Method
		if(customerWantsSugar()){
			addSugar();
			customerWantsSugar = true;
		}
		
		//Concrete Method
		cupTea();
		
		return CreateTea();
	}
		
	//These methods must be overridden by the extending subclasses
	public abstract void brew();
	public abstract void addIce();
	public abstract void addSugar();
	
	//Concrete method
	public void boilWater(){
		System.out.println("	The Water is Boiling.");
	}
	public void cupTea(){
		System.out.println("	Cup the tea.");
	}
	
	//These are hook method.
	//If the user wants to override these they can.
	public boolean customerWantsIce() {
		return true;
	}
	public boolean customerWantsSugar() { 
		return true;
	}

}
