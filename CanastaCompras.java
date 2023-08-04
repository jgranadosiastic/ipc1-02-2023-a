import java.util.Scanner;
public class CanastaCompras {

	public static final double CONSUMO_MINIMO = 500;
	public static final double DESCUENTO_1 = 0.1;
	public static final double DESCUENTO_2 = 0.15;

	public static void main(String[] args) {
		String opcion;
		double subtotal = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			subtotal = registrarPrecio(subtotal);
			do {
				System.out.println("Si quiere pagar ingrese la letra P, si quiere continuer presione la letra C");
				opcion = scanner.nextLine();
				if (!opcion.equalsIgnoreCase("C") && !opcion.equalsIgnoreCase("P")) {
					System.out.println("Ingrese P o C");
				}
			} while(!opcion.equalsIgnoreCase("C") && !opcion.equalsIgnoreCase("P"));
		} while(opcion.equalsIgnoreCase("C"));
		
		calcularDescuento(subtotal);
	}

	public static void calcularDescuento(double subtotal) {
		double descuento;
		if (subtotal <= CONSUMO_MINIMO) {
			descuento = subtotal * DESCUENTO_1;
			subtotal = subtotal - descuento;
		} else {
			descuento = subtotal * DESCUENTO_2;
			subtotal = subtotal - descuento;
		}
	
		System.out.println("Su descuento  fue de: Q ");
		System.out.println( descuento);
		System.out.println( "El total a pagar es de: Q.");
		System.out.println(subtotal);
	}
	
	public static double registrarPrecio(double subtotal) {
		double precio;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el precio del producto");
		precio = Double.valueOf(scanner.nextLine());
		
		return subtotal + precio;
	}
}
