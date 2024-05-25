public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask 1");
        int year = 2021;
        checkLeapYear (year);

        System.out.println("\nTask 2");
        int clientDeviceYear = 2024;
        checkOsAndYear(1, clientDeviceYear);

        System.out.println("\nTask 3");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        checkDeliveryDistanceAndDays(deliveryDistance, deliveryDays);
    }

    public static void checkLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOsAndYear(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void checkDeliveryDistanceAndDays (int deliveryDistance, int deliveryDays) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays);}
        else if (deliveryDistance >= 60 && deliveryDistance <= 100 ) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);}
        else {
            System.out.println("Расстояние слишком большое, доставки нет");
        }
    }

}