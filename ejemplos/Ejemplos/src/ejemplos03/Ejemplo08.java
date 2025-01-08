/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero principal de la tabla");
        int valor1 = leer.nextInt();
        System.out.println("Ingrese el limite de la tabla ");
        int valor2 = leer.nextInt();
        System.out.println("Ingrese el numero 1 si desea sumar 0 "
                + "ingrese 2 si desea multiplicar los dos valores");
        int opcion = leer.nextInt();
        String mensajeSuma;
        String mensajeSumaDos;
        switch(opcion){
            case 1:
                mensajeSuma = obtenerTablaSumar(valor1, valor2);
                System.out.printf("%s\n", mensajeSuma);
            break;
            case 2:
                mensajeSumaDos = obtenerTablaMultiplicar(valor1, valor2);
                System.out.printf("%s\n", mensajeSumaDos);
                
            break;
            
            default:
        
        }
       
        
         // se invoca al método 
                                                       // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
        
        
        
        
        
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
