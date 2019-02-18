package com.android.plugindemo;

public class Clent {
    public static void main(String[] args){
        //你要别人买饭 钱是你掏
        //
        Man man=new Man();
        //钱是你掏
        Salesman salesman=new Salesman(man);
        salesman.applyBank();
    }
}
