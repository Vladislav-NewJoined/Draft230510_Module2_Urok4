import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

// видеоурок  с примером решения здесь: Модуль 1 Урок 2, мин 25.28
public class Draft6_Task2_4_6 {


    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание: \nПользователь вводит строку, выведите ее задом-наперёд.\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String originString = scanner.nextLine();
        System.out.println();
        System.out.println("Строка, перевернутая задом-наперед:");
        /*String reversedString = originString.*/
        String reversedString = reverse(originString);
        System.out.println(reversedString);

        System.out.println();
        System.out.println("Done!");

    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

//        Конец Примера _ ККККККККККККККК







//    //        Пример _ ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        String str = "Techie Delight";
//
//        // Обратите внимание, что строка неизменяема в Java
//        str = reverse(str);
//
//        System.out.println("The reverse of the given string is: " + str);
//    }
//
//    public static String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
//
//
////        Конец Примера _ ККККККККККККККК








}