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
    Set DevJava, DevWeb, DevPhone, subconjunto ,Convergence, SET;
    
    public void viewer(Set SET){
        String[] array=new String[SET.size()];
        array=(String[])SET.toArray(new String[0]);
        for(int i=0;i<SET.size();i++){
            System.out.println(array[i]);
        }    
    }
    
    public void INDatos(String nombre, String tipo){
        switch(tipo){
            case "J":
                DevJava.add(nombre);
                break;
            case "W":
                DevWeb.add(nombre);
                break;
            case "C":
                DevPhone.add(nombre);
                break;
        }
    }
    
    public void Convergence(int counter){
        if(counter==1){
            Convergence = DevJava;
            Convergence.retainAll(DevWeb);
            System.out.println("Interseccion entre Java y Web de desarrolladores es: ");
            viewer(Convergence);      
        }
        if(counter==2){
            Convergence = DevJava;
            Convergence.retainAll(DevPhone);
            System.out.println("Interseccion entre Java y Celular de desarrolladores es: ");
            viewer(Convergence);
        }
        if(counter==3){
            Convergence = DevPhone;
            Convergence.retainAll(DevWeb);
            System.out.println("Interseccion entre Celulares y Web de desarrolladores es: ");
            viewer(Convergence);
        }        
        if(counter==4){
            Convergence = DevJava;
            Convergence.retainAll(DevWeb);
            Convergence.retainAll(DevPhone);
            System.out.println("Interseccion entre 3 areas de desarrolladores es: ");
            viewer(Convergence);
        }
    }
    
    public void BIG(){
        int scale1, scale2, scale3;
        scale1 = DevJava.size();
        scale2 = DevWeb.size();
        scale3 = DevPhone.size();
        
        if(scale1>scale2){
            if(scale1>scale3){
                System.out.println("Los desarrolladores de Java ocupa mayor tamanio de conjunto");
                viewer(DevJava);
            }
            if(scale1<scale3){
                System.out.println("Los desarrolladores de Celulares ocupa mayor tamanio de conjunto");
                viewer(DevPhone);
            }else{
                System.out.println("Los desarrolladores de Web ocupa mayor tamanio de conjunto");    
                viewer(DevWeb);
            }
        }
    }
    
    public void SUB(){
        boolean space;
        subconjunto = DevJava;
        subconjunto.removeAll(DevWeb);
        space = subconjunto.isEmpty();
        
        if(space){
            System.out.println("El conjunto de los desarrolladores de Java son subconjunto de parte de Web");
        }else{
            System.out.println("El conjunto de los desarrolladores de Java NO son subconjunto de parte de Web");    
        }
    }
}
