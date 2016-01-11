import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;


public class TestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(4, MyCalculator.add(2, 2));
	}

}
