
package evaprimerbimestre;
import java.util.Scanner;

public class fraccionese {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion e inicializacion de variables
        
        int i, num, den, term, suma, n;
        i = 1; n = 0; num = 1; den = 7; term = 0; suma = 0;
        
        //Ingreso de variables
        
        System.out.println("Ingrese el límite" );
        n = leer.nextInt();
        
        //Proceso
        while (i <= n){
            if(num <= 1){
                num = num +1;  
            }
            if(num >= 2){
                    num = num -1;
                }
                
            
            term = num/den;
            System.out.println("El termino " +i +"es: " +num +"/" +den);
            suma = suma + term;
          
            den = den + 3;
            i = i + 1; 
        }
        System.out.println("la suma es: " +suma);
    }
}
