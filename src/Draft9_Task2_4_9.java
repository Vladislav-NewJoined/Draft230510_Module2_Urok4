import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Видеоурок здесь : https://lms.synergy.ru/learning/view/68495/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Задания здесь : https://lms.synergy.ru/learning/view/68557/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

public class Draft9_Task2_4_9 {
    //        System.out.println("Задание: \n9.\tПользователь вводит цифру. Если она от 0 до 6 - пусть вводит еще. " +
    //                "Если 9 - конец. Если 7,8 - пусть вводит строки до тех пор, пока не введет «стоп» (на этом все).\n\nРешение: ");

    //        Пример 4 ППППППППППППППППППППППППППППППППППП УДАЛСЯ ОКОНЧАТЕЛЬНО !!!!!!!!!!!!!!!!!! удаляем ошибку при неправильном вводе
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number x from 0 to 9: ");


        try {


            int x = scanner.nextInt();

            while (x >= 0 && x <= 9) {
                while (x >= 0 && x <= 6) {
                    System.out.print("Enter next number x from 0 to 9: ");
                    x = scanner.nextInt();

                }
                break;

            }

            while (x == 9) {
                break;
            }

            while (x >= 7 && x <= 8) {
                System.out.print("Enter text in string, until entering 'стоп': ");
                Scanner scanner2 = new Scanner(System.in);
                String str_If_7_Or_8 = scanner2.nextLine();
                while (!str_If_7_Or_8.equals("стоп")) {
                    System.out.print("Enter next text in string, until entering 'стоп': ");
                    Scanner scanner3 = new Scanner(System.in);
                    str_If_7_Or_8 = scanner3.nextLine();
                }
                break;

            }


//            while (!str_If_7_Or_8.equals("стоп")) {
//                System.out.print("Enter text in string, until entering 'стоп': ");
//                str_If_7_Or_8 = scanner.nextLine();
//
//            /*while (!str_If_7_Or_8.equals("стоп")) {
//                System.out.print("Enter next text in string, until entering 'стоп': ");
//                str_If_7_Or_8 = scanner.nextLine();
//            }
//
//            break;*/
//
//
//                /*break;*/
//                /*System.out.println("Input error.");*/
//            }
        } catch (InputMismatchException e) {
            System.out.println("Input incorrect.");

        }
        System.out.println("The program is over.");
    }
//        Конец Примера 4 ККККККККККККККК






//    //        Пример 3 ППППППППППППППППППППППППППППППППППП УДАЛСЯ!!!!!!!!!!!!!!!!!! но с ошибкой при неправильном вводе
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number x from 0 to 9: ");
//        int x = scanner.nextInt();
//
//
//        while (x>=0 && x<=9) {
//            while (x>=0 && x<=6) {
//                System.out.print("Enter next number x from 0 to 9: ");
//                x = scanner.nextInt();
//
//            }
//            break;
//
//            }
//
//        while (x==9) {
//            break;
//            }
//
//        while (x>=7 && x<=8) {
//            System.out.print("Enter text in string, until entering 'стоп': ");
//            Scanner scanner2 = new Scanner(System.in);
//            String str_If_7_Or_8 = scanner2.nextLine();
//            while (!str_If_7_Or_8.equals("стоп")) {
//                System.out.print("Enter next text in string, until entering 'стоп': ");
//                Scanner scanner3 = new Scanner(System.in);
//                str_If_7_Or_8 = scanner3.nextLine();
//            }
//            break;
//
//        }
//
//
//
////            while (!str_If_7_Or_8.equals("стоп")) {
////                System.out.print("Enter text in string, until entering 'стоп': ");
////                str_If_7_Or_8 = scanner.nextLine();
////
////            /*while (!str_If_7_Or_8.equals("стоп")) {
////                System.out.print("Enter next text in string, until entering 'стоп': ");
////                str_If_7_Or_8 = scanner.nextLine();
////            }
////
////            break;*/
////
////
////                /*break;*/
////                /*System.out.println("Input error.");*/
////            }
//
//
//        System.out.println("The program is over.");
//    }
////        Конец Примера 3 ККККККККККККККК






//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter x from 0 to 9: ");
//        int x = scanner.nextInt();
////        System.out.print("Enter max: ");
////        int max = scanner.nextInt();
////        System.out.print("Enter step: ");
////        int step = scanner.nextInt();
//
//        System.out.println();
//
////        int  x2 = x;
////        while (x<=9) {
////            System.out.println(x);
////            x = x + 1;
////        }
//
//        System.out.println();
//
////        x = x2;
//        do {
//            System.out.print("Enter next x from 0 to 9: ");
//            x = scanner.nextInt();
//
//            /*System.out.println(x);
//            x = x + 1;*/
//        } while (x >= 0 && x <= 6);
//
//        do {
//            break;
//        } while (x == 9);
//
//        String strIf7Or8 = null;
//        do {
//            do {
//                System.out.print("Enter next x from 0 to 9: ");
//                String xstrIf7Or8 = scanner.nextLine();
//            } while (!strIf7Or8.equals("стоп"));
//        } while (x >= 7 && x <= 8);
//
//        System.out.println("Done!");
//    }
////        Конец Примера 2 ККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП из видеоурока мин 04.36
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter x: ");
//        int x = scanner.nextInt();
//        System.out.print("Enter max: ");
//        int max = scanner.nextInt();
//        System.out.print("Enter step: ");
//        int step = scanner.nextInt();
//
//        System.out.println();
//
//        int  x2 = x;
//        while (x<max) {
//            System.out.println(x);
//            x = x + step;
//        }
//
//        System.out.println();
//
//        x = x2;
//        do {
//            System.out.println(x);
//            x = x + step;
//        } while (x<max);
//
//        System.out.println("Done!");
//    }
////        Конец Примера 1 ККККККККККККККК






}


