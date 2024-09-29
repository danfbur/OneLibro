package OneLibro;

public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String telefono;
    private String email;


    public Usuario() {
    }

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidos() {return this.apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getDni() {return this.dni;}
    public void setDni(String dni) {this.dni = dni;}

    public int getEdad() {return this.edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getTelefono() {return this.telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}
}
