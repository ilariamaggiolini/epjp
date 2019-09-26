package ExStat;

import java.util.*;

public class Stat {

	public static void main(String[] args) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		String s = "abcbab";
		String unique = new String();

		for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), (int) h.get(s.charAt(i)) + 1);
			} else {
				h.put(s.charAt(i), 1);
				unique += s.charAt(i);
			}
		}

		Set<Map.Entry<Character, Integer>> freq = h.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = freq.iterator();

		while (it.hasNext()) {
			Map.Entry<Character, Integer> item = it.next();
			System.out.println(item.getKey() + ": " + item.getValue());
		}
	}
}