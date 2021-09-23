package com.test.work.entity;

import com.test.inter.Singer;

public class Student extends Person implements Singer {
    private String school;
    public int id;
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void print() {
        super.setId(12);
        this.setId(13);
        System.out.println(this.getName()+","+this.getAge()+","+this.getId()+","+this.getSchool());
        System.out.println(super.getId()+","+this.getId());
    }

    public Student(int _id, int _age, String _name,String _school) {
        super(_id, _age, _name);
        school=_school;
    }

    @Override
    public void Dosomething() {
        System.out.println("写作业");
    }

    @Override
    public void sing() {
        System.out.println("唱征服");
    }
}
