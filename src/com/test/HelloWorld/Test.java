package com.test.HelloWorld;

import com.test.work.entity.BirthDate;

public class Test {
    public static void main (String[] args){
        int num=GetNum(10);

        int[] a={1,2,3,4,5,6,7,8,9,10};
        int x=SearchNum(a,7);
        System.out.println(x);

        BirthDate[] birthDates;
        birthDates=new BirthDate[4];
        birthDates[0]=new BirthDate(2001,1,2);
        birthDates[1]=new BirthDate(2004,3,2);
        birthDates[2]=new BirthDate(2003,10,2);
        birthDates[3]=new BirthDate(2004,1,2);
        BirthDate[] b=SortNum(birthDates);

        BirthDate bb= new BirthDate(2004,1,2);
        int xh=SearchDate(b,bb);

        int lCount=0,uCount=0,oCount=0;
        String ss="AaaBDSss*%_AAAxs";
        for(int i=0;i<ss.length();i++){
            char c=ss.charAt(i);
            if((c>='a')&&(c<='z')){
                lCount=lCount+1;
            }else if((c>='A')&&(c<='Z')){
                uCount++;
            }else{
                oCount++;
            }
        }
    }
    //排序
    public static BirthDate[] SortNum(BirthDate[] bDate){
        for(int i=bDate.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(bDate[i].compare(bDate[j])!=1){
                    BirthDate temp=bDate[i];
                    bDate[i]=bDate[j];
                    bDate[j]=temp;

                }
            }
        }
        return bDate;

    }

    //二分法
    public static int SearchDate(BirthDate[] birthDates,BirthDate birthDate){
        if(birthDates.length==0) return -1;
        int minNum=0;
        int maxNum=birthDates.length-1;
        int m=(minNum+maxNum)/2;
        while(minNum<=maxNum){
            if(birthDates[m].compare(birthDate)==0) return m;
            if(birthDates[m].compare(birthDate)==1){
                maxNum=m-1;
            }
            if(birthDates[m].compare(birthDate)==-1){
                minNum=m+1;
            }
            m=(minNum+maxNum)/2;

        }
        return -1;
    }


    /*
    /   二分法查找
    /
     */
    public static int SearchNum(int[] a ,int b){
        if(a.length==0) return -1;
        int minNum=0;
        int maxMun=a.length-1;
        int num=(minNum+maxMun)/2;
        while(minNum<=maxMun){
            if(a[num]==b) return num;
            if(a[num]>b){
                maxMun=num-1;
            }
            if(a[num]<b){
                minNum=num+1;
            }
            num =(minNum+maxMun)/2;
        }
        return -1;

    }

    /*
    //数3去1
    */
    public static int GetNum(int num){
        boolean[] a;
        a = new boolean[num];
        for(int i=0;i<num;i++){
            a[i]=true;
        }
        int index=0;
        int length =a.length;
        int count=0;
        while(length>1){
            if(a[index]==true){
                count++;
                if(count==3){
                    a[index]=false;
                    count=0;
                    length--;
                }

            }
            index++;
            if(index==a.length){
                index=0;
            }
        }
        int xh=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==true){
                xh=i+1;
               System.out.println(i);
            }
        }
        return xh;
    }
}
