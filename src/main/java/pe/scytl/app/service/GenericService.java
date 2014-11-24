package pe.scytl.app.service;

import java.util.List;

public interface GenericService<T> {

    public List<T> findAll();

    public T findById(String id);
}
