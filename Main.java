import config.Database;
import repository.RepositoryDbImpl;
import service.ServiceImpl;
import view.TerminalViewImpl;

public class Main {
    public static void main(String[] args) {
        RepositoryDbImpl<entities.Kamar> kamarRepository = new RepositoryDbImpl<>(Database.kamarList);
        RepositoryDbImpl<entities.Reservasi> reservasiRepository = new RepositoryDbImpl<>(Database.reservasiList);
        ServiceImpl service = new ServiceImpl(kamarRepository, reservasiRepository);
        TerminalViewImpl view = new TerminalViewImpl(service);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int pilihan;
        do {
            view.showMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();
            view.handleInput(pilihan);
        } while (pilihan != 9);
        scanner.close();
    }
}
