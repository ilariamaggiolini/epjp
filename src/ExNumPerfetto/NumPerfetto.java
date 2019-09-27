package ExNumPerfetto;

import java.util.Scanner;
//Verifica se un numero inserito da tastiera e' perfetto
public class NumPerfetto {
	public static void main(String[] args) {
		int n;
		int divisore;
		int sommaDivisori;
		Scanner lettore = new Scanner(System.in);

		System.out.print("Digita un naturale: ");
		n = lettore.nextInt();

		divisore = 1;
		sommaDivisori = 0;
		while (divisore < n) {
			if (n % divisore == 0)
				sommaDivisori = sommaDivisori + divisore;
			divisore = divisore + 1;
		}
		if (sommaDivisori == n)
			System.out.println(n + " e' perfetto");
		else
			System.out.println(n + " non e' perfetto");
	}
}
