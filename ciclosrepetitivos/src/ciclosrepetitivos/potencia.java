
package ciclosrepetitivos;
import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables 
        
        int base, pot, result;
        int i;
        
        base = 0; pot = 0; result = 1; i = 1;
        
        //Ingreso de datos
        
        System.out.println("Ingrese la base \n");
        base = leer.nextInt();
        System.out.println("Ingrese la potencia \n");
        pot = leer.nextInt();
        
        //Proceso
        while (i <= 3){
            result = result * base;
            i = i + 1;
        }
        
        System.out.println("La potencia de " +base +" es " +result); 
        
    }
    
}
