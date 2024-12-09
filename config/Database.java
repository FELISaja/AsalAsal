package config;

import java.util.ArrayList;
import java.util.List;
import entities.Kamar;
import entities.Reservasi;

public class Database {
    public static List<Kamar> kamarList = new ArrayList<>();
    public static List<Reservasi> reservasiList = new ArrayList<>();
    public static int nextKamarId = 1;
    public static int nextReservasiId = 1;
}
