import java.util.Scanner;

/**
 * Contrasena
 */
/**
 * contrasena
 */
public class contrasena {

    public static void main(String[] args) {
         final String  CONTRASENABASE = "15689";
         final String  USERNAME = "Baena";
        String  usuario, contrasena;
    Scanner scanner = new Scanner(System.in);
    
    do {
        System.out.println("Digita tu nombre de usuario");
        usuario = scanner.nextLine();
        System.out.println("Digite la contraseña del sistema");
        contrasena = scanner.nextLine();

        
    } while ((contrasena.equals(CONTRASENABASE) == false) && (usuario.equals(USERNAME) == false) );
    scanner.close();
     System.out.println("Bienvenido al sistema usuario");

    }
}