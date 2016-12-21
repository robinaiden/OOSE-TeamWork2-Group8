package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.LemonTeaFactory;

public class LemonTeaFactoryTest {

	@Test
	public void testGetInstance() {
		assertNotNull("The LemonTeaFactory has been created unsuccessfully.", LemonTeaFactory.getInstance());
	}

}
