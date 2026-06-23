
package model;


public class Proveedor extends Persona{
  private String servicio;

    public Proveedor() {
    }

    public Proveedor(String rut, String nombre, String telefono, String servicio) {
        super(rut, nombre, telefono);
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Servicio: " + servicio;
    }  
} 
