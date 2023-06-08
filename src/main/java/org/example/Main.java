package org.example;

public class Main {
    public static void main(String[] args) {
        SalesManager Manager1 = new SalesManager(new int[]{150, 200, 30, 50, 450});
        SalesManager Manager2 = new SalesManager(new int[]{50, 500, 20, 100, 380});
        SalesManager Manager3 = new SalesManager(new int[]{250, 20, 150, 300, 15});
        System.out.println("Самая большая продажа за месяц по всем менеджерам отдела (в тыс.руб.): ");
        System.out.println("Менеджер 1 : " + Manager1.max());
        System.out.println("Менеджер 2 : " + Manager2.max());
        System.out.println("Менеджер 3 : " + Manager3.max());

        System.out.println("Самая минимальная продажа за месяц по всем менеджерам отдела (в тыс.руб.): ");
        System.out.println("Менеджер 1 : " + Manager1.min());
        System.out.println("Менеджер 2 : " + Manager2.min());
        System.out.println("Менеджер 3 : " + Manager3.min());

        System.out.println("Средняя продажа за месяц по всем менеджерам отдела (в тыс.руб.): ");
        System.out.println("Менеджер 1 : " + Manager1.average());
        System.out.println("Менеджер 2 : " + Manager2.average());
        System.out.println("Менеджер 3 : " + Manager3.average());

    }
}
