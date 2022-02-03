/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10b;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class lab5 {
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<String>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        
        System.out.println("Tamaño lista Dias: "+ dias.size()+" elementos.\n");
        System.out.println("Dias de la semana");
        for( String dia: dias){
            System.out.println(dia);
        }
        
        // Buscar y obtener un elemento de la lista
        if(dias.contains("Friday")){
            System.out.println("Es el quinto dia del mes");
        }else{
            System.out.println("No existe el elemento en la lista");
        }
        
        // Remover elemento de la lsita
        dias.remove("Martes");
        System.out.println("Los dias despues de remover -- Martes -- ");
        for( String dia: dias){
            System.out.println(dia);
        }
        
        // tamaño de la lista
        System.out.println("Tamaño lista Dias: "+ dias.size()+" elementos.\n");
            
        dias.remove(5);
        System.out.println("Los dias despues de remover -- elemento en posición 5 -- ");
        for( String dia: dias){
            System.out.println(dia);
        }
        
        // tamaño de la lista
        System.out.println("Tamaño lista Dias: "+ dias.size()+" elementos.\n");
        
        // Modificar lista
        System.out.println("Modificar elementos en la posición 3");
        dias.set(3,"Friday");
        for( String dia: dias){
            System.out.println(dia);
        }
        
        // agregar un elemento a la lista
        System.out.println("Agregar un elemento en la posición 1");
        dias.add(1,"Martes");
        for( String dia: dias){
            System.out.println(dia);
        }
        System.out.println("Tamaño lista Dias: "+ dias.size()+" elementos.\n");
    }
}
