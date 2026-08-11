/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadaprobaciondmateria;

import java.util.Scanner;
// Ejercicio 1 - Sistema de Aprobacion de Materia

public class SistemadAprobaciondMateria {

    public static void main(String[] args) {
            // TODO code application logic here
           Scanner sc = new Scanner(System.in);
           
            
            
            //VARIABLES
            
            String nombreEstudiante = "a";
            double notaExamen1 = 0;
            double notaExamen2 = 0;
            double promedioExamenes = 0;
            
            
            
             ///PRINT EN PANTALLA
            
            System.out.println("Cual es su nombre?:");
             nombreEstudiante = sc.nextLine().toUpperCase();
             
            System.out.println("Cuanto saco en el Examen 1?:");
             notaExamen1 = sc.nextDouble();
            
         System.out.println("Cuanto saco en el Examen 2?:");
             notaExamen2 = sc.nextDouble();
             
            
            
            promedioExamenes = (notaExamen1 + notaExamen2) /2;
          
            
            if (promedioExamenes >=65){
                System.out.printf("Aprobado");
            }//FIN IF 
            
            else {
                System.out.println("Reprobado");
            }//Fin else 
            
    }// FIN MAIN





}//FIN CLASS
