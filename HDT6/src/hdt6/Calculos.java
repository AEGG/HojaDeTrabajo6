/*
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Ing. Douglas Barrios
* Miembros:
* - Kuk Ho Chung 13279
* - Aaron Giron 13042
*/

package hdt6;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class Calculos {
    Set DevJava, DevWeb, DevPhone, convergence, SET;
    
    public void INDatos(String nombre, String tipo){
        if(tipo.equals("J")){
            DevJava.add(nombre);
            System.out.println("Interseccion entre Java y Web de desarrolladores es: ");
        }
        if(tipo.equals("W")){
            DevWeb.add(nombre);
        }
        if(tipo.equals("C")){
            DevPhone.add(nombre);
        }
        else{
            System.out.println("Ingrese de nuevo");
        }
    }
    
    public void Convergence(int counter){
        if(counter==1){
            convergence = DevJava;
            convergence.retainAll(DevWeb);
            System.out.println("Interseccion entre Java y Web de desarrolladores es: ");
            String[] array=new String[SET.size()];
            array=(String[])SET.toArray(new String[0]);
            for(int i=0;i<SET.size();i++){
                System.out.println(array[i]);
            }            
        }
        if(counter==2){
            convergence = DevJava;
            convergence.retainAll(DevPhone);
            System.out.println("Interseccion entre Java y Celular de desarrolladores es: ");
            String[] array=new String[SET.size()];
            array=(String[])SET.toArray(new String[0]);
            for(int i=0;i<SET.size();i++){
                System.out.println(array[i]);
            }            
        }
        if(counter==3){
            convergence = DevPhone;
            convergence.retainAll(DevWeb);
            System.out.println("Interseccion entre Celulares y Web de desarrolladores es: ");
            String[] array=new String[SET.size()];
            array=(String[])SET.toArray(new String[0]);
            for(int i=0;i<SET.size();i++){
                System.out.println(array[i]);
            }            
        }        
        if(counter==4){
            convergence = DevJava;
            convergence.retainAll(DevWeb);
            convergence.retainAll(DevPhone);
            System.out.println("Interseccion entre 3 areas de desarrolladores es: ");
            String[] array=new String[SET.size()];
            array=(String[])SET.toArray(new String[0]);
            for(int i=0;i<SET.size();i++){
                System.out.println(array[i]);
            }
        }
    }
    
}
