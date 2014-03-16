package nz.ac.auckland.lmz.flags;

/**
 * @author: Richard Vowles - https://plus.google.com/+RichardVowles
 */
public enum Flags {
	// are we in dev mode. Normally set by a test.
	DEVMODE("lmz.devmode");

	private final String property;

	public boolean on() {
		return "true".equalsIgnoreCase(System.getProperty(property));
	}

	public void turnOn() {
		System.setProperty(property, "true");
	}

	private Flags(String property) {
		this.property = property;
	}
}
