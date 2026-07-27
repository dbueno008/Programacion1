/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author rasta
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    
    //Sirve para comentar una sola linea
    /*
    Pleca Asterisco -> abrir el bloque comentario
    Asterisco pleca -> cerrar el bloque comentario
    
    Todo lo de enmedio... es un comentario
    */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            1. Imprimir en pantalla
               a. Salidas formateadas
               b. Caracteres de Escape
            2. Captura de Datos
        */
        
        System.out.println("Hola..me llamo Daniel");
        System.out.println("Este sera mi 1er");
        System.out.println("PROGRAMAAAA!!!!!!");
        
        System.out.println("este tip de sout + tab sirve para sacar el print de un solo prompt");
        System.out.print("Vamos camino a ");
        System.out.print("la clase de ");
        System.out.print("Progra!!");
        
         System.out.println("");
        
        System.out.printf("Tu apellido es %S\n","Bueno");
        System.out.println("");
        
        System.out.printf("%s Tu apellido es\n","Bueno");
        System.out.println("");
        
        System.out.printf("Tu apellido %s es\n","Bueno");
        
        System.out.println("Hola \n este es \n un nuevo \n amanecer");
        System.out.println("Hola \t este es \t un nuevo \t amanecer");
        
        
        //Variables
        int edad;  //Tipo Entero
        double peso;  //Tipo Decimal
        char inicial;  //Tipo Caracter -> letras,digitos,simbolos Especiales
        String nombre;  //Tipo Cadena
        boolean estado;  //Tipo Estado  ->true(verdadero) / false(falso)
        
        
        edad = 25;
        peso = 54.5;
        inicial = 'D';//alt + 39 -> '
        nombre ="Daniel";
                
        System.out.printf("Tengo %d anios \n",edad);        
        System.out.printf("Mi peso ideal es %f \n",peso);
        System.out.printf("Dime %c por mi inicial, ",inicial);
        System.out.printf("%s es mi nombre",nombre);

        
    }// Fin de Main
    
}//Fin de Class  