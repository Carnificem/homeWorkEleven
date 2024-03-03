import java.time.LocalDate;
public class Main {
    //задача 1
    public static void definesTheYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год- высокосный год");
        } else {
            System.out.println(year + " год-невысокосный год");
        }
    }

    //задача 2
    public static void checkingPhoneYear(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear >= clientDeviceYear && clientOS == 1) {
            System.out.print("Вам подойдет версия приложения для android");
        }
        if (clientDeviceYear <clientDeviceYear && clientOS == 1) {
            System.out.println("Вам подойдет облегченная версия для android");
        }
        if (clientDeviceYear >= clientDeviceYear && clientOS == 0) {
            System.out.println("Вам подойдет версия для IoS");
        }
        if (clientDeviceYear < clientDeviceYear && clientOS == 0) {
            System.out.println("Вам подойдет облегченная версия для IoS");
        }
    }

    //Задача 3
    public static int calculatesDeliveryTime(int diliveryDistance) {
        int day = 0;
        if (diliveryDistance <= 20) {
            day++;
        } else if (diliveryDistance <= 60) {
            day = day + 2;
        } else if (diliveryDistance <= 100) {
            day = day + 3;
        }
        return day;
    }

    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");
        int year = 2029;
        definesTheYear(year);
        //задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = LocalDate.now().getYear();
        int clientOS = 1;
        checkingPhoneYear(clientDeviceYear, clientOS);
        System.out.println();
        //задача 3
        System.out.println("Задача 3");
        int diliveryDistance = 45;
        int diliveryTime = calculatesDeliveryTime(diliveryDistance);
        if (diliveryTime != 0) {
            System.out.println("Потребуется дней для доставки " + diliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
}











