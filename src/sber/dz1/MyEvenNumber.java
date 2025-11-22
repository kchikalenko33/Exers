package sber.dz1;
//Создать класс MyEvenNumber, который хранит четное число int n. Используя
//исключения, запретить создание инстанса MyPrimeNumber с нечетным числом.


import dz.try_catch.MyUncheckedException;

public class MyEvenNumber {
    private int n;

    public  MyEvenNumber(int n) {
        if (n % 2 != 0) {
            throw new MyUncheckedException();
        }
    }

    public static void main(String[] args) {
        MyEvenNumber my2 = new MyEvenNumber(0);
        MyEvenNumber my = new MyEvenNumber(3);
    }
}
