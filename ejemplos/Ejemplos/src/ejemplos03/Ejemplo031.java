/*
Generar una solución que permita sumar 2 números a través de un metodo, los 
numeros deben ser ingresados por teclado en el método main, el método que genera
la suma debe verificar que los 2 números sean positivos para realizar la 
operación caso contrario la suma debe ser 0.
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor 1");
        int valor1 = leer.nextInt();
        System.out.println("Ingrese el valor 2");
        int valor2 = leer.nextInt();

        // 
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
        // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);

        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }

    public static int obtenerSuma(int a, int b) {
        int suma;

        if (a < 0 || b < 0) {
            suma = 0;
        } else {
            suma = a + b;
        }

        return suma;
        // return a + b;
    }

}
