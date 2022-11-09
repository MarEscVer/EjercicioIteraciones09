package unico;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/*Un centro de investigación de la flora urbana necesita una aplicación que muestre
 * cual es el árbol más alto. Para ello se introducirán por teclado las alturas en
 * cms de cada árbol, terminando cuando se introduzca -1. Los árboles se identifican
 * mediante etiquetas con números correlativos, comenzando en 0.		
 */
	
		double arbol;
		double arbolalto = 0;
		
		do {
			System.out.print("Introduzca la altura en cms de cada árbol [finalizar: -1]: ");
			arbol = Double.parseDouble(teclado.nextLine());
			
			if (arbol > arbolalto) {
				arbolalto = arbol;
			}
		} while (arbol != -1);
		
		System.out.println("El arbol más alto del centro mide: " + arbolalto + " cm.");
	}
}
