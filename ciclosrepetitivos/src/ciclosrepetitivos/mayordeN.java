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
public class mayordeN {
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de variables
        
        int i, n, num, mayor, menor;
        i = 0; n = 0; num = 0; mayor = 0; menor = 0;
        
        //Ingreso de datos
        System.out.println("Encontrar el número mayor de N números que ingres el usuario, \n");
        System.out.println("Ingrese el limite de los números");
        n = leer.nextInt();
        
        do{ 
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if (i == 1){
                menor = num;
            }
            System.out.println("++menor <- " +menor);
            if (num > mayor){
                mayor = num;
            }
            i = i + 1;
        }while (i <= n);
        System.out.println("El número mayor de los valores "
        + "Ingresados es: " +mayor);
        
        System.out.println("\n*** Encontrar el numero menor de N"
                + "numeros que ingrese el usuario ***");
        
        for (i = 0; i >= n; i++){
            
            System.out.println("Ingrese un número");
            
            num = leer.nextInt();
            
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("El número menor es: ");
    }
}
