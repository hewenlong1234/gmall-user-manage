package com.atguigu.gmall.user;

public class Time {

    public static void main(String[] args) {
        Time time=new Time(8,20,30);  //8:20:30
        time.setS(50);//设置秒
        System.out.println(time);
    }
    int h,m,s;



    public Time(int h, int m, int s) {
        super();
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String toString() {

        return h+":"+m+":"+s;
    }
}
