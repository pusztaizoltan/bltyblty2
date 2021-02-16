import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {


		Bird b1 = new Bird();
		Bird b2 = new Bird();
		LadyBird l1 = new LadyBird();
		LadyBird l2 = new LadyBird();
		for (Bird bird : Arrays.asList(b1, b2)) {
			bird.fly();
		}
		for (LadyBird ladyBird : Arrays.asList(l1, l2)) {
			ladyBird.fly();
		}

		for (Bird bird : Arrays.asList(b1, b2)) {
			bird.feed();
		}
		for (LadyBird ladyBird : Arrays.asList(l1, l2)) {
			ladyBird.feed();
		}
		List<Flying> collect = new ArrayList<>();
		for (int i = 0; i < 0; i++) {
			collect.add(new Bird());
			collect.add(new LadyBird());

		}
	}
}
