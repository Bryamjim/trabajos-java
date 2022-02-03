
package ciclosrepetitivos;
import java.util.Scanner;

public class Ciclosrepetitivos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        int i, n, suma;
        i = 1; n = 1; suma = 0;
        
        //Ingreso de variables
        
        System.out.println("Ingrese el número de ciclo \n");
        n = leer.nextInt();
        
        //proceso
        while (i <= n){
            
            System.out.println(i);
            i = i + 1;
            suma = suma + i;
        }
        System.out.println("i es: " +i);
        
        
        System.out.println("i es: " +suma);
        
        
        i = n; suma = 0;
        while (i >= 1){
            
            System.out.println("suma " +suma);
            suma = suma + 1;
            System.out.println(i);
            i = i - 1;
                    
        }
        System.out.println("i es: " +i);
        
        
        System.out.println("i es: " +suma);
    }
    
}
