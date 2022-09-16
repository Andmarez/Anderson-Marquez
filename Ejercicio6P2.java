
package ejercicio6p2;
public class Ejercicio6P2 {
    public static void main(String[] args) {
        for (int n = 1; n <=10; n++) {
            int f = 1;
        for (int i = 2; i<=n; i++){
            f *= i;
            }
        System.out.println("El factoral de" + n);
        System.out.println(" es: " + f);
        }
        
    }
    
}
