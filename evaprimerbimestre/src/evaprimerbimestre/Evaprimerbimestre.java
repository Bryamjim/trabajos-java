
package evaprimerbimestre;
import java.util.Scanner;


public class Evaprimerbimestre {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e Inicializacion de variables
        int n;
        int opc;
        
        n = 0; opc = 0; 
        
        //Ingreso de datos
        System.out.println("Ingrese un número");
        n = leer.nextInt();
        
        System.out.println("\n");
        System.out.println("***Revise el menú de opciones***");
        System.out.println("1. Par o impar ");
        System.out.println("2. Positivo o negativo ");
        System.out.println("3. Múltiplo de 3");
        System.out.println("4. Primo");
 
        System.out.println("Escoja una de las opciones");
        opc = leer.nextInt();
        
        switch (opc){
            case 1:{
                if(n % 2 == 0){
                    System.out.println("par " +n);
                }else{
                    System.out.println("impar " +n);
                }
            }
            break;
            case 2:{
                if(n == 0){
            System.out.println("El 0 es numero neutral, digite otro numero ecepto cero");
                }
                else{
                    if(n > 0){
                    System.out.println("El número " +n +" es positivo.\n" );
                    }
                    else{
                    if (n < 0){  
                    System.out.println("El número " +n +" es negativo.\n" );
                    }
                    }
                }
            }
            break;
            case 3:{
                if(n % 3 == 0){
                    System.out.println("multiplo de 3 " +n);
                }
                else{
                    System.out.println("el número " +n +" no es multiplo de 3");
                }
            }
            break;
            case 4:{
                if (n == 2){
                System.out.println("El numero " +n +" es Primo");
                
            }else{
                System.out.println("El numero " +n +" no es Primo");
                
            }
                    
                
            }
        }
    }
    
}
