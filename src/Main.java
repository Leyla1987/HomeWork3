public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOs = 1;
        if (clientOs == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2

        int clientDevice = 0;
        int clientDeviceYear = 2010;

        if (clientDevice == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else {
            if (clientDevice == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            else { if (clientDevice == 1 && clientDeviceYear > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
                else
            System.out.println("Установите версию приложения для IOS по ссылке"); }
        }

        //Задание 3
        int year = 2024;
        if ((year % 4 == 0) && (year % 100 != 0))
            System.out.println(year + " год является високосным");
        else {
            if (year % 400 == 0)
                System.out.println(year + " год является високосным");
            else
                System.out.println(year + " год не является високосным");
        }


        //Задание 4
        int deliveryDistance = 61;
        int day=1;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + day);
        else {
            if (deliveryDistance > 20  && deliveryDistance <= 60)
                System.out.println("Потребуется дней: " + (2 * day));
            else System.out.println("Потребуется дней: " + (3 * day));
        }

        //Задание5

        int monthNumber = 4;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Холодная зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Теплая весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Жаркое лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Дождливая осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}





