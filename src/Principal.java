import java.util.Scanner;

public class Principal {

	private static int opcion;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menuPrincipal();
		leerOpcion();
		escogerOpcion();		
		//ÚNICO MÉTODO Y VARIOS IFS? UN SWITCH?
	}


	private static void opcion0() {
		System.exit(0);
		
	}

	private static void opcion2() {
		System.out.println("Escriba un número del 1 al 50, recuerde que tiene 5 intentos: ");
		
		opcion = sc.nextInt();
		
	}

	private static void opcion1() {
		System.out.println("Escriba un número del 1 al 10, recuerde que tiene 3 intentos: ");
		
		opcion = sc.nextInt();
	}

	private static void escogerOpcion() {
		
//		switch(opcion) {
//		case 0:
//			opcion0();
//		case 1:
//			opcion1();
//		case 2:
//			opcion2();
//		default:
//			System.out.println("Opción INCORRECTA!!\r"
//					+ "Las únicas opciones válidas son 0, 1 o 2.\r");
			
			if(opcion==1) {
				opcion1();
			}else if (opcion==2) {
				opcion2();
			}else if(opcion==0) {
				opcion0();
			}else {
				System.out.println("Opción INCORRECTA!!\r"
						+ "Las únicas opciones válidas son 0, 1 o 2.\r");
					}
				}
			
		
	private static void leerOpcion() {
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
	}

	private static void menuPrincipal() {
		System.out.println("ADIVINA EL NÚMERO\r\r"
				+ "1. Del 1 al 10 (3 intentos)\r"
				+ "2. Del 1 al 50 (5 intentos)\r"
				+ "0. Salir\r\r"
				+ "Escoja una opción:");
		
	
	}

}
