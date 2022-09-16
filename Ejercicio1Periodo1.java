
package ejercicio1periodo1;
import java.util.Scanner;
public class Ejercicio1Periodo1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int numero1;
    int numero2;
    int suma;
    
    System.out.print("Escriba el primer entero: ");
    numero1 = entrada.nextInt();
    
    System.out.print("Escriba el segundo numero: ");
    numero2 = entrada.nextInt();
    
    suma = numero1 + numero2;
    
    System.out.println("La suma es " + suma);
        // TODO code application logic here
    }
    
}
