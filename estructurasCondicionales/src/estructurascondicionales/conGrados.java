/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author kevin
 */
public class conGrados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //declaración de variables e inicialización de variables
        double gC, gF, gK;
        gC = 0; gF = 0; gK=0 ;
        //Entrada de datos
        System.out.println("Estructuras logicas condicionales simples");
        System.out.println("Programa para conversión de grados\n");
        
        System.out.println("Ingrese los grados centigrados: ");
        gC = leer.nextDouble();
        
        if (gC>0){
            gF = (9/5)*(gC+32);
            gK = gC + 273.15;
            //salida de datos
            System.out.println("La equivalencia en grados F es: " + gF);
            System.out.println("La equivalencia en grados k es: " + gK );
        }
        else{
            System.out.println("Los grados centigrados son negativos, no se"
                    + " puede realizar la conversión");
        }
           
    }
}
