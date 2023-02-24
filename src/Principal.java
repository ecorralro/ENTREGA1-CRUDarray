import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[20];/* = Desarrollo.inicializarArrays(); */
		String[] denominaciones = new String[20];/* = Desarrollo.inicializarArrays(); */
		String[] precios = new String[20];/* = Desarrollo.inicializarArrays(); */
		String cadena = null;
		int posicion = 0;
		String busqueda = "";
		int opcion;
		int posicionBuscar = 0;
		int posicionModificar = 0;
		// muestro menu

		do {
			opcion = Desarrollo.mostrarMenu();
			switch (opcion) {
			case 1:// XXXXXXXX
				System.out.println("AÑADIR");
				posicion = Desarrollo.buscarPosicionVacia(posicion, nombres, denominaciones, precios);
				if (nombres[posicion] == null) {
					
					nombres[posicion] = Desarrollo.addString("nombre de botella", cadena);
					denominaciones[posicion] = Desarrollo.addString("denominacion", cadena);
					precios[posicion] = Desarrollo.addString("precio", cadena);
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
				/*
				 * busqueda = Utilidades.pedirStringTexto("Que quieres modificar?"); busqueda =
				 * busqueda.toUpperCase();
				 */
				posicionModificar = Desarrollo.buscarPosicion(posicionBuscar, busqueda, nombres, denominaciones,
						precios);
				/*
				 * System.out.println( "El nombre de la botella que buscas es " +
				 * nombres[posicion] + " con la denominación de origen " +
				 * denominaciones[posicion] + " con un precio de " + precios[posicion]);
				 */
				nombres[posicionModificar] = Desarrollo.addString("nombre de nueva botella", cadena);
				denominaciones[posicionModificar] = Desarrollo.addString("su denominacion", cadena);
				precios[posicionModificar] = Desarrollo.addString("y su precio", cadena);
				System.out.println(posicionModificar);
				break;
			case 3:
				System.out.println("BORRAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres borrar?");
				busqueda = busqueda.toUpperCase();
				posicion = Desarrollo.modificarRegistroUsuario(posicion, busqueda, nombres, denominaciones, precios);
				/*
				 * System.out.println( "El nombre de la botella que buscas es " +
				 * nombres[posicion] + " con la denominación de origen " +
				 * denominaciones[posicion] + " con un precio de " + precios[posicion]);
				 */
				nombres[posicion] = null;
				denominaciones[posicion] = null;
				precios[posicion] = null;
				System.out.println(posicion);
				break;
			case 4:
				System.out.println("BUSCAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres buscar?");
				posicionBuscar = Desarrollo.buscarRegistroUsuario(busqueda, nombres, denominaciones, precios);
				/*
				 * System.out.println("El nombre de la botella que buscas es " +
				 * nombres[posicionBuscar] + " con la denominación de origen " +
				 * denominaciones[posicionBuscar] + " con un precio de " +
				 * precios[posicionBuscar]);
				 */
				System.out.println(posicionBuscar);

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

}
