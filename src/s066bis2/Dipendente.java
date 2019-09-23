package s066bis2;

public class Dipendente extends Persona {
	private int salario;

	public Dipendente(String n, String c, int salario) {
		super(n, c);
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Dipendente [salario=" + salario + "]";
	}

}

//public class Car extends Vehicle implements Conditioning {

//@Override
//
//public void setTemperature(int newTemp) {
//
//	System.out.println("Car temperature now is " + newTemp);
//
//}
//}

//public class MotorBike extends Vehicle {
//public void steer(boolean right, int angle) {
//
//	System.out.println("Steering " + (right ? "right" : "left"));
//
//}
//}