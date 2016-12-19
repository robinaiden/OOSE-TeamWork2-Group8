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
		
		// Get Checkstand instance. (取得收銀機物件)
		Checkstand checkstand = Checkstand.getInstance();
		
		System.out.println("This is BlackTea Factory.");
		// Obtain the object of the black tea factory. (取得紅茶工廠物件)
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		// After the template method is executed, a black tea object is obtained. (執行模板方法後，會得到紅茶物件)
		TeaComponent aTea1 = teafactory1.teaRecipe();
		// Show the basic price of black tea (顯示紅茶的基本價錢)
		System.out.println("Original Price : " + aTea1.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add tapiocaBall. (顧客想要加珍珠)
		aTea1 = new TapiocaBallDecorator(aTea1);
		// Customers want to add GrassJelly. (顧客想要加仙草)
		aTea1 = new GrassJellyDecorator(aTea1);
		// Shows those ingredients added. (顯示已加了那些配料)
		System.out.println("Ingredients : " + aTea1.getDescription());
		// Show the price after. (顯示之後的價錢)
		System.out.println("After Price : " + aTea1.getCost());
		// Add to the bill. (加入到訂單)
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
		
		System.out.println("----------------收據----------------");
		// ShopClerk Choose 10% Discount Strategy. (店員選擇了10%的折扣)
		checkstand.setStrategy(new TenPercentOffAlgorithm());
		// Print bill. (顯示帳單資訊)
		checkstand.printBill();
		
	}

}
