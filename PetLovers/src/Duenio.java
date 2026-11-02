/**
 * Representa al dueño de una mascota.
 * Contiene información personal y una relación de composición con la clase {@link Direccion}.
 * 
 * @author Daniel Cortes Palacios
 */
public class Duenio {
    /** Nombre completo del dueño. */
    private String nombre;
    
    /** Número telefónico de contacto. */
    private String telefono;
    
    /** Dirección física del dueño (Relación de composición). */
    private Direccion direccion;

    /**
     * Constructor para inicializar un objeto Duenio.
     * 
     * @param nombre    Nombre del dueño.
     * @param telefono  Teléfono de contacto.
     * @param direccion Instancia de la clase {@link Direccion}.
     */
    public Duenio(String nombre, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre del dueño.
     * 
     * @return String con el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del dueño.
     * 
     * @param nombre Nuevo nombre del dueño.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del dueño.
     * 
     * @return String con el teléfono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del dueño.
     * 
     * @param telefono Nuevo número telefónico.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del dueño.
     * 
     * @return Objeto {@link Direccion}.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del dueño.
     * 
     * @param direccion Nueva instancia de {@link Direccion}.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Sobrescribe el método toString para mostrar los datos del dueño.
     * 
     * @return Representación en texto del dueño y su dirección.
     */
    @Override
    public String toString() {
        return "Dueño {nombre='" + nombre + "', teléfono='" + telefono + "', dirección=" + direccion + "}";
    }
}