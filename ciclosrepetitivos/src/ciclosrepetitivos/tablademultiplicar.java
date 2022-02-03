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
public class tablademultiplicar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        int num, n, i, result;
        num = 0; n = 0; i = 1; result = 0;
        
        //Ingreso de variables
        
        System.out.println("Ingrese el número a multiplicar ");
        num = leer.nextInt();
        System.out.println("Ingrese el número de ciclo ");
        n = leer.nextInt();
        
        //Proceso
        
        while (i <= n){
            result = num * i;
            System.out.println("El número " +num +" x " +i +" = " +result);
            i = i + 1;
        }
        
    }
}
