package main;

import util.InputUtil;
import util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Operation Center");

        while (true) {
            int operation = InputUtil.enterInteger("What do you want to do?\n" +
                    "1 : Register Student\n" +
                    "2 : Show all Students\n" +
                    "3 : Find Student \n" +
                    "4 : Update Student\n" +
                    "0 : To Quit");


            if (operation == 1) {
                MenuUtil.registerStudents();

            } else if (operation == 2) {
                MenuUtil.printAllStudents();

            } else if (operation == 3) {
                MenuUtil.findStudents();

            } else if (operation == 4) {
                MenuUtil.updateStudent();

            } else if (operation == 0) {
                System.out.println("Quiting from operation!");
                break;

            }else {
                System.out.println("Invalid operation");
                break;
            }

        }

    }
}






