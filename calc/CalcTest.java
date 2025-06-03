package calc;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
	SimpleCalc c1 = new SimpleCalc();
	int sum1 = 16;
	int sum2 = c1.add(10, 5);
	@Test
	public void test() {
		assertEquals(sum1,sum2);
	}

}
