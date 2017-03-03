package com.sample.sparkdemo.model;

import java.util.*;

public class Job{
    String name;
    public List<Company> company = new ArrayList<>();   

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public List<Company> getCompany(){
        return this.company;
    }
}