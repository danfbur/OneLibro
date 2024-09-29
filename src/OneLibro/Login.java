package OneLibro;
import java.util.Scanner;

public class Login{
    public static Usuario iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        int rol = 0;
        do{
            System.out.print("\n¿Desea iniciar sesión como cliente o registrador? (1: cliente / 2: administrador): ");
                rol = scanner.nextInt();

            if (rol == 2) {
                return new Administrador();
            } else if (rol == 1) {
                return new Cliente();
            } else {
                System.out.println("\nRol no válido.");
                return null;
            }
        }while(rol != 1 || rol != 2);
    }
}
