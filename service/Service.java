package service;

public interface Service {
    void tambahKamar(String tipeKamar, double harga);
    void hapusKamar(int idKamar);
    void tampilkanKamarTersedia();
    void bookingKamar(String namaTamu, int idKamar);
    void checkIn(int idReservasi);
    void checkOut(int idReservasi);
    void bayarReservasi(int idReservasi);
    void lihatReservasi();
}
