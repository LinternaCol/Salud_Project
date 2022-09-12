package com.ramostear.springboot.uploadfile.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user" , nullable = false, unique = true)
    private  Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String email;
    @Column(length = 3)
    private String tipeBlood;
     //constructor

    public UserModel(Long id, String name, String email, String tipeBlood) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tipeBlood = tipeBlood;
    }

    public UserModel(String name, String email, String tipeBlood) {
        this.name = name;
        this.email = email;
        this.tipeBlood = tipeBlood;
    }
    public UserModel() {
    }
    //Getters and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipeBlood() {
        return tipeBlood;
    }

    public void setTipeBlood(String tipeBlood) {
        this.tipeBlood = tipeBlood;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tipeBlood='" + tipeBlood + '\'' +
                '}';
    }
}
