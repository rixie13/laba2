package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static String test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате 'yyyy' ");
        int year= scanner.nextInt();
        if(year%400==0){
            return "366";
        }else if(year%100==0){
            return "365";
        }if(year%4==0){
            return "366";
        }else if(year!=4){
            return "365";
        }
        return null;
    }
}