/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10b;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Generación de 10 números aleatoreos entre 0 a 1- Decimales. \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random());
        }
        System.out.println("Generación de 10 números aleatoreos entre 0 a 10- Decimales. \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random()*10);
        }
        System.out.println("Generación de 10 números aleatoreos entre 0 a 10- enteros. \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println((int)(Math.random()*10));
        }
        System.out.println("Generación de 10 números aleatoreos entre 1 a 50- enteros. \n");
        for (int i = 1; i <= 10; i++) {
            int numR = (int)(Math.random()*50+1);
            System.out.println(numR);
        }
    }
}