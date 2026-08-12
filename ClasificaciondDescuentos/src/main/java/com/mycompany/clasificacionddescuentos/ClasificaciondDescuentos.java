/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasificacionddescuentos;
//Clasificación de Descuentos en Tienda de Software Enunciado

import java.util.Scanner;


public class ClasificaciondDescuentos {

    public static void main(String[] args) {
      // TODO code application logic here
           Scanner sc = new Scanner(System.in);
           
           //VARIABLES
           int edad = 0;
           char membresia = 'S';
           int descuento = 0;
           double precioJuego = 0;
           double precioFinal = 0;
           
           //PRINT 
           
            System.out.println("Cual es el precio del Juego?:");
              precioJuego = sc.nextDouble();
           
           System.out.println("Cuantos anios tiene?:");
              edad = sc.nextInt();
              
              sc.nextLine();
               System.out.println("Tiene membresia? (S = si, N = no");
               membresia = sc.nextLine().charAt(0);
           
        if (edad >= 18 )      {
            //Mayor de edad
              if( edad >= 65 || membresia =='S'){
              descuento = 20;
        System.out.println("Tiene 20% de descuento");
              }
            else{
                  descuento = 10;            
                  System.out.println("Tiene 10% de descuento");
        }//FIN ELSE
        }
              else {
            //menor de edad
              if ( edad >= 12 && membresia =='S'){
                  descuento = 15;
            System.out.println("Tiene 15% de descuento");
                     }
                     else {
            System.out.println("No tiene descuento");
                }
    } //FIN DE IF
           precioFinal = (precioJuego * descuento)/100;
        
        }//FIN DE Main

}// Fin de Class
