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
        
        System.out.println("Me dijeron que eres duenio de un vehiculo \"Verde\"");
        System.out.println("Tienes que hecharle biodiesel");
        System.out.println("Cuantos litros te agarra?");
        cantidadLitros = entrada.nextInt();
        
        
        
        if(cantidadLitros>30) {
            //Condicion VERDADERO
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta!!!");
        }
        System.out.println("");
        
        entrada.nextLine();
        System.out.println("Tu vehiculo es Diesel? (x - si, y = no");
        char respuestoTipo = entrada.nextLine().charAt(0);
        
        if(respuestoTipo =='x'){
            System.out.println("Si es diesel verde!!");
            System.out.println("Diesel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
        else
        {   System.out.println("Uyyy... eres anticlimatico");
            System.out.println("Calentamiento Global!!![");
        
        
        
        }
    } //fin main



} //fin class
