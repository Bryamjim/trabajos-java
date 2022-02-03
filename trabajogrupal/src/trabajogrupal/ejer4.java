
package trabajogrupal;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        /*Crear un vector A de n números. Verificar qué número son pares y 
        almacenarlos en un arreglo llamado PAR, verificar qué número son 
        impares y almacenarlos en un arreglo IMPAR. Presentar los 3 vectores.*/
        Scanner leer = new Scanner(System.in);
        int i, n, aux;
        
        n = 0; i = 0; aux = 0;
        
        System.out.println(":::-VERIFICACION DE UN NUMERO PAR O IMPAR-:::");
        System.out.println("\nIngresa el tamaño del vector");
        n = leer.nextInt();
        
        int [] A = new int [n];
        int [] par = new int [n];
        int [] impar = new int [n];
        
        for (i = 0; i < n; i++){
            System.out.println("Ingrese los terminos del vector");
            A[i] = leer.nextInt();
        }
        for (i = 0; i < n; i++){
        System.out.println("Vector A [" +i +"] = " +A [i]);
        }
        for (i = 0; i < n; i++){
            if (A[i]%2 == 0 ){
                par[i] = A[i];
                aux = par[i];
                System.out.println("Pares en el vertor A [" +i +"] : " +par[i]);
            }
        }
        for (i = 0; i < n; i++){
            if (A[i] %2 != 0 ){
                impar[i] = A[i];
                aux = impar[i];
                System.out.println("Impares en el vector A [" +i +"] : " +impar[i]);
            }
        }
    }
}
