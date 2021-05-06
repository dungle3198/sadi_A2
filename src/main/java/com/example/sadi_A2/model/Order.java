package com.example.sadi_A2.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "income_order")
public class Order {

    //id, date, staff who makes the order, and PROVIDER.
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    @Column
    Date date;

    @ManyToOne
    @JoinColumn(name="staffId")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name="providerId")
    private Provider provider;


    public Order() {
    }

    public Order(int id, Date date, int staffId, int providerId) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Staff getStaff() {
        return staff;
    }

    public Provider getProviderId() {
        return provider;
    }

}
