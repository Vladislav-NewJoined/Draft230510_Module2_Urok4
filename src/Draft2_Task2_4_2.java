import java.math.RoundingMode;
import java.text.DecimalFormat;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

// Видеоурок с примером здесь: Модуль 2, Урок 4, мин 12.09
public class Draft2_Task2_4_2 {
    public static void main(String[] args) {
        System.out.println("Задание: \n2.\tС помощью цикла do..while, выведите числа от -0.9 до 0.9\n\nРешение: ");

        double d = -0.9;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);

        do {
            System.out.println(df.format(d));
            d = d + 0.01;
        } while (d <= 0.91);

        System.out.println();
        System.out.println("Done!");

    }
}