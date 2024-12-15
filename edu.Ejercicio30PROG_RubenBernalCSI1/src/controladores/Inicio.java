/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDate;

/**
 * Clase controladora de la aplicacion
 * rbr - 151224
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 151224
	 */
	public static void main(String[] args) {
		
		//Creo una variable de texto con un contenido especifico
		String cadena = "2023-05-10";
		
		//Convierto la cadena de texto en una fecha
		LocalDate fecha = LocalDate.parse(cadena);
		
		//Muestro la fecha por consola
		System.out.println(fecha);

	}

}
