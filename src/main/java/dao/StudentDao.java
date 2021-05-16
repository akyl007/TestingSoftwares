package dao;

import model.Student;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDao {

    private EntityManager em;

    public StudentDao(){
    }

    public StudentDao(EntityManager em){
        this.em = em;
    }

    public List<Student> findAll(){
        return em.createQuery("SELECT s FROM student s", Student.class).getResultList();
    }

    public void persist(Student student){
        em.persist(student);
    }

    public void remove(Student student){
        em.remove(student);
    }

    public Student find(Integer id){
        return em.find(Student.class, id);
    }

    public Student merge(Student student){
        return em.merge(student);
    }
}
