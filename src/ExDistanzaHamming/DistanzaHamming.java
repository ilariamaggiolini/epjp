package ExDistanzaHamming;
//compare Stringhe di una stessa lunghezza, tornando un valore

//es: "ciao" "miao" è 1.

public class DistanzaHamming {

	public static int getDistanzaHamming(String sequence1, String sequence2) {
		int a = 0;
		String sequenceX = sequence1.toLowerCase();
		String sequenceY = sequence2.toLowerCase();
		for (int x = 0; x < sequenceX.length(); x++) {
			for (int y = 0; y < sequenceY.length(); y++) {
				if (sequenceX.charAt(x) == sequenceY.charAt(y)) {
					a += 0;
				} else if (sequenceX.charAt(x) != sequenceY.charAt(y)) {
					a += 1;
				}
			}
		}
		return a;
	}
}