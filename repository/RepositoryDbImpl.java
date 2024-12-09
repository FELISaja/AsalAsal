package repository;

import java.util.List;

public class RepositoryDbImpl<T> implements Repository<T> {
    private List<T> database;

    public RepositoryDbImpl(List<T> database) {
        this.database = database;
    }

    @Override
    public void add(T entity) {
        database.add(entity);
    }

    @Override
    public void remove(T entity) {
        database.remove(entity);
    }

    @Override
    public List<T> findAll() {
        return database;
    }

    @Override
    public T findById(int id) {
        for (T entity : database) {
            if (entity instanceof entities.Kamar && ((entities.Kamar) entity).getId() == id) {
                return entity;
            } else if (entity instanceof entities.Reservasi && ((entities.Reservasi) entity).getIdReservasi() == id) {
                return entity;
            }
        }
        return null;
    }
}
