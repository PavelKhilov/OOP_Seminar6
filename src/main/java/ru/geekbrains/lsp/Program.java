package ru.geekbrains.lsp;

public class Program {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();

        Penguin penguin1 = new Penguin();

        processFly(bird1);
        processFly(bird2);
        processFly(bird3);

        processFly(duck1);
        processFly(duck2);
        processFly(duck3);

        processFly(penguin1);
    }

    public static void processFly(Bird bird){
        try {
            bird.fly();
        } catch (Exception e){
            System.out.println("Птице не удалось полетать.");
        }


    }
}
