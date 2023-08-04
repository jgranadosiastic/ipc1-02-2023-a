import java.util.Scanner;

public class sumarDosNumeros {

	public static void main(String[] args) {
		double primerNumero;
		double segundoNumero;
		double total;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar primer numero");
		primerNumero = Double.valueOf(scanner.nextLine());
		
		System.out.println("Ingresar segundo numero");
		segundoNumero = Double.valueOf(scanner.nextLine());
		
		total = primerNumero + segundoNumero;
		System.out.println("El resultado de la suna es:");
		System.out.println(total);
	}



}
