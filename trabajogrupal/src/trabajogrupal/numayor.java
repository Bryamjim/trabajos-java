
package trabajogrupal;
import java.util.Scanner;

public class numayor {
    public static void main(String[] args) {
        /*Encontrar el número mayor dentro de un vector.*/
        
        Scanner leer = new Scanner(System.in);
        int i, n;
         
        n = 5;  
        
        System.out.println(":::-VERIFICAR QUE NUMERO ES MAYOR-:::");
        System.out.println("Ingres el límite del vector");
        n = leer.nextInt();
        
        int [] A = new int [n];
        
        for (i = 0; i < n; i++){
            System.out.println("Ingrese el vector A "  +i +":");
            A [i] = leer.nextInt();
        }
        
        for (i = 0; i < n; i++){
            System.out.println("Vector A [" +i +"] = " +A [i]);
        }
        
        for (i = 0; i < n; i++){
            if (i < A[i]){
                System.out.println("el numero mayor es: " +A[i]);
            }
        }
         
    }
}

