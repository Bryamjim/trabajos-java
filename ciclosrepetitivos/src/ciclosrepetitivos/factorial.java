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
public class factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double factorial = 1;
        double numero = 30;
        
        while (numero!=0){
        factorial=factorial*numero; numero--;
    }
        System.out.println(factorial);
    }
}
