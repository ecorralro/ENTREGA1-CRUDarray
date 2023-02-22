import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = Desarrollo.inicializarArrays();
		String[] denominaciones = Desarrollo.inicializarArrays();
		String[] precios = Desarrollo.inicializarArrays();
		int posicion;
		/*
		 * nombres[0] = Desarrollo.addString("dime un nombre");
		 * System.out.println(Arrays.toString(nombres));
		 */
		// muestro menu
		int opcion;

		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:// XXXXXXXX
				System.out.println("AÑADIR");
				posicion = buscarPosicionVacia(nombres, denominaciones, precios);
				nombres[posicion] = addString("nombre de botella", nombres);
				denominaciones[posicion] = addString("denominacion", denominaciones);
				precios[posicion] = addString("precio", precios);
				break;
			case 2:
				System.out.println("MODIFICAR");
				break;
			case 3:
				System.out.println("BORRAR");
				break;
			case 4:
				System.out.println("BUSCAR");
				break;
			case 5:
				System.out.println("SALIR");
				break;

			default:
				Utilidades.mensaje("error");
				break;
			}

		} while (opcion != 5);
		System.out.println("fin");
		System.out.println(Arrays.toString(nombres));
		System.out.println(Arrays.toString(denominaciones));
		System.out.println(Arrays.toString(precios));

	}

	public static String addString(String texto, String[] nombres) {
		System.out.println(texto);
		String cadena = Utilidades.pedirString();

		return cadena;
	}

	private static int mostrarMenu() {
		int opcion;

		System.out.println("***MENU***");
		System.out.println("*************");
		System.out.println("*************");
		System.out.println("*1.AÑADIR*");
		System.out.println("*2.MODIFICAR*");
		System.out.println("*3.BORRAR*");
		System.out.println("*4.BUSCAR*");
		System.out.println("*5.SALIR*");
		System.out.println("*************");

		opcion = Utilidades.pedirIntTexto("Elige una opcion");
		return opcion;
	}

	private static void opcionesMenu(int opcion) {
		int posicion;
		String[] cadenas = new String[20];

	}

	private static int buscarPosicionVacia(String[] nombres, String[] denominaciones, String[] precios) {
		int posicion = 4;
		int longitud = 20;
		int contador = 0;
		boolean encontrado = true;

		do {
			if (nombres[posicion] == ("-")) {

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < longitud);

		return posicion;
	}
}
