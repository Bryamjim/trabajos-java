/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Declaración e inicialización de variables
        int num = 0;
        System.out.println("Estructuras lógicas condicionals simples");
        System.out.println("--Programa para verificar si un número es par--");
        
        System.out.println("Ingrese un numero para verificar: ");
        num = leer.nextInt();
        //proceso
        /*
        if (num % 2 == 0) {
            System.out.println("El número " +num + " es par ");
        }
        else{
                System.out.println("El número " +num + " es impar");
        }
        */
        /*
        if ((num % 2 == 0) && (num >0)) {
            System.out.println("El número " +num + " es par ");
        }
        else{
            if (num>0){
                System.out.println("El número " +num + " es par");
            }
            else{
                System.out.println("El número " +num + " es impar");
        }
        */
        if ((num % 2 == 0) && (num >0)) {
            System.out.println("El número " +num + " es par y positivo");
        }
        else{
            if (num%2==0){
                System.out.println("El número " +num + " es par");
                
            }
            else{
                System.out.println("El número " +num + " es impar");    
            }
            
        }
        
    }
    
}
