/**Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.

@author Rafael Infante
*/
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// variables
		int contador = 0; // contador de ocurrencias
		String fichero = "";
		String palabra = "";

		try {
		System.out.println("Introduzca el nombre del fichero: ");
		fichero = sc.next();
		sc.nextLine();
		System.out.println("¿Qué palabra deseas contar?");
		palabra = sc.nextLine();

		BufferedReader br = new BufferedReader(new FileReader(fichero + ".txt"));

		String linea = "";
		String contenidoLinea = "";

		while (linea != null) {
			contenidoLinea = linea;
			linea = br.readLine();
			if (contenidoLinea.equals(palabra)) {
				contador++;
			}
		}

		br.close();
		
		
		}catch(FileNotFoundException e) {
			System.err.println("El fichero no se ha podido encontrar");
		}catch (IOException e) {
      System.err.println("Error en la lectura del fichero");
		}
		
		System.out.println("La palabra " + palabra + " se ha encontrado " + contador + " veces.");
	}

}
