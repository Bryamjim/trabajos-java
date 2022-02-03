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
public class NumPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Inicializar las variables
        
        int i, n, num;
        int j, divisor;
        
        n = 0; num = 0; divisor = 0;
        
        System.out.println("Ingrese el límite de números a verificar");
        n = leer.nextInt();
        
        for (i=1; i<=n; i++){
            
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            //Verificar si es par o impar
            
            if (num % 2 == 0){
                System.out.println("El numer " +num +"es Par \n");
            }
            else{
                System.out.println("El numer " +num +"es Impar \n");
            }
            
            //verificar si un numero es primo
            j = 1;
            
            while (j <= num){
                
                if (num % j == 0){
                    divisor = divisor + 1;
                }
                j = j + 1;
            }
            
            if (divisor == 2){
                System.out.println("El numero " +num +"es Primo");
                
            }else{
                System.out.println("El numero " +num +"no es Primo");
                
            }
            divisor = 0;    
        }
        
    }
}
