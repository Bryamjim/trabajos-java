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
public class lab4 {
    public static void main(String[] args) {
        
        ArrayList<String> nombre = new ArrayList<String>();
        
        //numero de elementos de la lista       
        System.out.println("La lista tiene: " +nombre.size()+ " elementos");
        
        //agregar elementos a la lista 
        nombre.add("Annita");
        nombre.add("Kevin");
        nombre.add("Edgar");
        nombre.add("Diego");
        nombre.add("David");
        nombre.add("Bryam");
        nombre.add("Justin");       
        System.out.println("La lista tiene: " +nombre.size() + " elementos");
        
        //retorna el elemento dentro de la lista       
        System.out.println("Elementos en la posicion 0 " +nombre.get(0));        
        System.out.println("Elementos en la posicion 0 " +nombre.get(4)+"\n");
        System.out.println("Los elementos de la lista son: ");
        
        for (int i = 0; i < nombre.size(); i++){
            System.out.println(nombre.get(i));            
        }
        
        System.out.println("\n");       
        System.out.println("los elementos de la lista son: (for simplificado)");       
        for (String name: nombre){
            System.out.println(name);
        }                                           
    }
}
