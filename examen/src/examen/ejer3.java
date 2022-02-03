
package examen;
import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i, j, n, suma;
        n = 5; suma = 0;
        
        
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        
        for(i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.println("A ["+i+"] ["+j+"] :");
                A[i][j] = leer.nextInt();
            }
            System.out.println("");
        }
       
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("B["+i+"] ["+j+"] :");
                B[i][j] = leer.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("Matriz A : ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(A[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println("");
        for (i=0;i<n;i++){
            System.out.print(A[i][i]);
            suma = suma + A[i][i];
        }
       
        System.out.println("Matriz B : ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(B[i][j]+"");
                
            }
            System.out.println("");
        }
        
    }
    
}
    
    

