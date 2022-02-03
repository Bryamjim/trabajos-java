/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberejer1;
import java.util.Scanner;
/**
 *
 * @author bryam
 */
public class Deberejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2, resta;
        num1=0; num2=0; resta=0;
        //entrada de datos
        System.out.print("Ingrese el primer número: \n");
        num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: \n");
        num2 = leer.nextDouble();
        
        if(num1>num2){
            resta = num1-num2;
            System.out.println("El resultado de la resta es: " + resta + " .\n" );
        }
        else{
            if(num2>num1){ 
                resta= num2 - num1;
                System.out.println("El resultado de la resta es: " + resta + " .\n" );
            }
            
        }
        if ((num1 % resta ==0 ) || (num2 % resta ==0)){
            System.out.println("La diferencia es un divisor exacto de uno de los números.");
        
        }
        else {
            System.out.println("La diferencia no es un divisor exacto de ningún número");
        }
    }
}
