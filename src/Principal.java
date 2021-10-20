import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menuPrincipal();
		leerOpcion();
		opcion1();
		opcion2();
		opcion0();
	}

	private static void opcion0() {
		System.exit(0);
		
	}

	private static void opcion2() {
		// TODO Auto-generated method stub
		
	}

	private static void opcion1() {
		// TODO Auto-generated method stub
		
	}

	private static void leerOpcion() {
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		
	}

	private static void menuPrincipal() {
		System.out.println("ADIVINA EL NÚMERO\r\r"
				+ "1. Del 1 al 10 (3 intentos)\r"
				+ "2. Del 1 al 50 (5 intentos\r"
				+ "0. Salir\r\r"
				+ "Escoja una opción:");
		
	}

}
