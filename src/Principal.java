import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[2];/* = Desarrollo.inicializarArrays(); */
		String[] denominaciones = new String[2];/* = Desarrollo.inicializarArrays(); */
		String[] precios = new String[2];/* = Desarrollo.inicializarArrays(); */
		int posicion;
		String busqueda="";
		int opcion;
		// muestro menu

		do {
			opcion = Desarrollo.mostrarMenu();
			switch (opcion) {
			case 1:// XXXXXXXX
				System.out.println("AÑADIR");
				posicion = Desarrollo.buscarPosicionVacia(nombres, denominaciones, precios);
				if (nombres[posicion] == null) {
					nombres[posicion] = Desarrollo.addString("nombre de botella", nombres);
					denominaciones[posicion] = Desarrollo.addString("denominacion", denominaciones);
					precios[posicion] = Desarrollo.addString("precio", precios);
					System.out.println(posicion);
				} else {
					Utilidades.mensaje("*********************");
					Utilidades.mensaje("El espacio está lleno, debes borrar un registro primero.");
					Utilidades.mensaje("*********************");

				}
				break;
			case 2:
				System.out.println("MODIFICAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres buscar?");
				busqueda.toUpperCase();
				posicion = Desarrollo.modificarRegistroUsuario(busqueda, nombres, denominaciones, precios);
				System.out.println(
						"El nombre de la botella que buscas es " + nombres[posicion] + " con la denominación de origen "
								+ denominaciones[posicion] + " con un precio de " + precios[posicion]);
				nombres[posicion] = Desarrollo.addString("nombre de nueva botella", nombres);
				denominaciones[posicion] = Desarrollo.addString("su denominacion", denominaciones);
				precios[posicion] = Desarrollo.addString("y su precio", precios);
				System.out.println(posicion);
				break;
			case 3:
				System.out.println("BORRAR");
				busqueda = Utilidades.pedirStringTexto("Que quieres borrar?");
				busqueda.toUpperCase();
				posicion = Desarrollo.modificarRegistroUsuario(busqueda, nombres, denominaciones, precios);
				System.out.println(
						"El nombre de la botella que buscas es " + nombres[posicion] + " con la denominación de origen "
								+ denominaciones[posicion] + " con un precio de " + precios[posicion]);
				nombres[posicion] = null;
				denominaciones[posicion] = null;
				precios[posicion] = null;
				System.out.println(posicion);
				break;
			case 4:
				System.out.println("BUSCAR");
				busqueda = Utilidades.pedirStringTexto("Que botella quieres buscar?");
				busqueda.toUpperCase();
				posicion = Desarrollo.buscarRegistroUsuario(busqueda, nombres, denominaciones, precios)-1;
				System.out.println(
						"El nombre de la botella que buscas es " + nombres[posicion] + " con la denominación de origen "
								+ denominaciones[posicion] + " con un precio de " + precios[posicion]);
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

}
