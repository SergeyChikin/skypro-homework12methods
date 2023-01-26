import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year;
        year = 2024;
        checkingTheYear(year);

    }
    public static void checkingTheYear(int year) {
        if ((year % 100 != 0) && (year % 4 == 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS;
        clientOS = 1;
        int clientDeviceYear;
        clientDeviceYear = LocalDate.now().getYear();
        checkingDevice(clientOS,clientDeviceYear);
    }
    public static void checkingDevice(byte clientOS, int clientDeviceYear ) {
        if ( clientOS == 0 && clientDeviceYear >= 2015 && clientDeviceYear <= 2023 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ( clientOS == 0 && clientDeviceYear < 2015 && clientDeviceYear >= 2011 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (  clientOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear <= 2023 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ( clientOS == 1 && clientDeviceYear < 2015 && clientDeviceYear >= 2011 ){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите корректную дату выпуска смартфона.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        countingDeliveryDays(deliveryDistance);
    }

    public static void countingDeliveryDays(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней : " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней : " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней : " + deliveryTime);
        } else {
            System.out.println("Доставки нет ");
        }
    }




}