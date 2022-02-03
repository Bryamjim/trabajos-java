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
public class fracciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        double i, num, den, term, suma, n;
        i = 1; n = 0; num = 1; den = 2; term = 0; suma = 0;
        
        //Ingreso de variables
        
        System.out.println("Ingrese el número \n");
        n = leer.nextInt();
        
        //Proceso
        while (i <= n){
            term = num/den;
            System.out.println("El termino " +i +"es: " +num +"/" +den);
            suma = suma + term;
            num = num +2;
            den = den + 3;
            i = i +1; 
        }
        System.out.println("la suma es: " +suma);
    }
}
