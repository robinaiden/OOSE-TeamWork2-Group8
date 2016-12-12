package main;

import factory.BlackTeaFactory;
import factory.TeaFactory;

public class ShopClerk {

	public static void main(String[] args) {
		TeaFactory blackTeaFactory = BlackTeaFactory.getInstance();
		TeaFactory blackTeaFactory1 = BlackTeaFactory.getInstance();
		System.out.println(blackTeaFactory);
		System.out.println(blackTeaFactory1);
	}

}
