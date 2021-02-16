public class Bird implements Flying{
	private String name;
	private boolean isFemale;

	public void speak(String string) {
		System.out.println(string);
	}

	@Override
	public void fly() {
		speak("Csájp, Csájp");

	}

	@Override
	public void feed() {
		speak("What a wonderful worm");

	}
}
