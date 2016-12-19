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
		// Obtain the object of the black tea factory. (���o�����u�t����)
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		// After the template method is executed, a black tea object is obtained. (����ҪO��k��A�|�o���������)
		TeaComponent aTea1 = teafactory1.teaRecipe();
		// Show the basic price of black tea (��ܬ������򥻻���)
		System.out.println("Original Price : " + aTea1.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add tapiocaBall. (�U�ȷQ�n�[�ï])
		aTea1 = new TapiocaBallDecorator(aTea1);
		// Customers want to add GrassJelly. (�U�ȷQ�n�[�P��)
		aTea1 = new GrassJellyDecorator(aTea1);
		// Shows those ingredients added. (��ܤw�[�F���ǰt��)
		System.out.println("Ingredients : " + aTea1.getDescription());
		// Show the price after. (��ܤ��᪺����)
		System.out.println("After Price : " + aTea1.getCost());
		// Add to the bill. (�[�J��q��)
		checkstand.add(aTea1);
		
		System.out.println("---------------------------------");
		
		System.out.println("This is GreenTea Factory.");
		TeaFactory teafactory2 = GreenTeaFactory.getInstance();
		TeaComponent aTea2 = teafactory2.teaRecipe();
		System.out.println("Original Price : " + aTea2.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
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
		
		System.out.println("Customer wants to add some Ingredients:");
		aTea3 = new GrassJellyDecorator(aTea3);
		aTea3 = new PuddingDecorator(aTea3);
		System.out.println("Ingredients : " + aTea3.getDescription());
		System.out.println("After Price : " + aTea3.getCost());
		checkstand.add(aTea3);
		
		System.out.println("----------------����----------------");
		// ShopClerk Choose 10% Discount Strategy. (������ܤF10%���馩)
		checkstand.setStrategy(new TenPercentOffAlgorithm());
		// Print bill. (��ܱb���T)
		checkstand.printBill();
		
	}

}
