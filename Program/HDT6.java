/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13042
*/
/*
* Importando la libreria de Scanner
*/
import java.util.Scanner;

public class HDT6 {

    /**
     * @param args the command line arguments
     * Clase principal de los Hash conjuntos
	 */
    public static void main(String[] args){
        System.out.println("Bienvenido a Conjuntos: \n");
        Calculos calculos = new Calculos();	
		
		/*
		* Parte para la Factory y el Singlenton
		*/
        SinglentonHsh HashRunSet = SinglentonHsh.getInstance();
        FactoryHsh<String> Factory = new FactoryHsh<String>();
        
		/*
		* Parametros y los variables globales del interfaz del usuario
		*/
        boolean bandera = true;
		Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
		/*
		* Obtener las configuraciones segun los conjuntos definidos y que tipo de implementacion a traves de la fabrica
		*/
        System.out.println("Escoja su implementacion:\n HS = HashSet\n TR = TreeSet\n LHS = LinkedHashSet");
        String opcion1 = input2.next();
        calculos.DevJava = Factory.getSet(opcion1);
        calculos.DevWeb = Factory.getSet(opcion1);
        calculos.DevPhone = Factory.getSet(opcion1);  
        opcion1.toUpperCase();
    
	/*
	 * Bandera del programa para entrar al menu segun el usuario que decide
	 */
	while(bandera){
		System.out.println("Bienvenido, ingrese:");
                System.out.println("IND = Para ingresar datos");
                System.out.println("INT = Interseccion de conjuntos de creadores");  
                System.out.println("SUB = Subconjunto de creadores");  
                System.out.println("BIG = Verificar conjunto mas grande");  
                System.out.println("SLS = EXIT");  
                
                String opcion = input1.next();
		opcion.toUpperCase();
		
         /*
		 * Opcion para ingresar los datos necesarios para procesar las operaciones deseadas
		 */
		if(opcion.equals("IND")){
                    System.out.println("Ingrese el nombre:");
                    String nombre = input1.next();
                    System.out.println("Ingrese el numero del conjunto de desarrolladores correspondientes:\nJ:Java\nW:Web\nC:Celulares");
		    String tipo = input1.next();
                    calculos.INDatos(nombre, tipo);
		}
		
		/*
		* Opcion para verificar las intersecciones de los conjuntos
		*/
		if(opcion.equals("INT")){
                    int counter = 0;
                    System.out.println("Opciones:\n 1:Java/Web\n 2:Java/Cel\n 3:Cel/Web\n 4:Interseccion entero");
                    
                    int rec = input1.nextInt();
                    if(rec==1){
                        counter = counter + 1;
                        calculos.Convergence(counter);
                    }
                    if(rec==2){
                        counter = counter + 2;
                        calculos.Convergence(counter);
                    }                    
                    if(rec==3){
                        counter = counter + 3;
                        calculos.Convergence(counter);
                    }
                    if(rec==4){
                        counter = counter + 4;
                        calculos.Convergence(counter);
                    }                    
		}
                
				/*
				* Opcion para verificar el subconjunto entre los desarrolladores de Java y Web
				*/
                if(opcion.equals("SUB")){
                    System.out.println("Ingrese sub");        
                    calculos.SUB();
                }
                
				/*
				* Opcion para verificar cual conjunto posee mayor cantidad de elementos
				*/
                if(opcion.equals("BIG")){
                    System.out.println("El tamanio del conjunto de desarrolladores mas grande son: ");
                    calculos.BIG();
                }
                
				/*
				* opcion para salir del programa
				*/
                if(opcion.equals("SLS")){
                    bandera = false;       
                    System.out.println("Adios"); 
                }
        }
    }
    
}
