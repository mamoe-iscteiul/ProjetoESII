package tests;

import org.junit.jupiter.api.Test;

import program.HelloWorldMain;

class HelloWorldMainTest {
	/**
	 * Unit test for HelloWorldMain.
	 * 
	 */
	@Test
	void testMain() {
		String[] args = { "1" };
		HelloWorldMain.main(args);
	}

}
