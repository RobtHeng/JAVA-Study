package com.test.HelloWorld;
import java.io.File;
import java.io.IOException;
public class FileList {
    public static  void main (String[] args){
        File f=new File("d:/Java资料");
        System.out.println("Java资料");
        tree(f,1);
    }

    public static void tree(File f, int level){
        String SS="";
        for(int j=0;j<level;j++){
            SS+="  ";
        }
        File[] child=f.listFiles();
        for(int i=0;i<child.length;i++){
            System.out.println(SS+child[i].getName());
            if(child[i].isDirectory()){
                tree(child[i],level+1);
            }
        }
    }

}
