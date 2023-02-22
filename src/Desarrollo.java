import java.util.Arrays;
import java.util.Scanner;

public class Desarrollo {

	// opciones MENU
	/*public static void menu() {
		int opcion;
		int posicion;
		opcion = Utilidades.pedirIntTexto("Dime una opcion");

		switch (opcion) {
		case 1:
			System.out.println("AÑADIR");
			posicion=buscarPosicionVacia(nombres);
			addString(null);
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
			mensaje("error");
			break;
		}
	} */

	

	// add string
	
	// buscar posicion "vacía"

	/*public static int buscarPosicionVacia(String[] cadenas) {
		int posicion = 0;
		int longitud = 20;
		boolean encontrado = true;
		
		do {
			if (cadenas[posicion].equals(null)) {

			}
			posicion++;
		} while (!encontrado && posicion < longitud);

		return posicion;
	}*/

	// inicializar Arrays con "-" para facilitar búsqueda
	public static String[] inicializarArrays() {
		String[] contenidos = new String[20];
		String contenido = "-";

		for (int i = 0; i < contenidos.length; i++) {
			contenidos[i] = contenido;

		}
		return contenidos;
	}
}
