/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclorepeticionfor;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * Objetivos
 * 1. Implementar ciclo de repeticion FOR
 * 2. Uso de CONSTANTES 
 */
public class CicloRepeticionFOR {

    /**
     * Se quiere contabilizar la cantidad 
     * de minutas que se entregan a los ninos
     * y ninias en una fiesta. Con ello sacar
     * el porcentaje de cuantos fueron ninios y ninias. 
     */
    
    
    public static void main(String[] args) {
      //TODO code application logic here
      
      /* 
      1. Variable Control -> Valor Inicial 
      2. Condicion -> Limite
      3. Modificador -> Incremento / Decremento 
      
      */
      for(int i = 0 ; i<10 ;i++){
          System.out.printf("Valor: %d\n",i);
     }//Fin de ciclo FOR
      
        System.out.println("");
        System.out.println("2do Ciclo FOR");
        
        
      for(int i = 2 ; i<10 ; i +=2){
          System.out.printf("Valor: %d\n",i);
          
      }//FIN DE CICLO FOR2
      
      
      //Declaracion de Variables
      Scanner sc = new Scanner (System.in);
      final int TOTAL = 10;
      int numVarones = 0;
      int numMujeres = 0;
      char seleccion ='a';
      double porcentaje = 0;
      
      
      for(int i = 0; i < TOTAL; i++){
          System.out.printf("%d)Quien viene x minuta?\n",i+1);
          System.out.println("V: Varon / M:Mujer");
          System.out.println("Respuesta: ");
          seleccion = sc.next().toUpperCase().charAt(0);
          
          switch (seleccion) {
              case 'V':
                  System.out.println("Varon comiendo minuta");
                  numVarones++;
                  break;
                  case'M':
                      System.out.println("Mujer comiendo minuta");
                      numMujeres++;
                      break;
                      
                  default:
                      System.out.println("Seleccion no valida");
                      break;
          }//Fin de switch 
          
      }//FIN DE CICLO FOR
      
        System.out.println("Porcentaje de Varones");
        porcentaje = (double)numVarones / TOTAL;
        System.out.printf("Porcentaje: %.2f\n",porcentaje);
      
           System.out.println("Porcentaje de Mujeres");
        porcentaje = (double)numMujeres / TOTAL;
        System.out.printf("Porcentaje: %.2f\n",porcentaje);
      
      
    }//FIN DE MAIN
    
    
    
    
}//FIN DE CLASS
