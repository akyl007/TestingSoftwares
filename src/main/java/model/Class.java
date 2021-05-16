package model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class")
public class Class extends AbstractEntity{

    @Basic(optional = false)
    @Column(nullable = false)
    private String name;

    @ManyToMany
    private List<Student> student;

    @OneToMany
    private Task task;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }


    @Override
    public String toString() {
        return "Class:{ " + name;
    }




}
