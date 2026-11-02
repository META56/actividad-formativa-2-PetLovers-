/**
 * Clase principal del programa (Punto de entrada).
 * Encargada de ejecutar el Paso 3: Prueba y validación del modelo instanciando los objetos.
 * 
 * @author Daniel Cortes Palacios
 */
public class Main {
    
    /**
     * Método principal que inicia la ejecución de la aplicación.
     * 
     * @param args Argumentos recibidos por la línea de comandos.
     */
    public static void main(String[] args) {
        // 1. Instanciación de Direccion
        Direccion dir = new Direccion("Av. Libertad", 450, "Ovalle");

        // 2. Instanciación de Duenio con su dirección asociadas
        Duenio duenio = new Duenio("Carlos Soto", "+56987654321", dir);

        // 3. Instanciación de Mascota con su dueño asociado
        Mascota mascota = new Mascota("Firulais", "Perro", 4, duenio);

        // 4. Mostrar por consola la información usando toString()
        System.out.println("=== PRUEBA Y VALIDACIÓN DE CLASES Y JAVADOC ===");
        System.out.println(mascota);
    }
}