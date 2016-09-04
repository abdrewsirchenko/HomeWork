package com.company;

public class Dog {
    private String name;
    private String says;
    public void SetParameters(String name, String says ){

        this.name = name;
        this.says = says;
    }
    public void GetParameters (){
        System.out.println(name + " " + says);
    }
}