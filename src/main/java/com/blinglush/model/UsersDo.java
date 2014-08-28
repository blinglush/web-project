package com.blinglush.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-20
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="Users", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class UsersDo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
    private int id;
    @Column(name="first_name", nullable = false, length = 20)
    private String firstName;
    @Column(name="last_name", nullable = true, length = 20)
    private String lastName;
    @Column(name="email", nullable = false, length = 50)
    private String email;
    @Column(name="country", nullable = true, length = 20)
    private String country;
    @Column(name="password", nullable = false, length = 20)
    private String password;
    @Column(name="create_dt")
    private Date createDt;
    @Column(name="update_dt", nullable = true)
    private Date updateDt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsersDo)) return false;

        UsersDo usersDo = (UsersDo) o;

        if (id != usersDo.id) return false;
        if (email != null ? !email.equals(usersDo.email) : usersDo.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
