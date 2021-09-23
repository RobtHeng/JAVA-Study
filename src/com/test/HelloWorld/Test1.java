package com.test.HelloWorld;
import java.lang.Double;

public class Test1 {
    public static void main (String[] args){
        String ss="1,2;3,4,5;6,7,8";
        String[] a=ss.split(";");
        double[][] b=new double[a.length][];
        for(int i=0;i<a.length;i++){
            String s=a[i];
            String[] c=s.split(",");
            b[i]=new double[c.length];
            for(int j=0;j<c.length;j++){
                b[i][j]=Double.parseDouble(c[j]);
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println(b[i][j]+" ");
            }
        }
    }
}
