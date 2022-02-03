/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclosrepetitivos;
import java.util.Scanner;

/**
 *
 * @author Usuario2016
 */
public class multiplo5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("programa que muestre los múltiplos de 5 de 0 a 100 ");
        
        //declaracion de variables
 
        int i, n, multi, num;
        i = 1; n = 100; num = 1; multi =0;
        
        //Proceso
        for(i = 1; i <= 100; i++){
            if (num % 5 == 0 ){
                System.out.println("El número " +num +"es multiplo de 5");
                
            }
            num = num + 1;
        }
        do{
            System.out.println(i);
            i+=5;
        } while (i <= 100);
       
        
           
        
        
        
        
    }
}
