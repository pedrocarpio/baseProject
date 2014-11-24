package pe.scytl.app.controller.wrapper;

import java.util.List;

/**
 * Created by robertoespinoza on 24/11/14.
 */
public class ListWrapper<T> {

    private List<T> entities;
    private Paging paging;
    private Sort sort;

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
