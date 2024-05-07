import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1.");

        int taskYear = 2024;                                                //переменная для проверки методом определения високосного года
        defineLeapYear(taskYear);                                           //вызов метода определения високосного года

        //Задача 2
        System.out.println("Задача 2.");

        int currentOsVersion = 1;                                           //переменная для определения OS телефона(iOS - 0, остальное - Android)
        int currentYear = 2014;                                             //переменная для проверки года выпуска телефона
        defineAppVersion(currentOsVersion, currentYear);                    //вызов метода определения версии приложения

        //Задача 3
        System.out.println("Задача 3.");

        int deliveryDistance =  95;
        if (defineDeliveryTime(deliveryDistance) == 0){                                         //метод возвращает 0, если расстояние превышает 100 км
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + defineDeliveryTime(deliveryDistance));    //метод возвращает кол-во дней, необходимых для доставки, в завимости от расстояния
        }

    }

    public static void defineLeapYear(int year){                                //метод определения високосного года
        if (year >= 1584){                                                      //до 1584 года не было понятия високосного года
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){      //високосный год - каждый четветрый год, но не сотый; также каждый четырехсотый год - високосный
                System.out.println(year + " год является високосным.");
            }else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("В " + year + " году не было понятия високосного года.");
        }
    }

    public static void defineAppVersion(int clientOS, int clientDeviceYear){    //метод определения версии приложения
        if(clientOS == 0){
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else{
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int defineDeliveryTime(int deliveryDistance){             //метод определения времени доставки
        if(deliveryDistance > 100){
            int deliveryTime = 0;
            return deliveryTime;
        }
        else {
            int deliveryTime = 1;
            if(deliveryDistance > 20 && deliveryDistance <= 60){
                deliveryTime += 1;
            }else if(deliveryDistance > 60 && deliveryDistance <= 100){
                deliveryTime += 2;
            }
            return deliveryTime;
        }
    }

}