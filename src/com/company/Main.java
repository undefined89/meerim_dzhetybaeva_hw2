package com.company;

public class Main {

    public static void main(String[] args) {

        // основная домашка - вызов метода 5 раз с разл.аргументами
        String text1 = goForAWalkOrStayHome(0, -45);
        System.out.println(text1);

        String text2 = goForAWalkOrStayHome(10, 13);
        System.out.println(text2);

        String text3 = goForAWalkOrStayHome(56, 0);
        System.out.println(text3);

        String text4 = goForAWalkOrStayHome(28, 15);
        System.out.println(text4);

        String text5 = goForAWalkOrStayHome(67, -13);
        System.out.println(text5);

        // доп.домашка - возврат сгенерированного случ.возраста
        System.out.println(generateRandomAge());
        System.out.println(generateRandomAge());
        System.out.println(generateRandomAge());

        // доп.домашка - “можно ли идти гулять” с помощью генерирования случайного возраста
        String test = goForAWalkOrStayHome(generateRandomAge(), 10);
        System.out.println(test);

        String test1 = goForAWalkOrStayHome(generateRandomAge(), -5);
        System.out.println(test1);

        String test2 = goForAWalkOrStayHome(generateRandomAge(), 0);
        System.out.println(test2);
    }

    public static String goForAWalkOrStayHome(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

//    ДЗ на сообразительность:

//    1. Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}

    public static int generateRandomAge() {
        int minAgeInRange = 0, maxAgeInRange = 100;
    /*
    задала диапазон т.к. по умолч. метод генерации случ.чисел перебирает числа из [0, 1) и метод д.б. типа double.
    Если не задавать диапазон при методе тиа int только 0 в консоли отображаются
    */
        int randomNumber = minAgeInRange + (int) (Math.random() * maxAgeInRange);
        return randomNumber;
    }

/*    2. При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование
случайного возраста с помощью метода “generateRandomAge” test(23, 10); test(generateRandomAge(), 23);*/

    // в методе main
}
