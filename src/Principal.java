import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[20];/* = Desarrollo.inicializarArrays(); */
		String[] denominaciones = new String[20];/* = Desarrollo.inicializarArrays(); */
		String[] precios = new String[20];/* = Desarrollo.inicializarArrays(); */
		int posicion;
		String busqueda;
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
				if (nombres[posicion] == null) {
					nombres[posicion] = addString("nombre de botella", nombres);
					denominaciones[posicion] = addString("denominacion", denominaciones);
					precios[posicion] = addString("precio", precios);
					System.out.println(posicion);
				} else {
					Utilidades.mensaje("*********************");
					Utilidades.mensaje("El espacio está lleno, debes borrar un registro primero.");
					Utilidades.mensaje("*********************");
					
				}
				break;
			case 2:
				System.out.println("MODIFICAR");
				break;
			case 3:
				System.out.println("BORRAR");
				break;
			case 4:
				System.out.println("BUSCAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres buscar?");
				posicion = buscarPosicionUsuario(busqueda, nombres, denominaciones, precios);
				System.out.println(
						"El nombre de la botella que buscas es " + nombres[posicion] + " con la denominación de origen "
								+ denominaciones[posicion] + " con un precio de " + precios[posicion]);
				break;
			case 5:
				System.out.println("MOSTRAR");
				System.out.println("Los nombres de las botellas almacenadas son "+Arrays.toString(nombres));
				System.out.println("Las denominaciones de origen son "+Arrays.toString(denominaciones));
				System.out.println("Los precios son "+Arrays.toString(precios));

				break;
			case 6:
				System.out.println("SALIR");
				break;

			default:
				Utilidades.mensaje("error");
				break;
			}

		} while (opcion != 6);
		System.out.println("fin");
		System.out.println(Arrays.toString(nombres));
		System.out.println(Arrays.toString(denominaciones));
		System.out.println(Arrays.toString(precios));

	}

	public static String addString(String texto, String[] nombres) {
		System.out.println(texto);
		String cadena = Utilidades.pedirString();
		cadena.toUpperCase();

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

	private static int buscarPosicionVacia(String[] nombres, String[] denominaciones, String[] precios) {
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

	private static int buscarPosicionUsuario(String nombre, String[] nombres, String[] denominaciones,
			String[] precios) {
		int posicion = 0;
		int longitud = 20;
		int contador = 0;
		boolean encontrado = true;
		nombre = Utilidades.pedirString();
		nombre.toUpperCase();
		do {
			if (nombres[posicion] == (nombre)) {

			} else {
				posicion++;
			}

		} while (!encontrado && posicion < longitud);

		return posicion;
	}
}
