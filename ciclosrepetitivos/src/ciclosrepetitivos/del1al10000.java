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
public class del1al10000 {
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
          int i, n, num; 
          double media;
        i = 1; n =  0; num = 0; media = 0;
        
        System.out.println("ingrese el limite del ciclo");
        n = leer.nextInt();
        
        while ( i <= n ) {
            
            System.out.println(i);
            
            i = i + 1;
            
            num = num + n;
           
        }
        media = i/10000;
        num = num + 1;
        System.out.println("resultado " +i);
        System.out.println("numeros introducidos es: " +num);
        System.out.println("la Media es: " +media);
    }
}
