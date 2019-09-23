package s066bis2;

public class Persona {
	protected String nome;
	protected String cognome;

	public Persona(String n, String c) {
		this.cognome = c;
		this.nome = n;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}

}

//	public void String(int name) {
//		System.out.println("name");
//	}
//public void stipendio(int number) {
// System.out.println("number");
//}
//}
//
//// public class Vehicle {
//
////public void steer(boolean right) {
////    System.out.println("Steering " + (right ? "right" : "left"));
////}
////
////}