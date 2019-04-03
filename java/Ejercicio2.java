/**Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.

@author Rafael Infante
*/
package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio2 {

	public static void main(String[] args) {

		try {
			/* Cargamos el archivo a leer */
			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
			/*leo la linea y la almaceno en una cadena*/
			String primos = br.readLine();
			System.out.println("Los numeros primos del fichero son: ");
			System.out.println(primos);
			/*cierro fichero*/
			br.close();
		} catch (Exception e) {
			System.out.println("No hemos podido llevar a cabo el proceso.");
		}
	}

}
