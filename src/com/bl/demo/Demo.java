package com.bl.demo;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Demo {
    private int a = 15;
    public int b = 16;
    int c = a + b;

    public void ml() {
        System.out.println("The value of a:" + a);
        System.out.println("The va");

    }
        public static void main (String[]args){

            Demo suraj = new Demo();
            System.out.println(suraj.a);
            System.out.println(suraj.b);
            System.out.println(suraj.c);
            suraj.ml();
        }
    }


