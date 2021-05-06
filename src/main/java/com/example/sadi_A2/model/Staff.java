package com.example.sadi_A2.model;

import javax.persistence.*;

@Entity
@Table(name= "staff")
public class Staff {

    //id, name, address, phone, email.
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    @Column
    String address;
    @Column
    String phone;
    @Column
    String email;


    public Staff() {
    }

    public Staff(int id, String address, String phone, String email) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }



    public String getEmail() {
        return email;
    }

}
