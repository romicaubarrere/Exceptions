
import java.util.Scanner;

public class ExceptionCero {
	public static void main (String [] args) {
		//ejemplo controlar division entre 0
		
		int a = 24;
		System.out.println("Ingresar el b: ");
		Scanner ingreso = new Scanner (System.in);
		int b = ingreso.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("B no es valido");
		}
	}

}
