package entities;

public class Kamar {
    private int id;
    private String tipeKamar;
    private double harga;
    private boolean dipesan;

    public Kamar(int id, String tipeKamar, double harga) {
        this.id = id;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.dipesan = false;
    }

    public int getId() {
        return id;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isDipesan() {
        return dipesan;
    }

    public void setDipesan(boolean dipesan) {
        this.dipesan = dipesan;
    }
}
