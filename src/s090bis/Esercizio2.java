package s090bis;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Esercizio2 {
	public static void main(String args[]) {

		File f = new File("/Users/Administrator/git/epjp/src/s090bis/Esercizio2.txt");
		try {
			if (f.exists() == false) {
				PrintWriter pw = new PrintWriter(new FileWriter(f));
				pw.println("12");
				pw.println("27");
				pw.println("0");
				pw.println("51");
				pw.flush();
				pw.close();
			}

		} catch (IOException e) {

		}
	}
}
