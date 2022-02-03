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
public class lab6 {
    public static void main(String[] args) {
        try{
            String ruta = ("C:\\Users\\OneDrive\\Documentos\\Programacion"
                    + "\\proyectosgitProgramacion\\IP-Ciclo1\\Bimestre 2\\aleatoreo\\Colores.txt");
            String contenido = ("Archivo de prueba");
            File file = new File(ruta);
            // si el archivo no existe es creado
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(contenido);
            bw.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
