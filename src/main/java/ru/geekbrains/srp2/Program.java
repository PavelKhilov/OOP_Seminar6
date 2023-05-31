package ru.geekbrains.srp2;

public class Program {

    /**
     * TODO Домашняя работа (программа 1),
     * оптимизировать приложение в соответсвии с принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");
        Order order = new Order("", "", 0, 0);
        InputFromConsole input = new InputFromConsole(order);
        input.inputFromConsole(order);
        SaveToJson save = new SaveToJson(order);
        save.saveToJson();
    }
}
