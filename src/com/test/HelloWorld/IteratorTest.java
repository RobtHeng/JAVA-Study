package com.test.HelloWorld;

import com.test.work.entity.Point;

import java.util.*;
public class IteratorTest {
    public static void main (String args[]){
        List c =new ArrayList();
        c.add(new Point(4,2,3));
        c.add(new Point(2,3,3));
        c.add(new Point(3,4,3));
        Iterator I =c.iterator();
        while(I.hasNext()){
            Point p=(Point) I.next();
            if (p.getY()==3){
                //I.remove();
            }
            System.out.println(p.toString());
        }

        Collections.sort(c);

        for(Object o:c){
            System.out.println(1+","+o);
        }
        System.out.println(c);
    }

}
