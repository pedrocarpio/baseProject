package pe.scytl.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.scytl.app.controller.wrapper.ListWrapper;
import pe.scytl.app.controller.wrapper.Paging;
import pe.scytl.app.controller.wrapper.Sort;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by robertoespinoza on 24/11/14.
 */
public abstract class GenericController<T, ID extends Serializable> {

    public GenericController() {

    }

    @RequestMapping
    public Map<String, Object> list(Paging paging, Sort sort, T entity){

        Map<String, Object> response = new HashMap<String, Object>();

        try{

            ListWrapper<T> result = new ListWrapper<T>();

            response.put("entities", result.getEntities());
            response.put("paging", result.getPaging());
            response.put("sort", result.getSort());

        }catch (Exception ex){
            response.put("success", false);
            response.put("message", ex.getMessage());
            response.put("errors", null);
        }

        return response;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> create(T entity) {

        Map<String, Object> response = new HashMap<String, Object>();

        try{
            T created = entity;

            response.put("success", true);
            response.put("created", entity);

        }catch(Exception ex){
            response.put("success", false);
            response.put("message", ex.getMessage());
            response.put("errors", null);
        }

        return response;

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, Object> get(@PathVariable ID id){

        Map<String, Object> response = new HashMap<String, Object>();

        try{
            T entity = null;

            response.put("success", true);
            response.put("entity", entity);

        }catch(Exception ex){
            response.put("success", false);
            response.put("message", ex.getMessage());
            response.put("errors", null);

        }

        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Map<String, Object> update(@PathVariable ID id, T entity){

        Map<String, Object> response = new HashMap<String, Object>();

        try{
            T updated = entity;

            response.put("success", true);
            response.put("modified", entity);

        }catch(Exception ex){
            response.put("success", false);
            response.put("message", ex.getMessage());
            response.put("errors", null);
        }

        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Map<String, Object> delete(@PathVariable ID id){

        Map<String, Object> response = new HashMap<String, Object>();

        try{
            response.put("success", true);

        }catch (Exception ex){
            response.put("success", false);
            response.put("message", ex.getMessage());
            response.put("errors", null);
        }

        return response;
    }

}
