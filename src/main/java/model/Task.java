package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Task extends AbstractEntity{

    private String description;

    @ManyToOne
    private Class eClass;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Class geteClass() {
        return eClass;
    }

    public void seteClass(Class eClass) {
        this.eClass = eClass;
    }
}
