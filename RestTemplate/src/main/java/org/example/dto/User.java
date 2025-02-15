package org.example.dto;


public class User {
    private Long id;
    private String name;
    private  String lastName;
    private Integer age;

    public User() {
    }

    public User(Long id, String name, String surname, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = surname;
        this.age = age;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}