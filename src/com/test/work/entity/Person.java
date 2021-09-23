package com.test.work.entity;

public abstract class Person {
    public int id;
    private int age=20;
    public String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){
        System.out.println("ceshi");
    }
    public Person(int _id, int _age,String _name){
        id=_id;
        age=_age;
        name=_name;
    }
    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(this.getName()+","+this.getAge()+","+this.getId());
    }

    public String toString(){
        return this.getName()+","+this.getAge()+","+this.getId();
    }

    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj instanceof Person){
            Person p=(Person)obj;
            if((p.getId()==this.id)&&(p.getAge()==this.age)&&(p.getName()==this.name)){
                return  true;
            }
        }
        return false;
    }
    public abstract void Dosomething();

}
