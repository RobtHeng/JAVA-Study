package com.test.HelloWorld;

import com.test.work.entity.CircleKid;
import com.test.work.entity.Kid;

public class CircleTest {
    public static void main(String[] args){
        CircleKid ck=new CircleKid(500);
        int num=0;
        Kid kid= ck.first;
        while(ck.count>1){
            num++;
            if(num==3){
                num=0;
                ck.delete(kid);
            }
            kid=kid.getRight();
        }
        System.out.println(ck.first.getId());
    }
}
