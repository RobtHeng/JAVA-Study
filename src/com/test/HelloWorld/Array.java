package com.test.HelloWorld;

import com.test.work.entity.BirthDate;

import static java.lang.Integer.parseInt;

public class Array {
    public static void main (String[] args){
        BirthDate days[];
        days=new BirthDate[3];
        for(int i=0;i<3;i++){
            days[i]=new BirthDate(2004,8,i+1);
        }

        String[] a={"2","4","6","7","3","5","1","9","8"};
        int[] b;
        b=new int[a.length];
        for(int k=0;k<a.length;k++){
            int m=parseInt(a[k]);
            b[k]=m;
        }

        for(int i=b.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(b[i]<b[j]){
                    int k=b[i];
                    b[i]=b[j];
                    b[j]=k;
                }
            }
        }

        //冒泡算法
        for(int l=0;l<b.length;l++){
            int k=l;
            for(int q=(l+1);q<b.length;q++){
                if(b[k]>b[q]){
                    k=q;
                }
            }
            int m=b[l];
            b[l]=b[k];
            b[k]=m;
        }

        String[] s={"A","B","C","D","E"};
        String[] ss=new String[6];
        System.arraycopy(s,1,ss,1,s.length-1);

    }
}
