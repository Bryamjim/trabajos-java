/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exaparcial;
import java.util.Scanner;

/**
 *
 * @author Usuario2016
 */
public class EJERCI3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de vaiables
        
        int num1, num2, r1;
        
        num1 = 0; num2 = 0; r1 = 0; 
        
        //INGRESO DE VARIABLES
        System.out.println("-------Programa para determinar si la diferencia de dos numeros es "
        + "múltiplo de alguno de ellos ------- \n ");
        System.out.println("ingrese el primer número");
        num1 = leer.nextInt();
        
        System.out.println("Ingresar el segundo número");
        num2 = leer.nextInt();
        
        //Proceso
        
        r1 = (num1 - num2);
        
        if ((num1 % r1 == 0) && (num2 % r1 == 0)){
            System.out.println("La diferencia " +r1 +" es multiplo de " +num1 + " y " +num2);
        }
        else {
            if (num2 % r1 == 0){
                System.out.println("La diferencia " +r1 +" es multiplo de " +num1);
            }
            else {
                if (num2 % r1 == 0){
                    System.out.println("La difenrencia " +r1 +" es multiplo de " +num2);
                }
                else{
                    System.out.println("La difencia " + r1 +" no es multiplo de ninguno de los dos números");
                }
            }
        }    
        
    }
}
