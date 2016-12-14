package main;

import decorator.GrassJellyDecorator;
import decorator.PuddingDecorator;
import decorator.TapiocaBallDecorator;
import decorator.TeaComponent;
import iterator.OrderIterator;
import iterator.TeaOrder;
import singleton_template_factory.BlackTeaFactory;
import singleton_template_factory.GreenTeaFactory;
import singleton_template_factory.LemonTeaFactory;
import singleton_template_factory.TeaFactory;
import strategy.Date;

public class ShopClerk {

	public static void main(String[] args) {
		// The ConcreteHamburger object is sent to the Cheese constructor
		// and then to the TomatoSauce
		Date date = Date.getInstance();
		
		TeaOrder teaOrder = new TeaOrder();
		
		//OrderIterator orderList = teaOrder.getIterator();
		
		System.out.println("This is BlackTea Factory.");
		
		TeaFactory teafactory1 = BlackTeaFactory.getInstance(date.holiday());
		TeaComponent aTea1 = teafactory1.orderTea();
		System.out.println("Original Price: " + aTea1.getCost());
		teafactory1.getDiscountStrategy();
		teaOrder.add(aTea1);
		
		System.out.println("Customer wants to add some Decorator:");
		aTea1 = new TapiocaBallDecorator(aTea1);
		aTea1 = new GrassJellyDecorator(aTea1);
		System.out.println("Ingredients:" + aTea1.getDescription());
		System.out.println("After Price: " + aTea1.getCost());
		teafactory1.getDiscountStrategy();
		
		System.out.println("---------------------------------");
		
		System.out.println("This is GreenTea Factory.");
		TeaFactory teafactory2 = GreenTeaFactory.getInstance(date.festival());
		TeaComponent aTea2 = teafactory2.orderTea();
		System.out.println("Original Price: " + aTea2.getCost());
		teafactory2.getDiscountStrategy();
		
		System.out.println("Customer wants to add some Decorator:");
		aTea2 = new TapiocaBallDecorator(aTea2);
		aTea2 = new GrassJellyDecorator(aTea2);
		aTea2 = new PuddingDecorator(aTea2);
		System.out.println("Ingredients:" + aTea2.getDescription());
		System.out.println("After Price: " + aTea2.getCost());
		teafactory2.getDiscountStrategy();
		teaOrder.add(aTea2);
		
		System.out.println("---------------------------------");
		
		System.out.println("This is LemonTea Factory.");
		TeaFactory teafactory3 = LemonTeaFactory.getInstance(date.festival());
		TeaComponent aTea3 = teafactory3.orderTea();
		System.out.println("Original Price: " + aTea3.getCost());
		teafactory3.getDiscountStrategy();
		
		System.out.println("Customer wants to add some Decorator:");
		//TeaComponent aTea3 = teafactory3;
		aTea3 = new GrassJellyDecorator(aTea3);
		aTea3 = new PuddingDecorator(aTea3);
		System.out.println("Ingredients:" + aTea3.getDescription());
		System.out.println("Original Price: " + aTea3.getCost());
		teafactory3.getDiscountStrategy();
		teaOrder.add(aTea3);
		
		System.out.println("---------------------------------");
		System.out.println("¦¬¾Ú¡G");
		OrderIterator orderList = teaOrder.getIterator();
		while(orderList.hasNext()) {
			TeaComponent s = orderList.next();
			System.out.println(s.getDescription() + "¡A" + s.getCost());
		}
		
	}

}
