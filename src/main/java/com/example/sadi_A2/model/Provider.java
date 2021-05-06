package com.example.sadi_A2.model;

import javax.persistence.*;

@Entity
@Table(name= "provider")
public class Provider {

    //id, name, address, phone, fax, email, contact person
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    @Column
    String address;
    @Column
    String phone;
    @Column
    String fax;
    @Column
    String email;
    @Column
    String contactPerosn;

    public Provider() {
    }

    public Provider(int id, String address, String phone, String fax, String email, String contactPerosn) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.contactPerosn = contactPerosn;
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

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getContactPerosn() {
        return contactPerosn;
    }
}
