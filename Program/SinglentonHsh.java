/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13042
*/

public class SinglentonHsh {
    
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
