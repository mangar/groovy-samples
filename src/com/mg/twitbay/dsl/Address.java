package com.mg.twitbay.dsl;

public class Address {

    private Integer id;
    private String street;
    
    public Address(Integer id, String street) {
	this.id = id;
	this.street = street;
    }

    public Integer getId() {
        return id;
    }

    public Address setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }
    
}
