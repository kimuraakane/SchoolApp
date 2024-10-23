package com.example.model;

public class Teacher extends Person{
    //フィールドの宣言
    private int schoolYear;

    public Teacher(String name,int age,int schoolYear){
        super(name, age);
        this.schoolYear = schoolYear;
    }

    //ゲッター
    public int getSchoolYear(){
        return this.schoolYear;
    }
}
