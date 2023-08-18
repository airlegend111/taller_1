import java.util.Scanner;

/**
 * Contrasena
 */
/**
 * contrasena
 */
public class contrasena {
    public static void main(String[] args) {
         final String  contrasenabase = "15689";
        String  usuario, contrasena;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digita tu nombre de usuario");
    usuario = scanner.next();
    do {
        System.out.println("Digite la contraseña del sistema");
        contrasena = scanner.next();

        
    } while (contrasena.equals(contrasenabase) == false);
    scanner.close();
     System.out.println("Bienvenido al sistema usuario");

    }
}
