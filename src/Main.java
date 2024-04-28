public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        int year = 1900;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        }

        int deliveryDistance = 65;
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else{
            if (deliveryDistance > 20) {
                deliveryDistance++;
            }
            if (deliveryDistance > 60) {
                deliveryDistance++;
            }
            System.out.println("Потребуется дней " + deliveryDistance);
        }




        int monthNumber = 2;
        switch (monthNumber) {
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 ->System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
            default -> System.out.println("Номер месяца больше 12..");
        }
    }
}