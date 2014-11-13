package com.blinglush.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-20
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "CART")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private long id;
    @Column(name = "total")
    private double total;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="cart1")
    private Set<Items> items1;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Items> getItems1() {
        return items1;
    }

    public void setItems1(Set<Items> items1) {
        this.items1 = items1;
    }
}
