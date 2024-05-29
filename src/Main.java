import java.time.LocalDate;

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
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Нет доставки");
        }
        else if (deliveryDays != 0){
            System.out.println("Доставка займет " + deliveryDays  + " дня");
        }
    }



    public static void checkLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOsAndYear(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && currentYear < 2024) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && currentYear == 2024) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && currentYear == 2024) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректные данные: такая система не поддерживается");
        }
    }


        public static int calculateDeliveryDays ( int deliveryDistance){
            int deliveryTime = 1;

            if (deliveryDistance > 20) {
                deliveryTime++;
            }
            if (deliveryDistance > 60) {
                deliveryTime++;
            }
            if (deliveryDistance > 100) {
                return 0;
            } else {
                return deliveryTime;
            }
        }

    }
