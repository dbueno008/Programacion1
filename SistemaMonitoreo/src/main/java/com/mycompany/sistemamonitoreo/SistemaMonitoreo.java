/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
     * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
     */
    /*

    1. Comprender el Problema que se esta abordando
         a. Que datos de Entrada necesito?
         b. Transformacion / Calculos Necesarios
         c. Que resultados se presentan?
    
     2. Visualizacion/Disenio de la Solucion
         a. Diagrama FLujo
         b. Pseudocodigo
     
     3. Programacion Incremental 
         a. Listando las Tareas a Cumplir
            i. Declaracion de Variables     
            ii. Estructuras de Seleccion
            iii. Ciclos de Repeticion
            iv. Validaciones de Datos
         b.    
     4. Prueba de Escritorio
        a. Casos
        b. Escenarios
        c. Resultados/Patrones Definidos
*/
public class SistemaMonitoreo {
    
    /**
     *
     * 1. Entradas:
     *     Nombre de usuario
     *     Numero de Lecturas
     *     Ingresos de Temperatura (RANDOM) 
     
     * 2. Calculos/Transformacion
     *      Formula Celsius - Farenheit
     *      Definicion de Sobrecalentamiento
     *      Validacion Lecturas (0 > lectura menor 50)
     *      Contabilizar el numero calentamiento
     *      Promediar el monitoreo
     *      -Validacion Temperatura
     * 
     *  3. Salida
     *      Resumen Estadistico 
     *      Alerta de SobreCalentamiento
     * 
     *  Lista de Tareas
     *   1. Capturar el Nombre del Usuario
     *          a. Definicion de Libreria/Instancia
     *          b. Declaracion de Variable para el usuario  
     *   2. Captura de Numero de Lecturas
     *          a. Declaracion de Variable para numero de lectura
     *   3. Generacion de Temperatura
     *          a. Definicion de Libreria RANDOM
     *          b. Declaracion de Variable 
     *          c. Mostrar el numero Random Generado Temporalmente 
     *          d. Rango de Temp 200 - 400
     *          e. Ciclo de Repeticion, WHILE
     * 
     *   4. Formula: F = (C * 9/5)+32
     *   5. Limite de Sobrecalentamiento 350 C (662 F)
     *          Estructura de Seleccion (IF/ELSE)
     *   6. Validacion de Lecturas (DO WHILE) -> 0 -50
     *   7. Sumar los numeros de sobrecalentamiento
     *   8. Calcular el promedio
     *   9. Mostrar el Resumen
     *          Promedio   
     *          # de SobreCalentamiento
     *   10. Generar una Alerta de Sobrecalentamiento 
     */
    
    
    
    public static void main(String[] args) {
         // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         Random rd = new Random();
         
         String nombreUsuario = "John Doe";
         int numLectura = 0;
         int ciclo = 0;
         double tempC = 0;
         double tempF = 0;
         int numSobreCalentamiento = 0;
         double promedio = 0;
         double acumTEMP = 0;
         
         
         System.out.println("Nombre de Operacion: ");
         nombreUsuario = sc.nextLine().toUpperCase();
         System.out.printf("Validar Captura: %s\n",nombreUsuario);
         
         do{
            System.out.println("Numero de Lecturas: ");
            numLectura = sc.nextInt();
            //System.out.printf("Validar Captura: %d\n",numLectura);
            if (numLectura <0 || numLectura>50){
             System.out.println("Valor NO VALIDO");
             System.out.println("Tiene que ser entre 0 y 50");
         }
         }while(numLectura<0 || numLectura>50);
         
         while(ciclo < numLectura){
         tempC = rd.nextDouble(200,400);
         System.out.printf("Validacion Random :%.2f\n",tempC);
         
         
               tempC = rd.nextDouble(200,500);
               tempF = (tempC*9/5)+32;
               //System.out.printf("Validacion Random :%.2f\n",tempC);
               System.out.printf("Num Lec: %d\tTemp C: %.2f\n",ciclo+1, tempC);
               System.out.printf("Temp en Faren: %.2f\n",tempF);
               
               if(tempF>662){
                   System.out.println("Alerta!!!...SobreCalentamiento");
                   numSobreCalentamiento++;
               }//FIN D IF
               else{ 
                   acumTEMP +=tempF;
               }//FIN ELSE
               
               ciclo++;
         }//FIN DE WHILE
         promedio = acumTEMP / numLectura; 
         
         System.out.println("-------------");
         System.out.println("   RESUMEN   ");
         System.out.println("-------------");
         System.out.println("");
         System.out.printf("Promedio de TEMP: %.2f\n",promedio);
         System.out.printf("# SobreCalentamiento: %d",numSobreCalentamiento);
         
    }//Fin de Main
    
    
    
    
}//Fin de Class
