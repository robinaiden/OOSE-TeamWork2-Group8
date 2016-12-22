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
		
		// Obtain the object of the checkstand. (取得收銀機物件)
		Checkstand checkstand = Checkstand.getInstance();
		
		// Obtain the object of the factory. (取得工廠物件)
		TeaFactory teaFactory = TeaFactory.getInstance();
		
		// After the template method is executed, a black tea object is obtained. (執行模板方法後，會得到紅茶物件)
		TeaComponent aTea1 = teaFactory.createBlackTeaProduct();
		// Show the basic price of black tea (顯示紅茶的基本價錢)
		System.out.println("Original Price : " + aTea1.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add tapiocaBall. (顧客想要加珍珠)
		aTea1 = new TapiocaBallDecorator(aTea1);
		// Customers want to add grassJelly. (顧客想要加仙草)
		aTea1 = new GrassJellyDecorator(aTea1);
		// Shows those ingredients added. (顯示已加了那些配料)
		System.out.println("Ingredients : " + aTea1.getDescription());
		// Show the price after. (顯示之後的價錢)
		System.out.println("After Price : " + aTea1.getCost());
		// Add to the bill. (加入到訂單)
		checkstand.add(aTea1);
		
		System.out.println("---------------------------------");
		
		TeaComponent aTea2 = teaFactory.createGreenTeaProduct();
		System.out.println("Original Price : " + aTea2.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add tapiocaBall. (顧客想要加珍珠)
		aTea2 = new TapiocaBallDecorator(aTea2);
		// Customers want to add grassJelly. (顧客想要加仙草)
		aTea2 = new GrassJellyDecorator(aTea2);
		// Customers want to add pudding. (顧客想要加布丁)
		aTea2 = new PuddingDecorator(aTea2);
		System.out.println("Ingredients : " + aTea2.getDescription());
		System.out.println("After Price : " + aTea2.getCost());
		checkstand.add(aTea2);
		
		System.out.println("---------------------------------");
		
		TeaComponent aTea3 = teaFactory.createLemonTeaProduct();
		System.out.println("Original Price: " + aTea3.getCost());
		
		System.out.println("Customer wants to add some Ingredients:");
		// Customers want to add grassJelly. (顧客想要加仙草)
		aTea3 = new GrassJellyDecorator(aTea3);
		// Customers want to add pudding. (顧客想要加布丁)
		aTea3 = new PuddingDecorator(aTea3);
		System.out.println("Ingredients : " + aTea3.getDescription());
		System.out.println("After Price : " + aTea3.getCost());
		checkstand.add(aTea3);
		
		System.out.println("----------------收據----------------");
		// The clerk choose 10% discount strategy. (店員選擇了10%的折扣)
		checkstand.setStrategy(new TenPercentOffAlgorithm());
		// Show Bill. (顯示帳單資訊)
		checkstand.printBill();
		
	}

}
