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
        Scanner scan = new Scanner(System.in);
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

        //  4. Пользователь вводит три строки. Найти, какая из них короче всех.

        System.out.println("Введите три строки");
        String unoStringLength = scan.nextLine();
        System.out.println(unoStringLength.length() + " букв");

        System.out.println("... Вторую");

        String twoStringLength = scan.nextLine();
        System.out.println(twoStringLength.length() + " букв");

        System.out.println("... Третью");

        String threeStringLength = scan.nextLine();
        System.out.println(threeStringLength.length() + " букв");

        int [] array = {unoStringLength.length(), twoStringLength.length(), threeStringLength.length()};
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] <= min) {
                min = array[i];

            }
        }System.out.println("Самая короткая имеет длину в " + min + " букв");
        // Второй вариант
        System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
        String line = scan.nextLine();
        String minLine = line;
        String maxLine = line;
        while (!line.isEmpty()) {
            if (minLine.length() > line.length()) {
                minLine = line;
            } else if (maxLine.length() < line.length()) {
                maxLine = line;
            }
            line = scan.nextLine();
        }
        if (minLine == maxLine) {
            System.out.println("Введена одна строка или строки одинаковы " + minLine);
        } else {
            System.out.println("Самая короткая строка " + minLine);
        }
    }
}


