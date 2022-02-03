/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exaparcial;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion  de variables 
        
        double n = 0;
        
        //
        System.out.println("Ingrese la calificacion sobre 5 puntos");
        n = leer.nextDouble();
        
        if (n >= 3.0){
            
            if ((n >= 4.6) && (n <= 5.0)){
                System.out.println("Estudiante exelente");
        }
            else{
                if ((n > 4.1) && (n <= 4.5)){
                    System.out.println("el alumno es muy bueno");
                }
                else{
                    if ((n > 3.6) && (n <= 4.0)){
                        System.out.println("el alumno registro un desempeño Aceptable");
                    }
                    else{
                        if ((n > 3.0) && (n <= 3.2)){
                            System.out.println("Alumno Aprobado");
                        }
                    }
                }
            }    
        }else{
            System.out.println("El alumno registra una calificacion no aprobatoria");
        }
        
    }
}
