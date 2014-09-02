/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13042
*/


import java.util.Set; 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class FactoryHsh<E> {
    
    public Set getSet(String entry){
        if(entry.equals("HS"))
            return new HashSet<E>();
        if(entry.equals("TR"))
            return new TreeSet<E>();
        if(entry.equals("LHS")){
            return new LinkedHashSet<E>();
        }else{
            return null;            
        }
    }
}
