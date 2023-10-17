package org.example;
import java.util.ArrayList;
import java.util.List;
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

        // 5. Пользователь вводит три дробных числа. Вывести те из них,
        //квадратный корень которых меньше 2.

  System.out.println("Введите три дробных числа ");
        Double oneFraction = scan.nextDouble();
        System.out.println("... Второе");
        Double twoFraction = scan.nextDouble();
        System.out.println("... и Третье");
        Double threeFraction = scan.nextDouble();
        Double []factionArray = {oneFraction, twoFraction, threeFraction};
        for (int i = 0; i < factionArray.length; i++){
            if (factionArray[i] < Math.sqrt(2)) {
                System.out.println(factionArray[i]);
            }else {
            }
        }


        // 6 Сколько раз выводится икс? Ответ: 5 раз.

/*
  int count = 0;
        int x = 1;
        while (x>=-3) {
            System.out.print(x);
            count++;
            x = x - 1;
        }
        System.out.println(count);
/*



        // 7 Сколько раз вызывается метод str.length() ? ОтветЖ : 6 раз.

/*
 String str = "Hell";
        System.out.println(str);
        while (str.length() < 10) {
            str = str + "o";
        }
        System.out.println(str);
*/




        // 8. Пользователь вводит два числа. Разделить меньшее на большее и
        //вывести результат.

        System.out.println("Введите два числа");
        int oneValue = 0;
        oneValue = scan.nextInt();
        System.out.println("... и второе число");
        int twoValue = 0;
        twoValue = scan.nextInt();
        if (oneValue < twoValue){
            int result = oneValue / twoValue;
            System.out.println(result);
        }
        else if (oneValue > twoValue){
            int result = twoValue / oneValue;
            System.out.println(result);
        }
        else if (oneValue == twoValue){
            System.out.println("Эти числа равны");
        }


        //  9. Пользователь вводит строку. Используя substring, вывести первые
        // 5 символов.

        String str4 = "Пользователь вводит строку";
        String result = str4.substring(0,5);
        System.out.println(result);


        // 10. Считайте boolean-переменную. Если пользователь ввел true,
        //вывести “истина”, иначе ничего не стоит выводить.

    System.out.println("Введите true или false");
        Boolean state = true;
        state = scan.nextBoolean();
        if(state == true){
            System.out.println("Истина");
        }


        // 11. Пользователь вводит 3 числа. Сделайте три boolean переменных:
        //есть ли среди введённых четное, есть ли среди введённых отрицательное, есть
        //ли число больше тысячи

        System.out.println("Введите три числа: ");
        int x1 = scan.nextInt();
        System.out.println("... второе");
        int x2 = scan.nextInt();
        System.out.println("... третье");
        int x3 = scan.nextInt();
        int[] array1 = {x1, x2, x3};

        for (int i = 0; i < array.length; i++) {
            if (array1[i] % 2 == 0) {
                Boolean isEven = true;
                System.out.println("isEven = " + isEven + " Есть четное число " + array1[i]);
            }
            if (array1[i] < 0) {
                Boolean isNegative = true;
                System.out.println("isNegative = " + isNegative + " Есть отрицательное число " + array1[i]);
            }
            if (array1[i] > 1000) {
                    Boolean isMoreThan1000 = true;
                    System.out.println("isMoreThan1000 = " + isMoreThan1000 + " Есть число больше 1000 " + array1[i]);
                }
            }


        // 12. Пользователь вводит три строки, используя .substring(0, x)
        //выведите эти строки, обрезав те, что длиннее самой короткой. Пример ввода:
        //«повар», «поделка», «лампочка». Вывод: «повар», «подел», «лампо»
        System.out.println("Введите три строки: ");
        String str11 = scan.nextLine();
        System.out.println("... вторую: ");
        String str22 = scan.nextLine();
        System.out.println("... и третью: ");
        String str33 = scan.nextLine();

        int [] strArray = {str11.length(), str22.length(), str33.length()};
        int minLength = strArray[0];
        for (int i = 0; i < strArray.length; i++){
                if(strArray[i] <= minLength){
                    minLength = strArray[i];
                }
            }
        System.out.println(str11.substring(0, minLength));
        System.out.println(str22.substring(0, minLength));
        System.out.println(str33.substring(0, minLength));


        // 13. Мини-игра в слова. Первый игрок вводит слово. Потом второй
        //игрок вводит два числа, с какого по какой символ можно найти слово внутри
        //исходного, используя substring. Потом первый игрок вводит два числа.
        //Побеждает тот, чье слово длиннее. Пример:
        //1: революционный
        //2: 0 3 (вывод: рев)
        //1: 7 13 (вывод: ионный)
        //Победил игрок 1
        System.out.println("Для первого: Введите слово ");
        String str12 = scan.nextLine();
        System.out.println("Для второго: Введите два числа ");
        int x11 = scan.nextInt();
        int x12 = scan.nextInt();
        System.out.println("Для первого: Введите два числа ");
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println(str12.substring(x11, x12));
        System.out.println(str12.substring(y1, y2));
        if (str12.substring(x11, x12).length() < str12.substring(y1, y2).length()){
            System.out.println("Победил Первый");
        }else {
            System.out.println("ПОбеил Второй");
        }
    }
    }



