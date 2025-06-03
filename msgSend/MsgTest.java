package msgSend;

import static org.junit.Assert.*;

import org.junit.Test;

public class MsgTest {
	String msg1 = "Hell";
	msgSender ms = new msgSender(msg1);

	@Test
	public void test() {
		assertEquals(msg1,ms.getMessage());
	}

}
