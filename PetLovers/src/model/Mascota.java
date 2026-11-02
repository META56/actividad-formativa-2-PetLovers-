/**
 * Representa la entidad principal Mascota.
 * Contiene datos del animal y se compone de un objeto {@link Duenio}.
 * 
 * @author Daniel Cortes Palacios
 */
public class Mascota {
    /** Nombre de la mascota. */
    private String nombre;
    
    /** Especie de la mascota (ej. Perro, Gato). */
    private String especie;
    
    /** Edad de la mascota en años. */
    private int edad;
    
    /** Objeto dueño asociado a la mascota (Relación de composición). */
    private Duenio duenio;

    /**
     * Constructor para inicializar una Mascota.
     * 
     * @param nombre  Nombre de la mascota.
     * @param especie Especie a la que pertenece.
     * @param edad    Edad en años.
     * @param duenio  Instancia de la clase {@link Duenio}.
     */
    public Mascota(String nombre, String especie, int edad, Duenio duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.duenio = duenio;
    }

    /**
     * Obtiene el nombre de la mascota.
     * 
     * @return String con el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la mascota.
     * 
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la especie de la mascota.
     * 
     * @return String con la especie.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie de la mascota.
     * 
     * @param especie Nueva especie.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene la edad de la mascota.
     * 
     * @return int con los años de la mascota.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la mascota.
     * 
     * @param edad Nueva edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el dueño de la mascota.
     * 
     * @return Objeto {@link Duenio}.
     */
    public Duenio getDuenio() {
        return duenio;
    }

    /**
     * Establece el dueño de la mascota.
     * 
     * @param duenio Nuevo objeto {@link Duenio}.
     */
    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    /**
     * Sobrescribe el método toString para representar la mascota de forma detallada.
     * 
     * @return Cadena de texto formateada con los datos de la mascota y su dueño.
     */
    @Override
    public String toString() {
        return "Mascota {" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad + " años" +
                ", dueño=" + duenio +
                '}';
    }
}