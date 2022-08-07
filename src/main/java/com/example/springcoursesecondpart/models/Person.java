package com.example.springcoursesecondpart.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "this field cannot be empty")
    @Size(min = 2, max = 30)
    private String name;
    @Min(value = 0, message = "invalid value")
    @Max(value = 150, message = "invalid value")
    private int age;
    @Email(message = "invalid value")
    @NotEmpty(message = "this field cannot be empty")
    private String mail;

    public Person(int id, String name, int age, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;

        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
