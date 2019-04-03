/**Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.

*@author Rafael Infante
**/
package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import biblioteca.Funciones;

class Ejercicio1 {

	public static void main(String[] args) {

		/* aqui almacenare los numeros primos */
		ArrayList<Integer> numPrimos = new ArrayList<>();

		// Creamos el fichero en modo escritura
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("primos.dat"));

			int i;

			/* los añado a un arrayList */
			for (i = 3; i <= 500; i++) {
				if (Funciones.esPrimo(i)) {
					numPrimos.add(i);
				}
			}

			/* leo el arrayList y a la vez escribo el fichero */
			for (int p : numPrimos) {
				bw.write(p + " ");
			}

			// cerramos el fichero
			bw.close();
			System.out.println("Programa finalizado.");
			
			/*el archivo generado esta en el directorio src*/
			
			// System.out.println(numPrimos);
		} catch (Exception e) {
			System.out.println("No se ha podido llevar a cabo el proceso.");
		}
	}

}
