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
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Arrays;

	/*
	*Clase de las operaciones entre los conjuntos del programa
	*/
public class Calculos { 
    Set DevJava, DevWeb, DevPhone, subconjunto ,Convergence, SET;
    
	/* 
	*Muestra el resultado de los conjuntos dependiendo de la opcion seleccionado
	*/
    public void viewer(Set SET){
        String[] array=new String[SET.size()];
        array=(String[])SET.toArray(new String[0]);
        for(int i=0;i<SET.size();i++){
            System.out.println(array[i]);
        }    
    }
    
	/* 
	*Opcion para escoger cual conjunto a utilizar a traves del Factory
	* Metodo Switch, basado en ejemplo encontrado en : http://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Sentencia_switch, para una mejor manera de escoger la implementacion.
	*/
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
    
	/*
	*Opcion y revision de las interacciones entre los conjuntos
	*/
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
    
	/*
	*Compara cual intersecicon tiende a tener mayor cantidad de elementos intersectados
	*/
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
    
	/*
	*Verifica si los desarrolladores de Java son parte de subconjunto de desarrolladores de Web
	*/
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


