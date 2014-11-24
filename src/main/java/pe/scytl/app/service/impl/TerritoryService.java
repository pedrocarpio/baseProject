package pe.scytl.app.service.impl;

import pe.scytl.app.dao.GenericDao;
import pe.scytl.app.entity.Territory;
import pe.scytl.app.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerritoryService implements GenericService<Territory> {

	@Autowired
    private GenericDao<Territory> territoryDao;

    @Override
    public List<Territory> findAll() {

        return territoryDao.findAll();
    }

    @Override
    public Territory findById(String id) {

        return territoryDao.findById(id);
    }
}
