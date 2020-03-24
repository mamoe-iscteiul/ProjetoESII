package program;

public class HelloWorld {
	/**
	 * Simple class that says "Hello world".
	 */
	
	static final String HELLO_WORLD = "Hello world\n";

	 /**
     * Say "Hello world".
     *
     * @param timesToSayHello number of times to print.
     */
	public void sayHello(int timesToSayHello) {
		for(int i = 0; i < timesToSayHello; i++) {
			System.out.print(HELLO_WORLD);
		}
	}
}
