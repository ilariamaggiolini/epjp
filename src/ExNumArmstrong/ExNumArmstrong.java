package ExNumArmstrong;

public class ExNumArmstrong {
//la dimensione è uguale all'esponente
//risultato è uguale somma dei numeri
//153=1^3+5^3+3^3
	static boolean isArmstrong(int num) {
		int contatore = 0;
		int numero = num;
		while (numero != 0) {
			numero = numero / 10; // se divido sempre x 10 su un intero arrivo a trovare la dimensione e a contare
									// fino allo zero con il contatore
			contatore = contatore + 1;
		}
		// adesso divido per leggere e trovare i numeri da sommare:
		int rest = num;
		int value = num;
		rest = value % 10;
		rest++;
		double result = Math.pow(rest, contatore);
		
		return true;
	}

}

// Metodo senza il booleano:

class ArmstrongWhile
{
	public static void main(String[] arg)
	{
	int i=100,arm;
	System.out.println("Armstrong numbers between 100 to 999");
	while(i<1000)
	{
	arm=armstrongOrNot(i);
	if(arm==i)
	System.out.println(i);
	i++;
	}
	}
static int armstrongOrNot(int num)
{
	int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
}
