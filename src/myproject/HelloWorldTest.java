package myproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void コンソールに表示する文字列() {
		// fail("まだ実装されていません");
		assertEquals("Hello World!!", HelloWorld.makeMessage());
	}

}
