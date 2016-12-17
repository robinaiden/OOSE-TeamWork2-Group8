package test;

import static org.junit.Assert.*;
import org.junit.Test;

import singleton_template_factory.BlackTeaFactory;
import singleton_template_factory.GreenTeaFactory;
import singleton_template_factory.TeaFactory;

public class SingletonFactoryTest {

	@Test
	public void BlackTeaFactoryTest() {
		TeaFactory teafactory1 = BlackTeaFactory.getInstance();
		TeaFactory teafactory2 = BlackTeaFactory.getInstance();
		assertSame(teafactory1, teafactory2);
	}
	
	@Test
	public void GreenTeaFactoryTest() {
		TeaFactory teafactory1 = GreenTeaFactory.getInstance();
		TeaFactory teafactory2 = GreenTeaFactory.getInstance();
		assertSame(teafactory1, teafactory2);
	}
	
	@Test
	public void LemonTeaFactoryTest() {
		TeaFactory teafactory1 = GreenTeaFactory.getInstance();
		TeaFactory teafactory2 = GreenTeaFactory.getInstance();
		assertSame(teafactory1, teafactory2);
	}

}
