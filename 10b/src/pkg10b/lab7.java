/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10b;
import java.io.*;

/**
 *
 * @author Usuario
 */
public class lab7 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OneDrive\\Documentos\\Programacion"
                    + "\\proyectosgitProgramacion\\IP-Ciclo1\\Bimestre 2\\aleatoreo\\Colores.txt"));
            String linea = "";
            while(linea != null){
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
