package com.example.model;

public class Student extends Person {
    //フィールドの宣言
    private String club;

    public Student(String name,int age,String club){
        super(name,age);
        this.club = club;
    }

    //ゲッター
    public String getClub(){
        return this.club;
    }


}
