package ru.geekbrains.lsp;

public class Penguin extends Bird{

    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать!");
    }
}
