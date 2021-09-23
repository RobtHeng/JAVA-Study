package com.test.work.entity;

import com.test.inter.Singer;

import java.util.Objects;

public class Point implements Comparable {
    double x;
    double y;
    double z;
    Person p;

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

   public Point(double _x,double _y,double _z){
        x=_x;
        y=_y;
        z=_z;
   }

   public void getDistance(Point p){
        double m=Math.pow((x-p.x),2)+Math.pow((y-p.y),2)+Math.pow((z-p.z),2);
        double num=Math.sqrt(m);
        System.out.println(num);
   }

    public void getDistance(){
        double m=Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2);
        double num=Math.sqrt(m);
        System.out.println(num);
    }

    public void Dosomething(){
        p.Dosomething();
    }

    public void sing(Singer s){
        s.sing();
    }

    public String toString(){
        return x+","+y+","+z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0 && Double.compare(point.z, z) == 0 && Objects.equals(p, point.p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, p);
    }

    @Override
    public int compareTo(Object o) {
        Point pp=(Point) o;
        if(Double.compare(pp.x, x) == 0){
            return 0;
        }else if(Double.compare(pp.x,x)>0){
            return -1;
        }else{
            return 1;
        }
    }
}
