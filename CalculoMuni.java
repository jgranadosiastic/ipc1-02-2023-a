import java.util.Scanner;

public class CalculoMuni {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int metrosCubicos;
	 	int zona;
	 	int kwHora;
	 	double total;
	 	double subtotalAgua;
	 	double subtotalEnergia;
		
		System.out.println("Ingrese metros cubicos consumidos");
		metrosCubicos = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Ingrese la zona");
		zona = Integer.valueOf(scanner.nextLine());
		
		System.out.println("Ingrese kw hora consumidos");
		kwHora = Integer.valueOf(scanner.nextLine());
	
		subtotalAgua = calcularAgua(metrosCubicos);
 		subtotalEnergia = calcularEnergia(kwHora, zona);
 	
	 	total = subtotalAgua + subtotalEnergia;
	 	System.out.println("El total a pagar es de ");
	 	System.out.println(total);
	}

	public static double calcularAgua(int cantidadMetros) {
		double subTotal;
	 	int excedente1;
	 	int excedente2;
	 	
	 	if (cantidadMetros <= 10) {
	 		subTotal = 10;
	 	} else if(cantidadMetros > 10 && cantidadMetros <= 100) {
	 		excedente1 = cantidadMetros - 10;
	 		subTotal = 10 + (excedente1 * 1.1);
	 	} else {
	 		excedente1 = 100 - 10;
	 		excedente2 = cantidadMetros - 100;
	 		subTotal = 10 + (excedente1 * 1.1) + (excedente2 * 2);
	 	}
	 	
	 	return subTotal;
	}
	
	public static double calcularEnergia(int cantidadKw, int zona) {
		double subTotal;
	 	
	 	if (zona == 1) {
	 		subTotal = cantidadKw * 0.75;
	 	} else if(zona > 4 && zona <=  8) {
	 		subTotal = cantidadKw * 1.15;
	 	} else {
	 		subTotal = cantidadKw * 1.25;
	 	}
	 	
	 	return subTotal;
	}

}
