
package trabajogrupal;
import java.util.Scanner;

public class Trabajogrupal {

    public static void main(String[] args) {
        
        /*Crear dos vectores cada uno con 5 datos enteros y determinar si los datos 
        almacenados en ambos vectores son exactamente los mismos tanto en 
        contenidos como en posición.*/
        
        Scanner leer = new Scanner(System.in);
        int i, n;
        
        n = 5;  
        
        System.out.println(":::VERIFICACION DE SIMILITUD EN VECTORES:::");
        
        int [] A = new int [n];
        int [] B = new int [n];
        
        System.out.println("\n:::Ingreso vectores A:::");
        for (i = 0; i < n; i++){
            System.out.println("Ingrese el vector A "  +i +":");
            A [i] = leer.nextInt();
        }
        
        System.out.println("\n:::Ingreso vectores B:::");
        
        for (i = 0; i < n; i++){
            System.out.println("Ingrese el vector B "  +i +":");
            B [i] = leer.nextInt();
        }
        
        System.out.println("\n:::-VECTOR A-:::");
        for (i = 0; i < n; i++){
            System.out.println("Vector A [" +1 +"] = " +A [i]);
        }
        
        System.out.println("\n:::-VECTOR B-:::");
        for (i = 0; i < n; i++){
            System.out.println("Vector B [" +1 +"] = " +B [i]);
        }
        
        for (i = 0; i < n; i++){
            if (A[i] == B[i]){
                System.out.println("\nEn la posiciono A [" +i +"] es igual a : " +A[i] +" y en la posicion B [" +i +"] es igual a : " +B[i] +" "
                        + "por lo tanto son exactamente similares en pocicion y datos" );
            }else {
                System.out.println("\nNo existe similitud alguna");
            }
        }
                

    }
    
}
