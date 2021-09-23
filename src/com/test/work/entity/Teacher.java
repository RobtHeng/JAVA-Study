package com.test.work.entity;

import com.test.inter.Singer;

public class Teacher extends Person implements Singer {
    final private String type="English";

    public String getType() {
        return type;
    }

    @Override
    public void Dosomething() {
        System.out.println("上课");
    }

    @Override
    public void sing() {
        System.out.println("唱菊花台");
    }
}
