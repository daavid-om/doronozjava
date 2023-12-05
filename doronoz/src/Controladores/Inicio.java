package Controladores;

import java.util.Scanner;
/**
 * Clase principal de la aplicacion
 * @author dom - 051223
 */
public class Inicio {
/**
 * Método principal de la aplicación
 * @author dom - 051223
 * @param args
 */
	
	public static void main(String[] args) {
		
		int seleccionUsuario;
		boolean cerrarMenu = false;
		double respuesta;
		
		Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		
				
		while(!cerrarMenu) {

			seleccionUsuario = mi.mostrarMenuYSeleccion(sc);
			respuesta = mi.sumarVenta(sc);
			
			switch(seleccionUsuario) {
				case 0:
					System.out.println("[INFO] - Se ejecuta la opcion 0");
					cerrarMenu = true;
					break;
				case 1:
					System.out.println("[INFO] - Se ejecuta la opcion 1");
					respuesta++;
					break;
				case 2:
					System.out.println("[INFO] - Se ejecuta la opcion 2");
					break;
				case 3:
					System.out.println("[INFO] - Se ejecuta la opcion 3");
					break;
				default:
					System.out.println("[INFO] - No se ha seleccionado la opción correcta, vuelva a intentarlo");
					break;					
			}

	}

}
}
