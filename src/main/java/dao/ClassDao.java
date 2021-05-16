package dao;

import model.Class;

import javax.persistence.EntityManager;
import java.util.List;

public class ClassDao {
    private EntityManager em;

    public ClassDao(){ }

    public ClassDao(EntityManager em){
        this.em = em;
    }

    public List<Class> findAll(){
        return em.createQuery("SELECT c FROM class c", Class.class).getResultList(); }

    public void persist(Class c){
        em.persist(c);
    }

    public void remove(Class c){
        em.remove(c);
    }

    public Class find(Integer id){
        return em.find(Class.class, id);
    }

    public Class merge(Class c){
        return em.merge(c);
    }

}
