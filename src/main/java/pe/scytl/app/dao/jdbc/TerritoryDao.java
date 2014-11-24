package pe.scytl.app.dao.jdbc;

import pe.scytl.app.dao.GenericDao;
import pe.scytl.app.entity.Territory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TerritoryDao extends JdbcDaoSupport implements GenericDao<Territory> {

    @Autowired
    TerritoryDao(DataSource dataSource){
        setDataSource(dataSource);
    }

    @Override
    public List<Territory> findAll() {

        List<Territory> empList = new ArrayList<Territory>();
        String query = "select * from territory";
        empList = getJdbcTemplate().query(query,
                new BeanPropertyRowMapper(Territory.class));
        return empList;
    }

    @Override
    public Territory findById(String id) {

        Territory emp = null;
        String query = "select * from territory where id=?";
        Object[] inputs = new Object[] {id};
        emp = (Territory) getJdbcTemplate().queryForObject(query, inputs,
                new BeanPropertyRowMapper(Territory.class));
        return emp;
    }
}
