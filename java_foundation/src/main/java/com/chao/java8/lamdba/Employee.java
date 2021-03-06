package com.chao.java8.lamdba;

public class Employee {

    private int id;

    private String name;

    private int age;

    private double money;

    private Status status;

    public Employee() {};

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name, int age, double money) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Employee(int id, String name, int age, double money, Status status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.money = money;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", status=" + status +
                '}';
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
}
