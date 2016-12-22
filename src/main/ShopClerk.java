package main;

import decorator.GrassJellyDecorator;
import decorator.PuddingDecorator;
import decorator.TapiocaBallDecorator;
import decorator.TeaComponent;
import singleton_template_factory.TeaFactory;
import strategy.Checkstand;
import strategy.TenPercentOffAlgorithm;

public class ShopClerk {

	public static void main(String[] args) {
		
		// Obtain the object of the checkstand. (���o���Ⱦ�����)
		Checkstand checkstand = Checkstand.getInstance();
		
		// Obtain the object of the factory. (���o�u�t����)
		TeaFactory teaFactory = TeaFactory.getInstance();
		
		// After the template method is executed, a black tea object is obtained. (����ҪO��k��A�|�o���������)
		TeaComponent aTea1 = teaFactory.createBlackTeaProduct();
		// Show the basic price of black tea (��ܬ������򥻻���)
		System.out.println("Original Price : " + aTea1.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add tapiocaBall. (�U�ȷQ�n�[�ï])
		aTea1 = new TapiocaBallDecorator(aTea1);
		// Customers want to add grassJelly. (�U�ȷQ�n�[�P��)
		aTea1 = new GrassJellyDecorator(aTea1);
		// Shows those ingredients added. (��ܤw�[�F���ǰt��)
		System.out.println("Ingredients : " + aTea1.getDescription());
		// Show the price after. (��ܤ��᪺����)
		System.out.println("After Price : " + aTea1.getCost());
		// Add to the bill. (�[�J��q��)
		checkstand.add(aTea1);
		
		System.out.println("---------------------------------");
		
		TeaComponent aTea2 = teaFactory.createGreenTeaProduct();
		System.out.println("Original Price : " + aTea2.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add tapiocaBall. (�U�ȷQ�n�[�ï])
		aTea2 = new TapiocaBallDecorator(aTea2);
		// Customers want to add grassJelly. (�U�ȷQ�n�[�P��)
		aTea2 = new GrassJellyDecorator(aTea2);
		// Customers want to add pudding. (�U�ȷQ�n�[���B)
		aTea2 = new PuddingDecorator(aTea2);
		System.out.println("Ingredients : " + aTea2.getDescription());
		System.out.println("After Price : " + aTea2.getCost());
		checkstand.add(aTea2);
		
		System.out.println("---------------------------------");
		
		TeaComponent aTea3 = teaFactory.createLemonTeaProduct();
		System.out.println("Original Price: " + aTea3.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add grassJelly. (�U�ȷQ�n�[�P��)
		aTea3 = new GrassJellyDecorator(aTea3);
		// Customers want to add pudding. (�U�ȷQ�n�[���B)
		aTea3 = new PuddingDecorator(aTea3);
		System.out.println("Ingredients : " + aTea3.getDescription());
		System.out.println("After Price : " + aTea3.getCost());
		checkstand.add(aTea3);
		
		System.out.println("----------------����----------------");
		// The clerk choose 10% discount strategy. (������ܤF10%���馩)
		checkstand.setStrategy(new TenPercentOffAlgorithm());
		// Show Bill. (��ܱb���T)
		checkstand.printBill();
		
	}

}
