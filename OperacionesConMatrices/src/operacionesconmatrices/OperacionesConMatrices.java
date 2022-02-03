//Bryam Jimenez
package operacionesconmatrices;
import java.util.Scanner;

public class OperacionesConMatrices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i, j, n, m;
        n = 0; m = 0;
        
        System.out.println("Ingrese las columnas de la Matriz A: ");
        n = leer.nextInt();
        System.out.println("Ingrese las filas de la Matriz A: ");
        m = leer.nextInt();
        
        int [][] A = new int[m][n];
        int [][] B = new int[n][m];
        
        //Ingreso los datos de la Matriz A
        System.out.println("Ingrese los Datos de la matriz A: ");
        for (i = 0;  i < m; i++) {
            for (j = 0; j < n; j++){
                    System.out.println("A[" +i +"][" +j +"] : " + A[i][j]);
                    A[i][j] = leer.nextInt();
            }
        }
        for (i = 0;  i < n; i++) {
            for (j = 0; j < m; j++){
                    System.out.print("A[" +i +"][" +j +"] : ");
                    B[i][j] = A[j][i];     
            }
        }
        for (i = 0;  i < m; i++) {
            for (j = 0; j < n; j++){
                    System.out.println(" " +A[i][j]);
            }
            System.out.println("");
        }
        
        for (i = 0;  i < n; i++) {
            for (j = 0; j < m; j++){
                    System.out.print(" " +B[i][j]);
            }
            System.out.println("");
        }
    }
    
}
