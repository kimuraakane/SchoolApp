package com.example.model;

public class Person {
    //フィールドの宣言
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //ゲッター
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

}
