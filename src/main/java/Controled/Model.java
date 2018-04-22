package Controled;

public class Model {
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) { this.nazwa = nazwa;  }

    public int getProdukcja_do() { return produkcja_do; }

    public void setProdukcja_do(int produkcja_do) {
        this.produkcja_do = produkcja_do;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getProdukcja_od() {
        return produkcja_od;
    }

    public void setProdukcja_od(int produkcja_od) {
        this.produkcja_od = produkcja_od;
    }

    public String nazwa;

    public int produkcja_od;

    public int produkcja_do;

    public int masa;
}
