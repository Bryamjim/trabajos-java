//Bryam Joel Jiménez Hernández
package tarea4exc;
import java.util.Scanner;
public class ejercicios3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e Inicializacion de variables
        int n, i, j;
        i = 1; n = 0;
        
        //Ingreso de datos
        System.out.println("Ingrese el número");
        n = leer.nextInt();
        
        //Proceso
        
        while (i <= n){
            for(j = 1; j <= 1; j++){
                System.out.println("*");
            }
            i = i + 1;
        }
    }
}
