public class Main {
    //задача 1
    public static int checkingYearLeap(int year) {
        // int year = 2024;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год- высокосный год");
        } else {
            System.out.println(year + " год-невысокосный год");
        }
       return year;
    }
    //задача 2

    public static void checkingPhoneYear(int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            System.out.print("Вам подойдет версия приложения");
        } else {
            System.out.print("вам подойдет облегченная версия приложения");
        }
    }

    public static void checkingClientOS(int clientOS) {
        if (clientOS == 0) {
            System.out.print(" для IoS");
        }
        if (clientOS == 1) {
            System.out.print(" для android");
        }
    }
//Задача 3
    public static void dileviryCalculation(int diliveryDistance) {
        if ((diliveryDistance > 0) && (diliveryDistance <= 20)) {
            System.out.println("потребуется один день на доставку ");
        }
        if ((diliveryDistance > 20) && (diliveryDistance <= 60)) {
            System.out.println("на доставку потребуется два дня");
        }
        if ((diliveryDistance > 60) && (diliveryDistance <= 100)) {
            System.out.println("на доставку потребуется три дня");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");
        int year = 2029;
        checkingYearLeap(year);
        //задача 2

        System.out.println("Задача 2");
        int clientDeviceYear = 2020;
        int clientOS = 0;
        checkingPhoneYear(clientDeviceYear);
        checkingClientOS(clientOS);
        System.out.println();
        //задача 3
        System.out.println("Задача 3");
        int diliveryDistance = 130;
        dileviryCalculation(diliveryDistance);
    }
}









