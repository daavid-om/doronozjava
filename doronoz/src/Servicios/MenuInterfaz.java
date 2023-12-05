package Servicios;

import java.util.Scanner;

/**
 * Interfaz que enumera los métodos del a funionalidad del menu
 * @author dom - 051223
 */
public interface MenuInterfaz {
	
		/**
		 * Método que muestra el menú al usuario y que recoja la opción
		 * @author dom - 051223
		 */
		public int mostrarMenuYSeleccion(Scanner sc);
		/**
		 * Método que pide y suma la venta 
		 * @author dom - 051223
		 */
		public int sumarVenta(Scanner sc);
		/**
		 * Método que muestra el total y lanza un mensaje al usuario
		 * @author dom - 051223
		 */
		public int mostrarTotal(Scanner sc);
	}
