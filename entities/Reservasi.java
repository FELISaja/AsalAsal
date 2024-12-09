package entities;

public class Reservasi {
    private int idReservasi;
    private String namaTamu;
    private Kamar kamar;
    private boolean checkedIn;
    private boolean pembayaranSelesai;

    public Reservasi(int idReservasi, String namaTamu, Kamar kamar) {
        this.idReservasi = idReservasi;
        this.namaTamu = namaTamu;
        this.kamar = kamar;
        this.checkedIn = false;
        this.pembayaranSelesai = false;
    }

    public int getIdReservasi() {
        return idReservasi;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public boolean isPembayaranSelesai() {
        return pembayaranSelesai;
    }

    public void setPembayaranSelesai(boolean pembayaranSelesai) {
        this.pembayaranSelesai = pembayaranSelesai;
    }
}
