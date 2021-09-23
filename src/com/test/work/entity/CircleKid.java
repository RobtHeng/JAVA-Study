package com.test.work.entity;

import java.security.PublicKey;

public class CircleKid {
    public int count=0;
    public Kid first,last;

    public CircleKid(int n){
        for(int i=0;i<n;i++){
            add();
        }
    }

    void add(){
        Kid k=new Kid();
        k.id=count;
        if(count<=0){
            this.first=k;
            this.last=k;
            k.left=k;
            k.right=k;
        }else{
            this.last.right=k;
            k.right=this.first;
            k.left=this.last;
            this.first.left=k;
            this.last=k;
        }
        count++;
    }

    public void delete(Kid k){
        if (count<=0){
            return;
        }else if(count==1){
            first=last=null;
        }else {
            k.left.right=k.right;
            k.right.left=k.left;
            if(k==first){
                this.first=k.right;
            }else if(k==last){
                this.last=k.left;
            }
        }
        count--;
    }
}
