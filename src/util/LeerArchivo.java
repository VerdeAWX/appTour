
package util;

import java.io.BufferedReader;
import java.io.FileReader;
import model.Guia;
import service.GestionPersonas;

public class LeerArchivo {
    public static void cargarGuias(String archivo, GestionPersonas gestion) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;

            while ((linea = br.readLine()) != null) {

                String datos[] = linea.split(";");

                Guia guia = new Guia(
                        datos[0],
                        datos[1],
                        datos[2],
                        datos[3]
                );

                gestion.agregarGuia(guia);

            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error al leer archivo: " + e.getMessage());

        }

    }
}
