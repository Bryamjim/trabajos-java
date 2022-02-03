
package trabajogrupal;
import java.util.Scanner;
 
public class vectorn {
    public static void main(String[] args) {
        /*Crear un vector de n números enteros. Luego, ingresar un número entero y 
        determinar cuántas veces está entre los elementos del vector; además decir en 
        qué posiciones está*/
        
        Scanner leer = new Scanner(System.in);
        int n, i, numero, aux;
        
        n = 0; numero = 0; aux = 0;
        
        System.out.println(":::-CREACION DE VECTOR CON LIMITE N-:::");
        System.out.println("\nIngrese el límite del vector");
        n = leer.nextInt();
        
        int [] A = new int [n];
        
        for (i = 0; i < n; i++){
            System.out.println("\nIngrese el vector A "  +i +":");
            A [i] = leer.nextInt();
        }
        
        System.out.println("\nIngresar el numero a verificar");
        numero = leer.nextInt();
        
        for (i = 0; i < n; i++){
            if (numero == A[i]){
                aux = aux + 1;
                System.out.println("El número " +numero +" esta en la posicion A [" +i +"] = " +A[i]);
            }
        }
        System.out.println("El numero " +numero +" se repite: " +aux + " veces");
        
    }
}
