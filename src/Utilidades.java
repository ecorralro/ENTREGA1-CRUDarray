import java.util.Scanner;

public class Utilidades {
	public static int pedirIntTexto(String texto) {
		int numero;
		Scanner lector = new Scanner(System.in);

		System.out.println(texto);
		numero = lector.nextInt();
		lector.nextLine();

		return numero;
	}

	public static int pedirInt() {
		int numero;
		Scanner lector = new Scanner(System.in);

		numero = lector.nextInt();

		return numero;
	}

	public static String pedirStringTexto(String texto) {
		String cadena;
		Scanner lector = new Scanner(System.in);

		System.out.println(texto);
		cadena = lector.nextLine();
		

		return cadena;
	}
	public static String pedirString() {
		String cadena;
		Scanner lector = new Scanner(System.in);

		cadena = lector.nextLine();

		return cadena;
	}

	public static boolean validarRango(int numero, int numero2, int resultado, String texto) {
		boolean rango = true;
		int numUsuario = resultado;
		if (numUsuario < numero || numUsuario > numero2) {
			System.out.println(texto);
			rango = false;
		}

		return rango;

	}
	public static String pasarMayus (String texto) {
		String cadena;
		cadena=texto.toUpperCase();
		
		return cadena;
	}
	public static void mensaje(String texto) {
		System.out.println(texto);
		
	}

}
