package OneLibro;
import java.util.ArrayList;
import OneLibro.FactoryMethod.Libro_Interface;

public class Cliente extends Usuario{
    
     public Cliente() {
    }

    public void mostrarLibrosDisponibles(ArrayList<Libro_Interface> librosDisponibles) {
        if (librosDisponibles.isEmpty()) {
            System.out.println("\nNo hay libros disponibles. Por favor, pida a un registrador que registre libros.");
            return;
        }else{
            System.out.println("\nLibros disponibles: ");
            for (int i = 0; i < librosDisponibles.size(); i++) {
                System.out.println("\n----------------------------" + (librosDisponibles.get(i).mostrarDetalles()));
            }
        }
    }
}
