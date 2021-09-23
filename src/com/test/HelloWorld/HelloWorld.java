package com.test.HelloWorld;

import com.test.inter.Singer;
import com.test.work.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args){
        Integer num=GetNum(7);
        System.out.println("Hello World!");
        System.out.println(num);

        //Person p=new Person(10,20,"John");
        //Person r=new Person(10,201,"John");
        //String sp=p.toString();
        //boolean zp=p.equals(r);
        //System.out.println(sp+","+zp);
        //p.setAge(30);
        //System.out.println(p.getAge()+","+p.getId());
        BirthDate birthDate=new BirthDate(2021,8,6);
        birthDate.SetDisplay();
        Student sd=new Student(10,20,"John","TT");
        Teacher tc=new Teacher();
        sd.sing();
        tc.sing();
        System.out.println(tc.getType());
        Point point=new Point(3,4,5);
        Point m=new Point(1,1,1);
        point.setP(sd);
        m.setP(tc);
        point.Dosomething();
        m.Dosomething();
        m.sing((Singer)sd);
        m.sing((Singer)tc);
        point.getDistance(m);
        point.getDistance();

        Student ss=new Student(1,2,"Tom","HH");
        //ss.setAge(10);
        //ss.setName("John");
        //ss.setSchool("TT");
        //ss.setId(4);
        ss.print();
        Object number=1;
        String c=number.toString();
        Object a=String.valueOf(c);
        System.out.println(c+","+a);
        String name1="john";
        String name2="john";
        Boolean b=name1.equals(name2);
        System.out.println(b);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","T1");
        map.put("2","T2");
        ArrayList list = new ArrayList();
        boolean isStudent=false;
        //判断是不是Student类
        if(ss instanceof Person){
            isStudent=true;
        }else{
            isStudent=false;
        }
        System.out.println(isStudent);

        try{
            System.out.println(2/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static Integer GetNum(Integer num){
        if((num==1)||(num==2)){
            return 1;
        }else{
            return GetNum(num-1)+GetNum(num-2);
        }
    }
}
