
package model;


public class PaseoLAcustre extends ServicioTuristico {
    
     private String tipoEmbarcacion;

    public PaseoLAcustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "=== Paseo Lacustre ===\n" +
                super.toString() +
                "\nTipo de embarcacion: " + tipoEmbarcacion;
    }
}
