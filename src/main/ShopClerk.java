package main;

import decorator.GrassJellyDecorator;
import decorator.PuddingDecorator;
import decorator.TapiocaBallDecorator;
import decorator.TeaComponent;
import singleton_template_factory.BlackTeaFactory;
import singleton_template_factory.GreenTeaFactory;
import singleton_template_factory.LemonTeaFactory;
import singleton_template_factory.TeaFactory;
import strategy.Checkstand;
import strategy.TenPercentOffAlgorithm;

public class ShopClerk {

	public static void main(String[] args) {
		
		// Get Checkstand instance. (���o���Ⱦ�����)
		Checkstand checkstand = Checkstand.getInstance();
		
		System.out.println("This is BlackTea Factory.");
		// Get BlackTeaFactory instance. (���o�����u�t����)
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		// Execute Template Method, then get the BlackTea instance. (����ҪO��k��A�|�o���������)
		TeaComponent aTea1 = teafactory1.teaRecipe();
		// Show the BlackTea original price.
		System.out.println("Original Price : " + aTea1.getCost());
		
		System.out.println("Customer wants to add some Decorator:");
		// Customer wants TapiocaBall. (�U�ȷQ�n�[�ï])
		aTea1 = new TapiocaBallDecorator(aTea1);
		// Customer wants GrassJelly. (�U�ȷQ�n�[�P��)
		aTea1 = new GrassJellyDecorator(aTea1);
		System.out.println("Ingredients : " + aTea1.getDescription());
		System.out.println("After Price : " + aTea1.getCost());
		// Add to bill. (�[�J��q��)
		checkstand.add(aTea1);
		
		System.out.println("---------------------------------");
		
		System.out.println("This is GreenTea Factory.");
		TeaFactory teafactory2 = GreenTeaFactory.getInstance();
		TeaComponent aTea2 = teafactory2.teaRecipe();
		System.out.println("Original Price : " + aTea2.getCost());
		
		System.out.println("Customer wants to add some Decorator:");
		aTea2 = new TapiocaBallDecorator(aTea2);
		aTea2 = new GrassJellyDecorator(aTea2);
		aTea2 = new PuddingDecorator(aTea2);
		System.out.println("Ingredients : " + aTea2.getDescription());
		System.out.println("After Price : " + aTea2.getCost());
		checkstand.add(aTea2);
		
		System.out.println("---------------------------------");
		
		System.out.println("This is LemonTea Factory.");
		TeaFactory teafactory3 = LemonTeaFactory.getInstance();
		TeaComponent aTea3 = teafactory3.teaRecipe();
		System.out.println("Original Price: " + aTea3.getCost());
		
		System.out.println("Customer wants to add some Decorator:");
		aTea3 = new GrassJellyDecorator(aTea3);
		aTea3 = new PuddingDecorator(aTea3);
		System.out.println("Ingredients : " + aTea3.getDescription());
		System.out.println("After Price : " + aTea3.getCost());
		checkstand.add(aTea3);
		
		System.out.println("----------------����----------------");
		checkstand.setStrategy(new TenPercentOffAlgorithm());
		checkstand.printBill();
		
	}

}
