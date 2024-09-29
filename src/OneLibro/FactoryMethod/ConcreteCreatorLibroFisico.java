package OneLibro.FactoryMethod;

public class ConcreteCreatorLibroFisico extends Libro_Creator {
    @Override
    public Libro_Interface crearLibro() {
        LibroFisico libro = new LibroFisico();
        libro.llenarDetalles();  // Llamar al método para llenar detalles
        return libro;
    }
}
