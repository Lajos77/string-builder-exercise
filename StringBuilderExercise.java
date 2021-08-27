public class StringBuilderExercise {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sb.append(i);
			} else {
				sb.insert(0, i);
			}

		}
		System.out.println(sb);

	}

}
