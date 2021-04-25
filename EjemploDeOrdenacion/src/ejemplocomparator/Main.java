package ejemplocomparator;

import dominio.Camion;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Camion> camiones = new ArrayList<>();
        camiones.add(new Camion("SAA1212", 150));
        camiones.add(new Camion("AAA1212", 350));
        camiones.add(new Camion("BAA1212", 50));
        camiones.add(new Camion("ZZZ1212", 280));

        System.out.println("camiones = " + camiones);
        System.out.println("Ordeno por Criterio Chapa");
        Collections.sort(camiones, new CriterioChapa());
        System.out.println("camiones = " + camiones);
        System.out.println("");
        System.out.println("Ordeno por Criterio Carga");
        Collections.sort(camiones, new CriterioCarga());
        System.out.println("camiones = " + camiones);
        System.out.println("");
    }
}
