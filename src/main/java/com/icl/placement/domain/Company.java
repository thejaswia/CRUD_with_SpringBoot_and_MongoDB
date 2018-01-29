package com.icl.placement.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company {

    @Id
    private Integer id;
    private String name;
    private String website;
    private String email;
    private String address;
    private String contact;
    private String status;

    public Company() {

    }

    public Company(Integer id, String name, String website, String email, String address, String contact, String status) {

        this.id = id;
        this.name = name;
        this.website = website;
        this.email = email;
        this.address = address;
        this.contact = contact;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}