public class Main {

    public static void checkLeapYear(int injectedYear) {
        boolean leapYear = injectedYear % 4 == 0 && injectedYear % 100 != 0 || injectedYear % 400 == 0;
        if (leapYear) {
            System.out.println("Год: " + injectedYear + " - високосный !!");

        } else {
            System.out.println("Год: " + injectedYear + " - не високосный !!");
        }

    }

    public static void lernInstallVersion(int i, int oS) {
        if (oS == 1) {
            if (i < 2015) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }
        } else if (i < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }

    }


    public static String foundDeliveryDistance(int i) {

        String deliveryDay = "опапа!! - введи корректное значение =Ъ";
        if (i > 0 && i <= 20) {
            deliveryDay = "1 ;)";
        }
        if (i > 20 && i <= 60) {
            deliveryDay = "2 ;)";
        }
        if (i > 60 && i <= 100) {
            deliveryDay = "3 ;)";
        }
        if (i > 100) {
            deliveryDay = "не доставляем =((";
        }
        return deliveryDay;
    }

    public static void main(String[] args) {

        System.out.println("\nЗадача_1");

        int year = 2005;

        checkLeapYear(year);
//===========================================================
        System.out.println("\nЗадача_2");

        int clientDeviceYear = 2017;
        int clientOS = 0;

        lernInstallVersion(clientDeviceYear, clientOS);
//===========================================================
        System.out.println("\nЗадача_3");

        int deliveryDistance = -223;

        System.out.println("количество дней на доставку : " + foundDeliveryDistance(deliveryDistance));

    }

}








