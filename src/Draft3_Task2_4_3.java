import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

// видеоурок с примером решения здесь: Модуль 1 Урок 2, мин 25.28
public class Draft3_Task2_4_3 {




    //        Пример _ ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!! но не с подсказкой, а другим методом
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tПользователь вводит строку, выведите каждый второй символ (подсказка: str.charAt(i) )\n\nРешение: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку. Пример: 'I love java':");
        String str = scanner.nextLine();

        for (int i = 1; i < str.length(); i = i + 2) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("Done!");

    }
//        Конец Примера _ ККККККККККККККК
}