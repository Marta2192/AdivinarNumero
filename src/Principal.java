import java.util.Scanner;

public class Principal {

	private static Integer opcion;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menuPrincipal();
		
		
		
		
	
	}


	private static void segundaRonda() {
		System.out.println("¿Quieres volver a jugar?");
		String respuesta = sc.next();
		if(respuesta.equalsIgnoreCase("si")) {
			menuPrincipal();
		}else if(respuesta.equalsIgnoreCase("no")){
			System.exit(0);
		}
		
	}


	private static void opcion0() {
		System.exit(0);
		
	}

	private static void opcion2() {
		System.out.println("Escriba un número del 1 al 50, recuerde que tiene 5 intentos: ");
		
		opcion = sc.nextInt();
		
	}

	private static void opcion1() {
		int numeroRandom = (int) Math.floor(Math.random()*9+1);
		System.out.println("Escriba un número del 1 al 10, recuerde que tiene 3 intentos: ");
		
		System.out.println(numeroRandom);
		int contador=0;
		do {
			opcion = sc.nextInt();
			if(opcion>10) {
				System.out.println("Debe introducir un número del 1 al 10");
				opcion1();
			}
			if(opcion == numeroRandom) {
				
				System.out.println("Has acertado el número en " + ++contador + " intento(s)\r");
				segundaRonda();
				
			}if(opcion>numeroRandom){
				System.out.println("El número a adivinar es menor.\r");
				
					
			}if(opcion<numeroRandom){
				System.out.println("El número a adivinar es mayor.\r");
				
			}
			++contador;
		}while(opcion != numeroRandom && contador<3); 
			
		if(opcion != numeroRandom && contador>=3) {
			System.out.println("Has perdido! El número a adivinar era: " + numeroRandom + "\r");
			segundaRonda();
		}
	}

	private static void escogerOpcion() {
		
			if(opcion==1) {
				opcion1();
			}else if (opcion==2) {
				opcion2();
			}else if(opcion==0) {
				opcion0();
			}else {
				System.out.println("Opción INCORRECTA!!\r"
						+ "Las únicas opciones válidas son 0, 1 o 2.\r");
				
				menuPrincipal();
					}
				}
			
		
	private static void leerOpcion() {
		sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		//if(opcion.getClass()!= Class.forName(Integer));
		escogerOpcion();
	}

	private static void menuPrincipal() {
		System.out.println("ADIVINA EL NÚMERO\r\r"
				+ "1. Del 1 al 10 (3 intentos)\r"
				+ "2. Del 1 al 50 (5 intentos)\r"
				+ "0. Salir\r\r"
				+ "Escoja una opción:");
		leerOpcion();
	
	}

}
