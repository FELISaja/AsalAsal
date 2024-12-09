package view;

import service.Service;
import java.util.Scanner;

public class TerminalViewImpl implements TerminalView {
    private final Service service;
    private final Scanner scanner;

    public TerminalViewImpl(Service service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {
        int pilihan;

        do {
            clearScreen();
            System.out.println("--- SISTEM MANAJEMEN HOTEL ---");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Tampilkan Kamar Tersedia");
            System.out.println("3. Hapus Kamar");
            System.out.println("4. Booking Kamar");
            System.out.println("5. Check-in");
            System.out.println("6. Check-out");
            System.out.println("7. Bayar Reservasi");
            System.out.println("8. Lihat Semua Reservasi");
            System.out.println("9. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            handleInput(pilihan);

            if (pilihan != 9) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine(); // Menunggu pengguna
            }
        } while (pilihan != 9);
    }

    public void handleInput(int pilihan) {
        switch (pilihan) {
            case 1 -> tambahKamar();
            case 2 -> tampilkanKamarTersedia();
            case 3 -> hapusKamar();
            case 4 -> bookingKamar();
            case 5 -> checkIn();
            case 6 -> checkOut();
            case 7 -> bayarReservasi();
            case 8 -> lihatReservasi();
            case 9 -> System.out.println("Keluar dari sistem...");
            default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private void tambahKamar() {
        try {
            System.out.print("Masukkan tipe kamar: ");
            String tipeKamar = scanner.nextLine();
            System.out.print("Masukkan harga kamar: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            service.tambahKamar(tipeKamar, harga);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Clear buffer
        }
    }

    private void tampilkanKamarTersedia() {
        service.tampilkanKamarTersedia();
    }

    private void hapusKamar() {
        try {
            System.out.print("Masukkan ID kamar yang akan dihapus: ");
            int idKamar = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            service.hapusKamar(idKamar);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Clear buffer
        }
    }

    private void bookingKamar() {
        try {
            System.out.print("Masukkan nama tamu: ");
            String namaTamu = scanner.nextLine();
            System.out.print("Masukkan ID kamar untuk dipesan: ");
            int idKamar = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            service.bookingKamar(namaTamu, idKamar);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Clear buffer
        }
    }

    private void checkIn() {
        try {
            System.out.print("Masukkan ID reservasi: ");
            int idReservasi = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            service.checkIn(idReservasi);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Clear buffer
        }
    }

    private void checkOut() {
        try {
            System.out.print("Masukkan ID reservasi: ");
            int idReservasi = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            service.checkOut(idReservasi);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Clear buffer
        }
    }

    private void bayarReservasi() {
        try {
            System.out.print("Masukkan ID reservasi: ");
            int idReservasi = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            service.bayarReservasi(idReservasi);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
            scanner.nextLine(); // Clear buffer
        }
    }

    private void lihatReservasi() {
        service.lihatReservasi();
    }

    private void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
