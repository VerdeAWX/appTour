
package data;

import model.ExcursionCultural;
import model.PaseoLAcustre;
import model.RutaGastronomica;

public class GestorServicios {
    
    
    public void crearServicios() {

        // Dos rutas gastronómicas
        RutaGastronomica ruta1 = new RutaGastronomica(
                "Sabores de Puerto Varas", 4, 6);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta del Kuchen", 3, 5);

        // Dos paseos lacustres
        PaseoLAcustre paseo1 = new PaseoLAcustre(
                "Lago Llanquihue", 2, "Catamaran");

        PaseoLAcustre paseo2 = new PaseoLAcustre(
                "Todos los Santos", 5, "Lancha");

        // Dos excursiones culturales
        ExcursionCultural excursion1 = new ExcursionCultural(
                "Museo Colonial Aleman", 3, "Frutillar");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Fuerte San Antonio", 4, "Ancud");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
}
