
import java.util.Scanner;
/**
 * calculadora
 */
public class calculadora {

public static void main(String[] args) {

    System.out.println("Digite los numeros a operar");
   Scanner scanner = new Scanner(System.in);
   int n1 = scanner.nextInt();
   int n2 = scanner.nextInt();
   scanner.close();
    System.out.println("suma" + (n1 + n2));
    System.out.println("resta" + (n1 - n2));
    System.out.println("multiplicacion" + (n1 * n2));
    System.out.println("division" + (n1 / n2));
}
}