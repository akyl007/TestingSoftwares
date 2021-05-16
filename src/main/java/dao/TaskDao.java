package dao;

import model.Task;

import javax.persistence.EntityManager;
import java.util.List;

public class TaskDao {
    private EntityManager em;

    public TaskDao(){
    }

    public TaskDao(EntityManager em){
        this.em = em;
    }

    public List<Task> findAll(){
        return em.createQuery("SELECT t FROM task t", Task.class).getResultList();
    }

    public void persist(Task t){
        em.persist(t);
    }

    public void remove(Task t){
        em.remove(t);
    }


    public Task find(Integer id){
        return em.find(Task.class, id);
    }

    public Task merge(Task t){
        return em.merge(t);
    }



}
