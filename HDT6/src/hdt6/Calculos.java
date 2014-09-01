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
    
    public void viewer(Set SET){
        String[] array=new String[SET.size()];
        array=(String[])SET.toArray(new String[0]);
        for(int i=0;i<SET.size();i++){
            System.out.println(array[i]);
        }    
    }
    
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
}
