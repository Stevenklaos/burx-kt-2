package Project;

public class Burger {

    private String Nimetus;
    private String Liha;
    private double Hind;
    private String SaiaTüüp;

    public Burger(String Nimetus, String Liha, double Hind, String SaiaTüüp) {
        this.Nimetus = Nimetus;
        this.Liha = Liha;
        this.SaiaTüüp = SaiaTüüp;
        this.Hind = Hind;
    }
    public String getNimetus() {
        return Nimetus;
    }
    public double getHind() {
        return Hind;
    }
    public String toString() {
        return "Burger: " + Nimetus + " Hind: " + Hind + " Liha: " + Liha + " Sai: " + SaiaTüüp;
    }

}