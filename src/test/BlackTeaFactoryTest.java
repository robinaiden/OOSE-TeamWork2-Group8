package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton_template_factory.BlackTeaFactory;

public class BlackTeaFactoryTest {
	
	@Test
	public void testGetInstance() {
		assertNotNull("The BlackTeaFactory has been created unsuccessfully.", BlackTeaFactory.getInstance());
	}

}
