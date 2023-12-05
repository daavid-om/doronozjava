package Servicios;

import java.util.Scanner;

/**
	 * Implementación de la interfaz menu
	 * @author dom - 051223
	 */
	public class MenuImplementacion implements MenuInterfaz {

		@Override
		public int mostrarMenuYSeleccion(Scanner sc) {
			
			int opcionSeleccionada;
			
			System.out.println("#############################");
			System.out.println("0. Cerrar la aplicacion");
			System.out.println("1. Añadir venta");
			System.out.println("2. Añadir gasto");
			System.out.println("3. Mostrar total");
			System.out.println("#############################");
			System.out.println("Elija una opción: ");
			
			opcionSeleccionada = sc.nextInt();

			return opcionSeleccionada;
		}
		
		public int sumarVenta(Scanner sc) {
			
			int pregunta;
			System.out.println("Introduzca el importe de la nueva venta: ");
			
			pregunta = sc.nextInt();
			return pregunta;
		}
		
		public int mostrarTotal(Scanner sc) {
			
		System.out.println(respuesta);
			
			return respuesta;
					
			}
			
		}

	

