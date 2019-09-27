package ExStat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.TreeMap;

public class Stat {
	public static void main(String[] args) {
		String s = "chiara";
		System.out.println(s);
		System.out.println(getStat(s));
		System.out.println();
	}

	public static Entry<Integer, Character> getStat(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		TreeMap<Integer, Character> tm = new TreeMap<Integer, Character>();
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> a = it.next();
			tm.put(a.getValue(), a.getKey());
		}
		tm.lastEntry();
		return tm.lastEntry();
	}
}