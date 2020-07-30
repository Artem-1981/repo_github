package com.company;

public class Main {
    private static float homework_1( int a, int b, int c, int d){
        float myresult;
        myresult = a*(b+c/d);
        return myresult;
    }
    private static  boolean homework_2(int a, int b){
        if (a+b<=20 && a+b>=10)  return true;
        else return false;
    }
    private static void homework_3(int a){
        if (a<0) System.out.println("Введенное число отрицательное");
        else System.out.println("Введенное число положительное");
    }
    private static void homework_4(String c){
        System.out.println("Привет, "+c+"!");
    }
    private static void homework_5(int a){
        boolean res;
        if (a % 4 == 0 ) res = true;
        else res = false;
        if (a % 100 == 0) res= false;
        if (a % 400 == 0) res= true;
        if (res) System.out.println("Введенный год высокосный");
        else System.out.println("Введенный год не высокосный");
    }
    public static void main(String[] args) {
    homework_5(1500);
    }
}
