package model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student extends AbstractEntity {

    @Basic(optional = false)
    @Column(nullable = false)
    private String username;

    @Basic(optional = false)
    @Column(nullable = false)
    private String password;

    @OneToMany
    private Class eClass;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User: " + username;
    }

}
