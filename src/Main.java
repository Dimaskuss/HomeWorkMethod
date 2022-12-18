import java.time.LocalDate;

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
        int currentYear = LocalDate.now().getYear();
        if (oS == 1) {
            if (i < currentYear) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }
        } else if (i < currentYear) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }

    }


    public static int foundDeliveryDistance(int i) {

        int deliveryDay = 0;
        if (i > 0) {
            deliveryDay++;
        }
        if (i > 20) {
            deliveryDay++;
        }
        if (i > 60) {
            deliveryDay++;
        }
        if (i > 100) {
            deliveryDay = 0;

        }

        return deliveryDay;
    }

    public static void main(String[] args) {

        System.out.println("\nЗадача_1");

        int year = 2005;

        checkLeapYear(year);
//===========================================================
        System.out.println("\nЗадача_2");

        int clientDeviceYear = 2022;
        int clientOS = 0;

        lernInstallVersion(clientDeviceYear, clientOS);
//===========================================================
        System.out.println("\nЗадача_3");

        int deliveryDistance = 66;

        if (foundDeliveryDistance(deliveryDistance) > 0) {
            System.out.println("количество дней на доставку : " + foundDeliveryDistance(deliveryDistance));
        } else {
            System.out.println("количество дней на доставку : нет доставки (");
        }
    }

}








