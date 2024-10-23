package com.example.service;

import java.util.ArrayList;

import com.example.model.Teacher;
import com.example.model.Student;

public class SchoolService  {
    //フィールドの定義
    ArrayList<Student> lista = new ArrayList<Student>(); //studentList
    ArrayList<Teacher> listb = new ArrayList<Teacher>(); //teacherList

    //studentlist
    public void listA(Student student){
        if(student.getAge() >= 10){
            lista.add(student);
        } else{
            System.out.println(student.getName() + "さんは１０歳以下です");
        }
    }
    

    //teacherList
    public void listB(Teacher teacher){
    if(teacher.getAge() >= 10){
        listb.add(teacher);
    } else{
        System.out.println(teacher.getName() + "さんは１０歳以下です");
    }
    }

    public void list(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getName() + "," + lista.get(i).getAge() + "," + lista.get(i).getClub() + ",生徒");
        }

        for(int i = 0; i < listb.size(); i++){
            System.out.println(listb.get(i).getName() + "," + listb.get(i).getAge() + "," + listb.get(i).getSchoolYear() + ",先生");
        }
    }
}

