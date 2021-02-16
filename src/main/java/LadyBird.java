public class LadyBird implements Flying{
	private String name;
	private boolean isFemale;

	public void speak(String string) {
		System.out.println(string);
	}

    @Override
	public void fly() {
		speak("Buzz, Buzz");

	}
	@Override
	public void feed() {
		speak("I love aphid");
	}
}
