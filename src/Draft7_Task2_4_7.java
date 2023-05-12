import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Draft7_Task2_4_7 {


    //        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание: \n7.\tПользователь вводит букву. Выведите любое слово, начинающуюся на эту букву\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cyrillic letter, for example 'д': ");
        String letter = scanner.nextLine();
        System.out.println();
        System.out.println("Here the word, starting with this letter:");
        /*Создаем базу данных 'Буква - Слово', в виде списка HashMap*/
        Map<String, String> map = Map.ofEntries(
                Map.entry("а",  "альбом"),
                Map.entry("б",  "бабушка"),
                Map.entry("в",  "войско"),
                Map.entry("г",  "горизонт"),
                Map.entry("д",  "дом"),
                Map.entry("е",  "еда"),
                Map.entry("ж",  "жизнь"),
                Map.entry("з",  "золото"),
                Map.entry("и",  "икра"),
                Map.entry("й",  "йод"),
                Map.entry("к",  "копейка"),
                Map.entry("л",  "лев"),
                Map.entry("м",  "мама"),
                Map.entry("н",  "нос"),
                Map.entry("о",  "орел"),
                Map.entry("п",  "песня"),
                Map.entry("р",  "ребенок"),
                Map.entry("с",  "слова"),
                Map.entry("т",  "техника"),
                Map.entry("у",  "уровень"),
                Map.entry("ф",  "фарфор"),
                Map.entry("х",  "характер"),
                Map.entry("ц",  "цыпленок"),
                Map.entry("ч",  "чай"),
                Map.entry("ш",  "шашка"),
                Map.entry("щ",  "щиколотка"),
                Map.entry("ъ",  "слово отсутствует"),
                Map.entry("ы",  "слово отсутствует"),
                Map.entry("ь",  "слово отсутствует"),
                Map.entry("э",  "электричество"),
                Map.entry("ю",  "юбка"),
                Map.entry("я",  "яблоко")
        );

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String firstSymbolValue = String.valueOf(value.charAt(0)); // инфо здесь: https://youtu.be/thzfsPEYXfI
            if (letter.equals(firstSymbolValue)) {
                System.out.println(value);
            }
        }

        System.out.println();
        System.out.println("Done!");

    }
//        Конец Примера _ ККККККККККККККК







//    //        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter cyrillic letter, for example 'д': ");
//        String letter = scanner.nextLine();
//        System.out.println();
//        System.out.println("Countries where the phone code starts with this digit:");
//        /*Создаем список HashMap с телефонными кодами стран из справочника*/
//        Map<String, String> mapOrigin = Map.ofEntries(
//                Map.entry("7840", "Abkhazia"),
//                Map.entry("93", "Afghanistan"),
//                Map.entry("355", "Albania"),
//                Map.entry("213", "Algeria"),
//                Map.entry("1684", "American Samoa"),
//                Map.entry("376", "Andorra"),
//                Map.entry("244", "Angola"),
//                Map.entry("1264", "Anguilla"),
//                Map.entry("1268", "Antigua and Barbuda"),
//                Map.entry("54", "Argentina"),
//                Map.entry("374", "Armenia"),
//                Map.entry("297", "Aruba"),
//                Map.entry("263", "Zimbabwe")
//        );
//
//        Map<String, String> mapFirstSymbol = new HashMap<>();
//        for (Map.Entry<String, String> entry : mapOrigin.entrySet()) {
//            String originKey = entry.getKey();
//            String value = entry.getValue();
//            String firstSymbolKey = String.valueOf(originKey.charAt(0)); // инфо здесь: https://youtu.be/thzfsPEYXfI
//            if (letter.equals(firstSymbolKey)) {
//                System.out.println(value);
//            }
//        }
//
//        System.out.println();
//        System.out.println("Done!");
//
//    }
////        Конец Примера 1 ККККККККККККККК








}