package OneLibro.FactoryMethod;
public class ConcreteCreatorEbook extends Libro_Creator {
    @Override
    public Libro_Interface crearLibro() {
        eBook libro = new eBook();
        libro.llenarDetalles();  // Llamar al método para llenar detalles
        return libro;
    }
}
