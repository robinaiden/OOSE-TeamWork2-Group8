package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BlackTeaProductTest.class, GrassJellyDecoratorTest.class, GreenTeaProductTest.class,
		LemonTeaProductTest.class, PuddingDecoratorTest.class, TapiocaBallDecoratorTest.class, TeaFactoryTest.class,
		TenPercentOffAlgorithmTest.class, TwentyPercentOffAlgorithmTest.class })
public class AllTests {

}
