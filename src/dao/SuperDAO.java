package dao;

import entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface SuperDAO <T extends SuperEntity,ID extends Serializable>{
   boolean save(T entity)throws Exception;

   boolean update(T entity)throws Exception;

   boolean delete(ID key)throws Exception;

   List<T> getAll() throws Exception;

   T get()throws Exception;
}
