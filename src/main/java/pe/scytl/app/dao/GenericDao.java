package pe.scytl.app.dao;

import java.util.List;

public interface GenericDao<T> {

    public List<T> findAll();

    public T findById(String id);
}
