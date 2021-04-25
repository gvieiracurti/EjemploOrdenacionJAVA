package dominio;

import java.util.Objects;

public class Camion implements Comparable<Camion> {

    private String chapa;
    private int carga;

    public Camion(String chapa, int carga) {
        this.chapa = chapa;
        this.carga = carga;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camion{" + "chapa=" + chapa + ", carga=" + carga + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.chapa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.chapa, other.chapa)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Camion unCamion) {
        return this.getCarga() - unCamion.getCarga();
    }

}
