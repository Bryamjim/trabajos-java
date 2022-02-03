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
public class numNegPo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e identificación de variables
        double n1;
        n1 = 0;
        
        //Ingreso de datos
        System.out.println("Programa para identificar si un número es positivo o negativo: \n ");
        System.out.print("Ingrese un numero: ");
        n1 = leer.nextDouble();
        
        //Proceso
        if(n1 == 0){
            System.out.println("El 0 es numero neutral, digite otro numero ecepto cero");
        }
        else{
            if(n1 > 0){
                System.out.println("El número " +n1 +" es positivo.\n" );
            }
            else{
            if (n1 > 0){  
                System.out.println("El número " +n1 +" es negativo.\n" );
            }
            }
        }
    }
}

