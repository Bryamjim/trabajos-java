/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaprimerbimestre;
import java.util.Scanner;
/**
 *
 * @author Usuario2016
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e Inicializacion de variables
        int contraseña, intentos, maximo;
        contraseña = 0; intentos=1;maximo = 4;
			
	while((contraseña!=1234)&& (intentos<maximo)){
					
            
            System.out.print("Introduzca su contraseña: ");
            contraseña = leer.nextInt();
					
            if(intentos == 3){
                System.out.println("acceso denegado");
                intentos = intentos - maximo;
            }
				
	intentos++;
					
				
				
				
	}
			
			
	System.out.println("***contraseña correcta***");
        
    }
}
