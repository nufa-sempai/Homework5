public class Main {
    public static void main(String[] args) {
        hw5 ();
    }
    public static void hw5 () {
//Задание 1
        System.out.println("Task 1");
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//Задание 2
        System.out.println("\nTask 2");
        int clientOs2 = 0;
        int manufacturingYear = 2015;
        if (clientOs2 == 0 && manufacturingYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs2 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs2 == 1 && manufacturingYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs2 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
//Задание 3
        System.out.println("\nTask 3");
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
//Задание 4
        System.out.println("\nTask 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance < 60){
            deliveryDays = 2;
        } else if (deliveryDistance < 100){
            deliveryDays = 3;
        }

        if (deliveryDays == 0) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
//Задание 5
        System.out.println("\nTask 5");
        int month = 12;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}