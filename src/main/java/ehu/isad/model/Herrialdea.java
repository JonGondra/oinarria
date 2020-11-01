package ehu.isad.model;

public class Herrialdea {
    private String izena;
    private String bandera;

    public Herrialdea(String izena, String bandera) {
        this.izena = izena;
        this.bandera = bandera;
    }

    public String getIzena() {
        return izena;
    }

    public String getBandera() {
        return bandera;
    }

    @Override
    public String toString() {
        return "Herrialdea{" +
                "izena='" + izena + '\'' +
                ", bandera='" + bandera + '\'' +
                '}';
    }
}