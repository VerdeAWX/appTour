
package service;

import java.util.ArrayList;
import model.Guia;

public class GestionPersonas {
     private ArrayList<Guia> listaGuias;

    public GestionPersonas() {
        listaGuias = new ArrayList<>();
    }

    public void agregarGuia(Guia guia) {
        listaGuias.add(guia);
    }

    public void mostrarGuias() {

        for (Guia guia : listaGuias) {
            System.out.println(guia);
        }

    }

    public Guia buscarPorRut(String rut) {

        for (Guia guia : listaGuias) {

            if (guia.getRut().equals(rut)) {
                return guia;
            }

        }

        return null;

    }

    public ArrayList<Guia> getListaGuias() {
        return listaGuias;
    }
}
