import java.util.Arrays;

/**
 * Practica 1. CRUD Arrays.
 * 
 * @author Eugenio Corral
 * @version 1
 */
public class Principal {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = Desarrollo.inicializarArrays(); 
		String[] denominaciones = Desarrollo.inicializarArrays();
		String[] precios = Desarrollo.inicializarArrays(); 
		String cadena = "-";
		int posicion = 0;
		String busqueda = "-";
		int opcion;
		int longitud = nombres.length;
		// muestro menu

		do {
			opcion = Desarrollo.mostrarMenu();
			switch (opcion) {
			case 1:// XXXXXXXX
				System.out.println("AÑADIR");
				posicion = Desarrollo.buscarPosicionVacia(busqueda,nombres, denominaciones, precios);
				
				if (nombres[posicion].equals(busqueda)) {
					cadena = Desarrollo.addString("nombre botella ");
					nombres[posicion] = cadena;
					cadena = Desarrollo.addString("denominacion ");
					denominaciones[posicion] = cadena;
					cadena = Desarrollo.addString("precio ");
					precios[posicion] = cadena;
					System.out.println(posicion);
					System.out.println(nombres.length);
				} else {
					Utilidades.mensaje("*********************");
					Utilidades.mensaje("El espacio está lleno, debes borrar un registro primero.");
					Utilidades.mensaje("*********************");
				}
				break;
			case 2:
				System.out.println("MODIFICAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres modificar?");
				posicion = Desarrollo.buscarRegistroUsuario(busqueda, nombres, denominaciones, precios);
				cadena = Desarrollo.addString("nombre  de la nueva botella ");
				nombres[posicion] = cadena;
				cadena = Desarrollo.addString(" su denominacion ");
				denominaciones[posicion] = cadena;
				cadena = Desarrollo.addString(" y su precio ");
				precios[posicion] = cadena;

				break;

			case 3:
				System.out.println("BORRAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres borrar?");
				posicion = Desarrollo.buscarRegistroUsuario(busqueda, nombres, denominaciones, precios);
				nombres[posicion] = "-";
				denominaciones[posicion] = "-";
				precios[posicion] = "-";

				System.out.println(posicion);
				break;
			case 4:
				System.out.println("BUSCAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres buscar?");
				posicion = Desarrollo.buscarRegistroUsuario(busqueda, nombres, denominaciones, precios);

				System.out.println(posicion);

				break;
			case 5:
				System.out.println("MOSTRAR");
				System.out.println("Los nombres de las botellas almacenadas son " + Arrays.toString(nombres));
				System.out.println("Las denominaciones de origen son " + Arrays.toString(denominaciones));
				System.out.println("Los precios son " + Arrays.toString(precios));

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

	private static void funcionalidades() {
	}

}
