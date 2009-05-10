package com.mg.twitbay.dsl;

public class Person {

    private Integer id;
    private String name, motherName, fatherName, age; 
    private Address address;
    
    public Person(Integer id, String name) {
	this.id = id;
	this.name = name;
    }

    public Person setAddress(Integer id, String streetName) {
	address = new Address(id, streetName);
	return this;
    }
    
    public String getMotherName() {
        return motherName;
    }

    public Person setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Person setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Person setAge(String age) {
        this.age = age;
        return this;
    }

}
