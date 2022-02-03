/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaparcial;
import java.util.Scanner;

/**
 *
 * @author Usuario2016
 */
public class Exaparcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
 //Declaracion e inicializacion de vaiables
        
        String nomcliente;
        int opc, cantbook;
        double costbook, subtotal, desc, totalP; 
        
        opc = 0; cantbook = 0; costbook = 0; subtotal = 0; desc = 0; totalP = 0;
        
        //INGRESO DE VARIABLES
        System.out.println("Ingresar el nombre del cliente");
        nomcliente = leer.next();
        System.out.println("Ingrese la cantidad de libros");
        cantbook = leer.nextInt();
        System.out.println("Ingrese la el costo de cada libro");
        costbook = leer.nextDouble();
        
        System.out.println("Escoja la opcion del siguiente menú");
        System.out.println("1. Docente"); 
        System.out.println("2. Estudiante");
        System.out.println("3. otros");
        
        System.out.println("Seleccionar una opcion");
        opc = leer.nextInt();
        
        
        //Proceso
        switch (opc){
            case 1:
                subtotal = costbook * cantbook;
                if (cantbook <= 5){
                desc = subtotal * 0.31;
                totalP = subtotal - desc;
                
                }
                else{
                    if ((cantbook > 5) && (cantbook <= 10)){
                    desc = subtotal * 0.34;
                    totalP = subtotal - desc;
                        
                    }
                    else{
                        if (cantbook >= 10){
                        desc = subtotal * 0.38;
                        totalP = subtotal - desc;
                        
                    }
                  }
                }
           break;
            case 2:
                subtotal = costbook * cantbook;
                if (cantbook <= 5){
                desc = subtotal * 0.2;
                totalP = subtotal - desc;
                
                }
                else{
                    if ((cantbook > 5) && (cantbook <= 10)){
                    desc = subtotal * 0.24;
                    totalP = subtotal - desc;
                        
                    }
                    else{
                        if (cantbook >= 10){
                        desc = subtotal * 0.28;
                        totalP = subtotal - desc;
                        
                    }
                  }
                }
           break;
            case 3:
                subtotal = costbook * cantbook;
                if (cantbook <= 5){
                desc = subtotal * 0.1;
                totalP = subtotal - desc;
                
                }
                else{
                    if ((cantbook > 5) && (cantbook <= 10)){
                    desc = subtotal * 0.14;
                    totalP = subtotal - desc;
                        
                    }
                    else{
                        if (cantbook >= 10){
                        desc = subtotal * 0.18;
                        totalP = subtotal - desc;
                        
                    }
                  }
                }
           break;
                }
        //Datos de salida
        System.out.println("nombre cliente: "+nomcliente);
        System.out.println("subtotal: "+subtotal);
        System.out.println("descuento: "+desc);
        System.out.println("neto a pagar: "+totalP);
        
        
        }
   
        }