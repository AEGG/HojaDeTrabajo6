/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13
*/

package hdt6;

public class FactoryHsh<E> {
    
    public InterfaceStack<E> getStack(String entry){
        if(entry.equals("HS"))
            return new Hash<E>();
        if(entry.equals(TR))
            return new Tree<E>();
        if(entry.equals("HLi"))
            return new HashLi<E>();
        else{
            return ("Porfavor ingrese de nuevo");
        }
    }
}
