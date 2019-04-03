/**Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea.

@author Rafael Infante
*/
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			ArrayList<String> lista = new ArrayList<String>();

			String fichero = "";

			System.out.println("Introduzca el nombre del fichero: ");
			fichero = sc.nextLine();

			BufferedReader br = new BufferedReader(new FileReader(fichero + ".txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichero + "_sort.txt"));

			String linea = "";

			// Lee la linea hasta el final de archivo y añade su contenido al arraylist
			while (linea != null) {
				lista.add(linea);
				linea = br.readLine();
			}

			// cerramos archivo de escrituta
			br.close();

			// ordenamos la lista de palabras con sort
			Collections.sort(lista);

			/* escribimos las palabras en el archivo de escritura */
			for (String x : lista) {
				bw.write(x + " ");
			}

			// cerramos archivo de lectura
			bw.close();

		} catch (FileNotFoundException e) {
			System.err.println("El fichero indicado no existe");
		} catch (IOException e) {
			System.err.println("No se ha podido escribir en el archivo");
		}

	}// fin main

}// fin clase
