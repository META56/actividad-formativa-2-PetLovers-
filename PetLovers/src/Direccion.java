/**
 * Representa la dirección física de una residencia.
 * Esta clase forma parte de la relación de composición dentro del dominio.
 * 
 * @author Daniel Cortes Palacios
 */
public class Direccion {
    /** Nombre de la calle o avenida. */
    private String calle;
    
    /** Número de la vivienda o propiedad. */
    private int numero;
    
    /** Comuna o ciudad de ubicación. */
    private String comuna;

    /**
     * Constructor completo para inicializar un objeto Direccion.
     * 
     * @param calle  Nombre de la calle.
     * @param numero Número de la propiedad.
     * @param comuna Comuna o localidad.
     */
    public Direccion(String calle, int numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }

    /**
     * Obtiene el nombre de la calle.
     * 
     * @return String con el nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     * 
     * @param calle Nuevo nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número de la propiedad.
     * 
     * @return int con el número.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el número de la propiedad.
     * 
     * @param numero Nuevo número.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la comuna.
     * 
     * @return String con la comuna.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna.
     * 
     * @param comuna Nueva comuna.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Sobrescribe el método toString para representar la dirección en formato legible.
     * 
     * @return Representación en texto de la dirección.
     */
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + comuna;
    }
}