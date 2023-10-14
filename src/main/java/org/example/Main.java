package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  1. Где хранятся переменные? Сколько переменных можно задать в
        // программе? Чем ограничен размер?
        // Ответ: Переменные хранятся в оперативной памяти компьютера.
        // Переменных может быть неограниченное колисество.
        // Размер ограничен типом переменной, количеством байтов и логикой.

        // 2. Пользователь вводит строку, выведите ее длину
        Scanner scan =  new Scanner(System.in);
        System.out.println("Введите слово или строку:");
        String str1 = scan.nextLine();
        System.out.println(str1.length() );

        //  3. Пользователь вводит две строки, выведите сумму их длин

        System.out.println(" Введите две строки");
        String unoString = scan.nextLine();
        System.out.println(unoString.length() + " букв");

        System.out.println(" ... И вторую строку");
        String twoString = scan.nextLine();
        System.out.println(twoString.length() + " букв");

        System.out.println(unoString.length() + twoString.length());

    }
}