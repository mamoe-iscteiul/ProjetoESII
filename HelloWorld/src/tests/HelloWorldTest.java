package tests;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import program.HelloWorld;

class HelloWorldTest {
	
	/**
	 * Unit test for HelloWorld.
	 */
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Test
	void testSayHello() {
		System.setOut(new PrintStream(outContent));
		int times = 5;
		HelloWorld hello = new HelloWorld();
		hello.sayHello(times);
		String resultadoEsperado = new String("");
		for(int i = 0; i<times; i++) {
			if(resultadoEsperado.equals(""))
					resultadoEsperado = "Hello world\n";
			else
				resultadoEsperado = resultadoEsperado.concat("Hello world\n");
			
		}
		assertEquals(resultadoEsperado.strip(), outContent.toString().strip());
		System.setOut(originalOut);
	}

}
