import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

// видеоурок с примером решения здесь: Модуль 1 Урок 2, мин 25.28
public class Draft4_Task2_4_4 {
//        System.out.println("Задание: \n4.\tПользователь вводит строку. Выводите все слова на разных строках " +
//                "(подсказка : if (str.charAt(i)==‘ ‘) System.out.println(); )\n\nРешение: ");

    //        Пример _ ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!! но не с подсказкой, а другим методом
    public static void main(String[] args) {
        System.out.println("Задание: \n4.\tПользователь вводит строку. Выводите все слова на разных строках " +
                "(подсказка : if (str.charAt(i)==‘ ‘) System.out.println(); )\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из 2-х или более слов. Пример: 'Я учусь программированию на языке Java':");
        String originString = scanner.nextLine();
        /*try {*/
        String[] words = originString.split(" ");
        /*System.out.println(Arrays.toString(words));
        String word1 = words[0];
        String word2 = words[1];
        String word3 = words[2];*/





        System.out.println();
        System.out.println("Все слова на разных строках:");
        for (String word : words) {
            System.out.println(word);

        }



        /*String stringWithThreeWords = reverse(originString);*/
        /*System.out.println(word1 + " " + word2 + " " + word3);*/
        /*} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input incorrect.");

        }*/

        System.out.println();
        System.out.println("Done!");

    }

    /*public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/

//        Конец Примера _ ККККККККККККККК

//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку, состоящую из 2-х или более слов. Пример: 'Я учусь программированию на языке Java':");
//        String originString = scanner.nextLine();
//        /*try {*/
//        String[] words = originString.split(" ");
//
//
//        System.out.println();
//        System.out.println("Все слова на разных строках:");
//        System.out.println(words[0]);
//        /*String stringWithThreeWords = reverse(originString);*/
//        /*System.out.println(word1 + " " + word2 + " " + word3);*/
//
//        /*int i = 0;
//        char ch = (originString.charAt(i));
//        char ch2 = (originString.charAt(i+1));
//        char ch3 = (originString.charAt(i+2));*/
//
//        /*char charCheck = originString.charAt(i+1);*/
//        /*if (charCheck == ' ') {
//            System.out.println("ABSOLUT TRUE");
//        }*/
//
//        /*System.out.println(ch);
//        System.out.println(ch2);
//        System.out.println(ch3);*/
//
//        int len = originString.length();
//        System.out.println(len);
//
//        /*if (ch2 == ' ') {
//            System.out.println("true");
//        }*/
//        for (String word : words) {
//            for (int i = 0; i < originString.length(); i++) {
//                char charCheck = originString.charAt(i);
//                if (charCheck == ' ') {
//                    System.out.println("ABSOLUT TRUE");
//                }
//            /*if (charCheck == ' ') {
//                System.out.println("ABSOLUT TRUE");
//            }*/
//
//
//            }
//
//        }
//
//
//
//        /*} catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Input incorrect.");
//        }*/
//
//        System.out.println();
//        System.out.println("Done!");
//
//    }
//
//    /*public static String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }*/
//
////        Конец Примера 1 ККККККККККККККК














}