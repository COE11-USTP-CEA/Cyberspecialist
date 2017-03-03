package com.sample.sparkdemo.model;

public class Company{
    String name;
    String address;

    public Company(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
     public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}