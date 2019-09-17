
public class Exercise {
	public static void main(String[] arg) {
		boolean[] flags = { true, false, false };

		for (int i = 0; i < flags.length; i++) {
			System.out.println(flags[i]);
		}

		int i = 0;
		for (;;) {
			if (flags[i] == false) {
				flags[i] = true;
			}

			System.out.println(flags[i]);
			i++;
			if (i == 3) {
				break;
			}
		}
	}
}
