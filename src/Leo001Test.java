import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Leo001Test {
	private static Leo001 leo001  = new Leo001();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testJiafa() {
		leo001.Jiafa(5);
		leo001.Jiafa(9);
		assertEquals(14, leo001.getResult());
	}

}
