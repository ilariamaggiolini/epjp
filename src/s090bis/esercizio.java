package s090bis;

import java.io.File;
//
//public class esercizio {
//public static void main (String args[]) {
//}
//

//import java.io.*;
//public class CopyFile {
//
//   public static void main(String args[]) throws IOException {
//      FileReader in = null;
//      FileWriter out = null;
//
//      try {
//         in = new FileReader("input.txt");
//         out = new FileWriter("output.txt");
//         
//         int c;
//         while ((c = in.read()) != -1) {
//            out.write(c);
//         }
//      }finally {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//      }
//   }
//}

//import java.io.*;
//public class ReadConsole {
//
//   public static void main(String args[]) throws IOException {
//      InputStreamReader cin = null;
//
//      try {
//         cin = new InputStreamReader(System.in);
//         System.out.println("Enter characters, 'q' to quit.");
//         char c;
//         do {
//            c = (char) cin.read();
//            System.out.print(c);
//         } while(c != 'q');
//      }finally {
//         if (cin != null) {
//            cin.close();
//         }
//      }
//   }
//}