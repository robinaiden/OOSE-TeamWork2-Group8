package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BlackTeaFactoryTest.class, BlackTeaProductTest.class, GrassJellyDecoratorTest.class,
		GreenTeaFactoryTest.class, GreenTeaProductTest.class, LemonTeaFactoryTest.class, LemonTeaProductTest.class,
		PuddingDecoratorTest.class, TapiocaBallDecoratorTest.class, TenPercentOffAlgorithmTest.class,
		TwentyPercentOffAlgorithmTest.class })
public class AllTests {

}
