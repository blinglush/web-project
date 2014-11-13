package com.blinglush.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * UserDo: shrestar
 * Date: 2014-08-11
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="USER", uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class UserDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false, unique = true, length = 11)
    private int id;

    @Column(name="USERNAME")
    private String userName;

    @Column(name="PASSWORD")
    private String passWord;

    @Column(name="FIRST_NAME")
    private String firstName;


    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="INSERT_TIME")
    private Date insertTime;

    UserDo() {

    }

    public UserDo(String username, String password) {
        this.userName = username;
        this.passWord = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public Date getInsertTime() {

        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
