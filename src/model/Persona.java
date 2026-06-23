
package model;


public class Persona {
    
    private String rut;
    private String nombre;
    private String telefono;
    
    public Persona() {
      }  
    public Persona(String rut, String nombre, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        }
    

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Rut: " + rut +
               ", Nombre: " + nombre +
               ", Teléfono: " + telefono;
    }
    
}
