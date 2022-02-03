//Bryam Jimenez
package matrices;
import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] mat = {
            {4, 7, 10, -1},
            {9, 12, 24, 30},
            {10, 8, 6, 1}
            
        };
        
        for(int i=0; i<mat.length;i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    
}
