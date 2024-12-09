package repository;

import entities.Kamar;
import java.util.ArrayList;
import java.util.List;

public class KamarRepository {
    private final List<Kamar> kamarList = new ArrayList<>();

    public void saveKamar(Kamar kamar) {
        kamarList.add(kamar);
    }

    public void deleteKamarById(int id) {
        kamarList.removeIf(kamar -> kamar.getId() == id);
    }

    public List<Kamar> findAllKamar() {
        return new ArrayList<>(kamarList);
    }
}
