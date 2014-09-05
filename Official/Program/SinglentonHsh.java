/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13042
*/
/*
* Clase de Singlenton para asegurar una sola instancia de clase principal que se esta usando
*/
public class SinglentonHsh {
    /*
	*Algoritmo de Singlenton clasico
	*/
    private static SinglentonHsh instance = null;
       protected SinglentonHsh() {
          // Exists only to defeat instantiation.
       }
       public static SinglentonHsh getInstance() {
          if(instance == null) {
             instance = new SinglentonHsh();
          }
          return instance;
       }    
}
