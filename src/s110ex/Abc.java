package s110ex;
//

import java.util.ArrayList;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.TreeSet;
//
//public class Abc {
//
//	public static void main(String[] args) {
//		String s = "abcabc";
//		System.out.println((s));
//	}
//public static List<Character> x = new ArrayList<>();
//}

//List<Character> x = new.ArrayList<>();

//import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Abc {
	public static void main(String[] args) {
		String s = new String();
		s = "absba";
		List<Character> lst = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			lst.add(s.charAt(i));
		}
		System.out.println(lst);

		TreeSet<Character> ts = new TreeSet<>(lst);

		System.out.println("Simple tree: " + ts);
	}
}
