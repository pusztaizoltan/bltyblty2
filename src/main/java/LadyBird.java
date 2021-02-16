public class LadyBird implements Flying{
	private String name;
	private boolean isFemale;

	public void speak(String string) {
		System.out.println(string);
	}

	public void fly() {
		speak("Buzz, Buzz");

	}
	public void feed() {
		speak("I love aphid");
	}
}
