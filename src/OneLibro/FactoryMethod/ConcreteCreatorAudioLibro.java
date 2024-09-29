package OneLibro.FactoryMethod;
public class ConcreteCreatorAudioLibro extends Libro_Creator {
    @Override
    public Libro_Interface crearLibro() {
        AudioLibro libro = new AudioLibro();
        libro.llenarDetalles();  // Llamar al método para llenar detalles
        return libro;
    }
}
