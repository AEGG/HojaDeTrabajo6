/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13042
*/

import java.util.Scanner;

public class Main {
    
	
	public static void main(String[] args){
	boolean bandera = false
	System.out.println("Bienvenido a Conjuntos: \n");
	//CalcConjuntos conjuntos = new CalcConjuntos();
	Scanner entry = new Scanner(System.in);
	
	
	while (bandera){
		System.out.println("Ingrese el nombre: \n");
		String opcion = entry.next();
		
		
		if(opcion==1){
			System.out.println("Ingresar el nombre de la persona: \n");
			String nombre = entry.next();
			System.out.println("Ingrese el numero del conjunto de desarrolladores al que pertenece: 1:Java\n2:Web\n3:Celulares");
			int tipo = entry.nextInt();
			//CalcConjuntos.ingreso(nombre, tipo);
		}
		
		if(opcion==2){
			System.out.println("Ingrese 1:Int. Java-Web\n 2:Java-Cel\n 3:Cel-Web\n 4:los tres");
			
		}
		
		
		
	}	
	
	
	

	
 }
}

