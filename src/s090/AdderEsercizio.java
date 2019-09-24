package s090;

import java.util.Scanner;

public class AdderEsercizio {
	public static void main(String[] args) {
		System.out.println("Please, insert a number");

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int value = scanner.nextInt();
			if (value % 2 == 0) {
				System.out.println("positive");
			} else if (value % 2 != 0) {
				System.out.println("negative");
			} else if (value == 0) {
				System.out.println("End");

			}
			System.out.println("Bad input, discarded: " + scanner.nextInt());
		}
		scanner.close();
	}
}

//import java.util.Scanner;
//
//public class Adder {
//    public static void main(String[] args) {
//        System.out.println("Please, enter a few numbers");
//        double result = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            if (scanner.hasNextDouble()) {
//                result += scanner.nextDouble();
//            } else {
//                System.out.println("Bad input, discarded: " + scanner.next());
//            }
//        }
//        scanner.close(); // see try-with-resources
//        System.out.println("Total is " + result);
//    }
//}
////Control C per terminare, perchè è un loop infinito. In questo caso con Windows è Control Z.
//// Devo scrivere i numeri sotto in console.