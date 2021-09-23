package com.test.work.entity;

public class BirthDate {
    int year;
    int month;
    int date;

    public BirthDate(int _year,int _month,int _date){
        year=_year;
        month=_month;
        date=_date;
    }

    public int compare(BirthDate bDate){
        return year>bDate.year? 1
                :year<bDate.year?-1
                :month>bDate.month?1
                :month<bDate.month?-1
                :date>bDate.date?1
                :date< bDate.date?-1:0;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void SetDisplay(){
        System.out.println(year+"-"+month+"-"+date);
    }

}
