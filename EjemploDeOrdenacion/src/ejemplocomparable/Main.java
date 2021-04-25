package ejemplocomparable;

import dominio.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Camion> camiones = new ArrayList<>();
        camiones.add(new Camion("SAA1212", 150));
        camiones.add(new Camion("AAA1212", 350));
        camiones.add(new Camion("BAA1212", 50));
        camiones.add(new Camion("ZZZ1212", 280));

        System.out.println("camiones = " + camiones);
        Collections.sort(camiones);
        System.out.println("camiones = " + camiones);
    }
}
