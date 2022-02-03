/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Usuario
 */
public class lab9 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\OneDrive\\Documentos\\Programacion"
                    + "\\proyectosgitProgramacion\\IP-Ciclo1\\Bimestre 2\\aleatoreo\\Colores.txt"));
            bw.write("Números aleatoreos de rango de 0 a 10 \n");
            for (int i = 0; i < 30; i++) {
                double random = (Math.random()*10);
                System.out.println(random);
                bw.write(String.valueOf(random)+"\n");
            }
            bw.write("\n Matriz de números aleatoreos en rango de 0 a 50\n");
            int [][] A = new int [20][20];
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    A[i][j] = (int)(Math.random()*50);
                    bw.write(String.valueOf(A[i][j]+ "     "));
                            
                }
                bw.write("\n");
            }
            bw.close();
        }catch(IOException ioe){
            System.out.println("No se puede leer el archivo");
        }
        // leer archivo
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OneDrive\\Documentos\\Programacion"
                    + "\\proyectosgitProgramacion\\IP-Ciclo1\\Bimestre 2\\aleatoreo\\Colores.txt"));
            String linea = "";
            System.out.println("---Lectura desde el archivo \n----");
            while (linea!=null){
                System.out.println(linea);
                linea = br.readLine();
                
            }
            br.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("No se encuentra el archivo");
        }catch(IOException ioe){
            System.out.println("No se puede leer el archivo");
        }
    }
}
