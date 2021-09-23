package com.test.HelloWorld;

public class TestEnum {
    public enum MyColor{blue,white,green};

    public static void main (String[] args){
        MyColor m= MyColor.blue;
        switch (m){
            case blue:
                System.out.println("blue");
                break;
            case white:
                System.out.println("white");
                break;
            case green:
                System.out.println("green");
        }
        System.out.println(m);
    }

}
