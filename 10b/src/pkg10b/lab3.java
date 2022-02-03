/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10b;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class lab3 {
    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in);
        int n = 0;
        
        n = leer.nextInt();
        int [][]A =new int [n][n];
        
        //Ingresar tamaño de la matriz       
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                A[i][j] = (int)(Math.random()*50);         
            }
        }       
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){               
                System.out.println(A[i][j]+" ");
            }
            System.out.println(" ");            
        }
            
    }
}
