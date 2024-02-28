public class Main {
    //задача 1
    public static int definesTheYear(int year) {
        // int year = 2024;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год- высокосный год");
        } else {
            System.out.println(year + " год-невысокосный год");
        }
        return year;
    }
    //задача 2

    public static void checkingPhoneYear(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.print("Вам подойдет версия приложения для android");
        }
        if (clientDeviceYear <= 2014 && clientOS == 1) {
            System.out.println("Вам подойдет облегченная версия для android");
        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Вам подойдет версия для IoS");
        }
        if (clientDeviceYear <= 2014 && clientOS == 0) {
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

        // if ((diliveryDistance > 0) && (diliveryDistance <= 20)) {
        //     System.out.println("потребуется один день на доставку ");
        // }
        // if ((diliveryDistance > 20) && (diliveryDistance <= 60)) {
        //     System.out.println("на доставку потребуется два дня");
        // }
        // if ((diliveryDistance > 60) && (diliveryDistance <= 100)) {
        //     System.out.println("на доставку потребуется три дня");
        // } else {
        //     System.out.println("Доставка не осуществляется");
        // }
    }


    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");
        int year = 2029;
        definesTheYear(year);
        //задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2010;
        int clientOS = 0;
        checkingPhoneYear(clientDeviceYear, clientOS);
        //задача 3
        System.out.println("Задача 3");
        int diliveryDistance = 45;
        if (calculatesDeliveryTime(diliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки " + calculatesDeliveryTime(diliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
    }
}











