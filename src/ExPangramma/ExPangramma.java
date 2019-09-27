package ExPangramma;

public class ExPangramma {

	static boolean isPangramString(String s) {
		if (s.length() < 26)
			return false;
		else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (s.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
