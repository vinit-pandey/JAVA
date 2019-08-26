import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCat {

	@Test
	public void ConCat() {
		Demo1 demo=new Demo1();
		String str=demo.stringConCat("Hello", "World");
		assertEquals("HelloWorld", str);
	}

}
