package s106ex;

public class Main {
public static void main (String[]args) {
	MyList ml= new MyList();
	System.out.println("Empty list" + ml);
	
	ml.add(42);
	System.out.println("List with one node" + ml.toString());
	
	ml.add(-7);
	System.out.println("List with one node" +ml.toString());
}

}
