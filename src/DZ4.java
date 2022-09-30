public class DZ4 {public static void main(String[] args){
    System.out.println("Задание 1");
    int clientOS = 0;
    if (clientOS == 0){
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    System.out.println("Задание 2");
    int clientDeviceYear = 2016;
    int clientOs = 0;
    if (clientDeviceYear >= 2015 && clientOs == 0){
        System.out.println("Установите версию приложения для iOS по ссылке");
    }else if (clientDeviceYear < 2015 && clientOs ==0){
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientDeviceYear >=2015 && clientOs == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else if (clientDeviceYear<2015 && clientOs == 1) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    System.out.println("Задание 3");
    int year = 2100;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        System.out.println("Високосный год");
    }else {System.out.println("Не Високосный год");}

    System.out.println("Задание 4");
    int eliveryDistance = 95;
    int day = 1;
    if (eliveryDistance>20){
        day++;
    }
    if (eliveryDistance>60){
        day++;
    }
    System.out.println("Потребуется дней: "+day);

    System.out.println("Задание 5");
    int monthNumber = 12;
    switch (monthNumber){
        case 12:
        case 1:
        case 2:
            System.out.println("Месяц зимы");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Месяц весны");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Месяц Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Месяц Осени");
            break;
        default:
            System.out.println("Такого месяца не существует");
    }

}
}
