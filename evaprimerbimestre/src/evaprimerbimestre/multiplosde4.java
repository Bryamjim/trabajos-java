
package evaprimerbimestre;
import java.util.Scanner;

public class multiplosde4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e Inicializacion de variables
        int i, n, num;
        i = 1; n = 20; num = 3; 
        
        //Proceso
        do{
            if (num % 3 == 0 ){
                System.out.println("El número " +num +" es multiplo de 3");
                if (num % 4 == 0 ){
                    System.out.println("El número " +num +" es multiplo de 4");
                   if (num % 20 == 0 ){
                       System.out.println("El número " +num +" es multiplo de 20");
                   }
                }
            }
            
            num = num + 3;
            
            System.out.println(i);
            i = i + 1;
            
        } while (i <= n);

        
        
    
    }
}