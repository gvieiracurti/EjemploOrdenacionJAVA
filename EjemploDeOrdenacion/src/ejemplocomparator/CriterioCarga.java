package ejemplocomparator;

import dominio.Camion;
import java.util.Comparator;

public class CriterioCarga implements Comparator<Camion> {

    @Override
    public int compare(Camion unCamion, Camion otroCamion) {
        return unCamion.getCarga() - otroCamion.getCarga();
    }

}
