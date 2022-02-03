/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class numMayMen {
    public static void main(String[] args) {
        // Declarar e inicialización de variable
        Scanner leer = new Scanner(System.in);
        
        double n1, n2, n3;
        n1=0; n1=0; n1=0;
        
        //Ingresar datos
        System.out.println("--Programa para identificar el mayor de 3 números--");
        System.out.print("Ingrese el primer número: ");
        n1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        n2 = leer.nextInt();
        System.out.print("Ingrese el tercer número: ");
        n3 = leer.nextInt();
        
        //proceso
        if((n1 > n2)&&(n1 > n3)){
            System.out.println("El número mayor es: " +n1 +"\n");
        }
        else{
            if ((n2 > n1) && (n2 > n3)){
                System.out.println("El número mayor es: " +n2 +"\n");
            }
            else{
                if ((n3 > n2) && (n3 > n1)){
                System.out.println("El número mayor es: " +n3 +"\n");
            }
            }
        }
    }
}
