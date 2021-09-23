package com.test.HelloWorld;

import com.test.work.entity.Point;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollect {
    public static void main (String[] args){
        Collection c=new ArrayList();
        c.add(new Point(1,2,3));
        c.remove(new Point(1,2,3));
        System.out.println(c);
    }
}
