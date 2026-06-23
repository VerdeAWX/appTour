
package model;


public class Operador extends Persona {
     private String empresa;

    public Operador() {
    }
    public Operador(String rut, String nombre, String telefono, String empresa) {
        super(rut, nombre, telefono);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Empresa: " + empresa;
    }
}
