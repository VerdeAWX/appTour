
package app;

import java.util.Scanner;
import model.Guia;
import service.GestionPersonas;
import util.LeerArchivo;

public class main {

    
    public static void main(String[] args) {
        
        
     GestionPersonas gestion = new GestionPersonas();

        LeerArchivo.cargarGuias("personas.csv", gestion);

        System.out.println("===== LISTA DE GUÍAS =====");

        gestion.mostrarGuias();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese Rut a buscar:");

        String rut = sc.nextLine();

        Guia guia = gestion.buscarPorRut(rut);

        if (guia != null) {

            System.out.println("\nGuía encontrado");

            System.out.println(guia);

        } else {

            System.out.println("\nNo existe ese guía.");

        }

    }
    
}
