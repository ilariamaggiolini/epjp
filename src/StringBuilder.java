
public class StringBuilder {

	public static void main(String[] args) {
		String v = "BoB";

		for (int i = 0; i < v.length(); i++) {
			char current = v.charAt(i);

			if (current >= 'a' && current <= 'z') {
				System.out.println((char) (current - 32));
			} else {

				System.out.println(current);

			}
		}

		for (int i = 0; i < v.length(); i++) {
			char current = v.charAt(i);

			if (current >= 'A' && current <= 'Z') {
				System.out.print((char) (current + 32));
			} else {

				System.out.print(current);
			}
		}
		System.out.print("My toUpper(): " + toUpper("BoB"));
	}

	public static String toUpper(String v) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < v.length(); i++) {
			char current = v.charAt(i);

			if (current >= 'a' && current <= 'z') {
			}

		}

		return sb.toString();
	}
}
