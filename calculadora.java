import java.util.Scanner;
/**
 * calculadora
 */
public class calculadora {

public static void main(String[] args) {
    
        System.out.println("Calculadora");
        int i;
        i = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite el primer número a operar");

            double n1 = scanner.nextDouble();
            System.out.println("Digite el segundo número a operar");
            double n2 = scanner.nextDouble();

            System.out.println("Suma: " + (n1 + n2));
            System.out.println("Resta: " + (n1 - n2));
            System.out.println("Multiplicación: " + (n1 * n2));
            System.out.println("División: " + (n1 / n2));
            System.out.println("¿Desea seguir operando? Si=1, No=0");

            i = scanner.nextInt();

        } while (i == 1); 
        scanner.close();
        
    }
}