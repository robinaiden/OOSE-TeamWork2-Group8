package main;

import Decorator.GrassJellyDecorator;
import Decorator.PuddingDecorator;
import Decorator.TapiocaBallDecorator;
import Decorator.TeaComponent;
import TemplateFactory.BlackTeaFactory;
import TemplateFactory.GreenTeaFactory;
import TemplateFactory.LemonTeaFactory;
import TemplateFactory.TeaFactory;

public class ShopClerk {

	public static void main(String[] args) {
		// The ConcreteHamburger object is sent to the Cheese constructor
		// and then to the TomatoSauce
		
		System.out.println("This is BlackTea Factory.");
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		teafactory1.orderTea();
		
		System.out.println("Customer wants to add some Decorator:");
		TeaComponent aTea1 = teafactory1;
		aTea1 = new TapiocaBallDecorator(aTea1);
		aTea1 = new GrassJellyDecorator(aTea1);
		System.out.println("Ingredients:" + aTea1.getDescription());
		System.out.println("Original Price: " + aTea1.getCost());
		
		System.out.println("---------------------------------");
		
		System.out.println("This is GreenTea Factory.");
		TeaFactory teafactory2 = GreenTeaFactory.getInstance();
		teafactory2.orderTea();
		
		System.out.println("Customer wants to add some Decorator:");
		TeaComponent aTea2 = teafactory2;
		aTea2 = new TapiocaBallDecorator(aTea2);
		aTea2 = new GrassJellyDecorator(aTea2);
		aTea2 = new PuddingDecorator(aTea2);
		System.out.println("Ingredients:" + aTea2.getDescription());
		System.out.println("Original Price: " + aTea2.getCost());
		
		System.out.println("---------------------------------");
		
		System.out.println("This is LemonTea Factory.");
		TeaFactory teafactory3 = LemonTeaFactory.getInstance();
		teafactory3.orderTea();
		
		System.out.println("Customer wants to add some Decorator:");
		TeaComponent aTea3 = teafactory3;
		aTea3 = new GrassJellyDecorator(aTea3);
		aTea3 = new PuddingDecorator(aTea3);
		System.out.println("Ingredients:" + aTea3.getDescription());
		System.out.println("Original Price: " + aTea3.getCost());
	}

}
