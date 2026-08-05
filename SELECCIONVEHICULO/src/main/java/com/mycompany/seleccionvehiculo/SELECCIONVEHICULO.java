/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seleccionvehiculo;

import java.util.Scanner;

/**
 *
 * @author rasta
 */
public class SELECCIONVEHICULO {

    
    //**
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int cantidadLitros = 0;
        char respuestoTipo = 'a';
        String respuestaCadena = "John Doe";
        
        
        System.out.println("Me dijeron que eres duenio de un vehiculo \"Verde\"");
        System.out.println("Tienes que hecharle biodiesel");
        System.out.println("Cuantos litros te agarra?");
        cantidadLitros = entrada.nextInt();
        
        
        
        if(cantidadLitros >= 30) {
            //Condicion VERDADERO
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta!!!");
        }
        System.out.println("");
        
        entrada.nextLine(); //Limpiar el Buffer
        System.out.println("Tu vehiculo es Diesel? (x - si, y = no");
        respuestoTipo = entrada.nextLine().charAt(0);
        /*
        System.out.printf("\nRespuesta Dada: %c",respuestoTipo);
        
        System.out.println("\nTu vehiculo es Diesel? (x - si, y = no");
        respuestoTipo = entrada.nextLine().charAt(1);
        System.out.printf("Respuesta Dada: %c",respuestoTipo);
        
        System.out.println("\nTu vehiculo es Diesel? (x - si, y = no");
        respuestoTipo = entrada.nextLine().charAt(2);
        System.out.printf("Respuesta Dada: %c",respuestoTipo);
        */
        
        
        if(respuestoTipo =='x'){
            System.out.println("Si es diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
        else
        {   
            //CONDICION FALSA
            System.out.println("Uyyy... eres anticlimatico");
            System.out.println("Calentamiento Global!!!");
      
             
            
        }
        
        
        System.out.println("");
        
        System.out.println("Tu carro es energeticamente eficiente?");
        respuestaCadena = entrada.nextLine();
        
        /*
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        
        System.out.println("\n100% seguro?");
        respuestaCadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        */
        
        if(respuestaCadena.equals("si") ){
            System.out.println("Exceelente");
            System.out.println("Amigabble con el ambiente");
            
        }
        else{
            System.out.println("Uyy...Busca que se puede hacer");
        }
        
    } //fin main



} //fin class
