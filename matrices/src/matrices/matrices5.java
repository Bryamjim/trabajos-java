//Bryam Jimenez
package matrices;
import java.util.Scanner;
public class matrices5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j, m, k;
        
        i = 0; j = 0; m = 0; k = 0;
        
        System.out.println("ingrese el limite de la matriz");
        m = leer.nextInt();
        
        int[][] A = new int[m][m];
        
        System.out.println("Ingresar los elementos de la matriz");
        for (i = 0;  i < m; i++) {
            for (j = 0; j < m; j++){
                    System.out.println("A[" +i +"][" +j +"] = ");
                    A[i][j] = leer.nextInt();     
            }
        }
        for (i = 0;  i < m; i++) {
            for (j = 0; j < m; j++){
                if (A [i][j] == A[j][i]){
                    k++;
                }
            }
        }
        if (k == m*m){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("No es simetrica");
        }
    }
}