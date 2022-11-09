package ru.otus.homeworks.hw03.instance.b;
import ru.otus.homeworks.hw03.instance.a.A;

public class E {
    public static void main(String[] args) {

        A aE = new A();
        E e = new E();

        aE.publicInt = 1;
        aE.setPrivateInt(3);
        System.out.println(aE.getPrivateInt());

        aE.publicPlay();
    }
}
