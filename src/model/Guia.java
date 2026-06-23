
package model;


public class Guia extends Persona {private String especialidad;

    public Guia() {
    }

    public Guia(String rut, String nombre, String telefono, String especialidad) {
        super(rut, nombre, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Especialidad: " + especialidad;
    }
    
}
