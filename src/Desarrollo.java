import java.util.Arrays;
import java.util.Scanner;

public class Desarrollo {

	// inicializar Arrays con "-" para facilitar búsqueda
	public static String[] inicializarArrays() {
		String[] contenidos = new String[20];
		String contenido = "-";

		for (int i = 0; i < contenidos.length; i++) {
			contenidos[i] = contenido;

		}
		return contenidos;
	}

	// MOSTRAR MENU
	/**
	 * 
	 * @return devuelve la opcion elegida por el usuario
	 */
	public static int mostrarMenu() {
		int opcion;

		System.out.println("***MENU***");
		System.out.println("*************");
		System.out.println("*************");
		System.out.println("***1.AÑADIR***");
		System.out.println("***2.MODIFICAR***");
		System.out.println("***3.BORRAR***");
		System.out.println("***4.BUSCAR***");
		System.out.println("***5.MOSTRAR***");
		System.out.println("***6.SALIR***");
		System.out.println("*************");

		opcion = Utilidades.pedirIntTexto("Elige una opcion");
		return opcion;
	}

	// AÑADIR
	/**
	 * 
	 * @param texto
	 * @param nombres
	 * @return
	 */
	public static String addString(String texto, String contenido) {

		String cadena = Utilidades.pedirStringTexto(texto);
		cadena = cadena.toUpperCase();

		return cadena;
	}

	/**
	 * 
	 * @param nombres
	 * @param denominaciones
	 * @param precios
	 * @return
	 */
	public static int buscarPosicionVacia(int vuelta,String[] nombres, String[] denominaciones, String[] precios) {
		int posicion = vuelta;
		int longitud = nombres.length;
		int contador = 0;
		boolean encontrado = true;

		do {
			if (nombres[posicion]==null) {

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < nombres.length);
		System.out.println(posicion + "metodo");
		System.out.println(nombres.length + "metodo");

		return posicion;
	}

	public static int buscarPosicion(int posicionBuscar, String nombre, String[] nombres, String[] denominaciones,
			String[] precios) {
		int posicion = posicionBuscar;
		int longitud = nombres.length;
		boolean encontrado = true;
		nombre = busqueda();
		nombre = nombre.toUpperCase();
		do {
			if (nombres[posicion] == nombre) {

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < nombres.length);
		System.out.println(posicion + "metodo");
		System.out.println(nombres.length + "metodo");

		return posicion;
	}

	/**
	 * 
	 * @param nombre
	 * @param nombres
	 * @param denominaciones
	 * @param precios
	 * @return
	 */
	public static int modificarRegistroUsuario(int posicionModificar, String nombre, String[] nombres,
			String[] denominaciones, String[] precios) {
		int posicion = posicionModificar;
		int longitud = nombres.length;
		boolean encontrado = false;
		nombre = busqueda();
		nombre = nombre.toUpperCase();

		do {
			if (nombres[posicionModificar] == nombre) {
				encontrado = true;
			} else {
				posicionModificar++;
			}

		} while (!encontrado && posicionModificar < longitud);

		return posicionModificar;
	}

	/**
	 * 
	 * @param nombre
	 * @param nombres
	 * @param denominaciones
	 * @param precios
	 * @return
	 */
	public static int buscarRegistroUsuario(String busqueda, String[] nombres, String[] denominaciones,
			String[] precios) {
		int posicion = -1;
		int longitud = nombres.length;
		boolean encontrado = false;
		int contador = 0;
		busqueda = busqueda.toUpperCase();

		/*
		 * nombre = Utilidades.pedirStringTexto("Qué botella quieres buscar?");
		 * nombre.toUpperCase();
		 */

		do {
			if (nombres[contador].equals(busqueda)) {
				encontrado = true;
				posicion=contador;
				
				Utilidades.mensaje("El nombre de la botella buscada es " + nombres[posicion]);
				Utilidades.mensaje("con denominación de origen " + denominaciones[posicion]);
				Utilidades.mensaje("y precio de " + precios[posicion]);

			}
			posicion++;

		} while (!encontrado && posicion < longitud);
		System.out.println(posicion + " clase");

		return posicion;
	}

	/**
	 * 
	 * @return
	 */
	public static String busqueda() {
		String cadena = Utilidades.pedirStringTexto("Qué botella quieres buscar?");
		cadena = cadena.toUpperCase();

		return cadena;
	}
}
