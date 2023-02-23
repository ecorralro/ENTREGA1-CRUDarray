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
	//MOSTRAR MENU
	/**
	 * 
	 * @return 
	 * devuelve la opcion elegida por el usuario
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
		System.out.println("***5.SALIR***");
		System.out.println("*************");

		opcion = Utilidades.pedirIntTexto("Elige una opcion");
		return opcion;
	}
	//AÑADIR
	/**
	 * 
	 * @param texto
	 * @param nombres
	 * @return 
	 */
	public static String addString(String texto, String[] nombres) {
		System.out.println(texto);
		String cadena = Utilidades.pedirString();
		cadena.toUpperCase();

		return cadena;
	}
	/**
	 * 
	 * @param nombres
	 * @param denominaciones
	 * @param precios
	 * @return
	 */
	public static int buscarPosicionVacia(String[] nombres, String[] denominaciones, String[] precios) {
		int posicion = 0;
		int longitud = 20;
		int contador = 0;
		boolean encontrado = true;

		do {
			if (nombres[posicion] == (null)) {

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < longitud);

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
	public static int modificarRegistroUsuario(String nombre, String[] nombres, String[] denominaciones,
			String[] precios) {
		int posicion = 0;
		int longitud = 20;
		boolean encontrado = true;
		
		nombre = Utilidades.pedirStringTexto("seguro que quieres modificar " + nombre);
		nombre.toUpperCase();
		
		do {
			if (nombres[posicion] == (nombre)) {

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < longitud);

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
	public static int buscarRegistroUsuario(String nombre, String[] nombres, String[] denominaciones,
			String[] precios) {
		int contador=0;
		int posicion = 0;
		int longitud = 20;
		boolean encontrado = true;
		
		/*nombre = Utilidades.pedirStringTexto("Qué botella quieres buscar?");
		nombre.toUpperCase();*/
		
		
		do {
			if (nombres[posicion] == (nombre)) {
				Utilidades.mensaje("El nombre de la botella buscada es " + nombres[posicion]);
				Utilidades.mensaje("con denominación de origen " + denominaciones[posicion]);
				Utilidades.mensaje("y precio de " + precios[posicion]);

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < longitud);
		System.out.println(posicion + " clase");

		return posicion;
	}
}
