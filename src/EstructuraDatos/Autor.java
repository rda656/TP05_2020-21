package EstructuraDatos;

/**
 * Clase que permite almacenar los datos correspondientes a un escritor.
 * @author Antonio Ramos
 * @version 1.0
 */
public class Autor {
    private String nombre;
    private String apellidos;

    /**
     * Constructor de la clase a partir de el nombre y el apellido del autor.
     * @param nombre cadena de caracteres con el nombre. Debe ser mayor a 0.
     * @param apellidos cadena de caracteres con los apellidos. Debe ser mayor a 0.
     */
    void Autor (String nombre, String apellidos)
    {
        if(nombre.length() > 0)
            this.nombre = nombre;
        else
            this.nombre = "unknown";
        
        if(apellidos.length() > 0)
            this.apellidos = apellidos;
        else
            this.apellidos = "unknown";
    }

    /**
     * Método que permite modificar el atributo nombre.
     * @param nombre nuevo nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que permite modificar el atributo apellidos.
     * @param apellidos nuevos apellidos.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }   
    
    /**
     * Método que devuelve el contenido almacenado en el atributo nombre.
     * @return contenido del atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el contenido almacenado en el atributo apellidos.
     * @return contenido del atributo apellidos.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método que devuelve una cadena de caracteres con toda la información almacenada en los atributos del objeto.
     * @return cadena de caracteres con la información almacenanada en los atributos.
     */
    @Override
    public String toString() {
        return "Autor:\n" + "nombre: " + nombre + "\napellidos: " + apellidos;
    }       
}
