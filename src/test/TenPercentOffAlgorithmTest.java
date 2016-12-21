package test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

import strategy.TenPercentOffAlgorithm;

public class TenPercentOffAlgorithmTest {

	@Test
	public void testDiscount() {
		assertThat("TenPercentOffAlgorithm calculation error.", new TenPercentOffAlgorithm().discount(100), is(90.0));
	}

}
