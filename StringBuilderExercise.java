public class StringBuilderExercise {

	public static void main(String[] args) {
		
		String sequence = "";
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sequence = sequence + i;
			} else {
				sequence = i + sequence;
			}
		}
		System.out.println(sequence);
	}

}
