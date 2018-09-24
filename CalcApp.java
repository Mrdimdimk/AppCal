package com.company;

import java.util.Scanner;

public class CalcApp extends AbstractApp {

    private String name;
    private Integer version;
    private int X;
    private int Y;
    Scanner scanner = new Scanner(System.in);
    public CalcApp() {
        super();
    }

    public static void getNumber(){
        int number;
    }


    @Override
   public void print() {
        super.getVersion();
        System.out.println(getVersion()+ "VERSION");
    }

    public static final String TYPE = "Ordinary Calc";



}
