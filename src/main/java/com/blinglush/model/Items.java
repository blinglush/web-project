package com.blinglush.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-20
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "ITEMS")
public class Items {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="item_id")
    private String itemId;

    @Column(name="item_total")
    private double itemTotal;

    @Column(name="quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart1;

    public Items() {

    }

    public Items(String itemId, double itemTotal, int quantity, Cart cart1) {
        this.itemId = itemId;
        this.itemTotal = itemTotal;
        this.quantity = quantity;
        this.cart1 = cart1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cart getCart1() {
        return cart1;
    }

    public void setCart1(Cart cart1) {
        this.cart1 = cart1;
    }
}
