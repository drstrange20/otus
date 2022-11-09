package ru.otus.homeworks.hw03.instance.b;
import ru.otus.homeworks.hw03.instance.a.A;

public class CExtends extends A {
    public static void main(String[] args) {

        A aC = new A();
        CExtends cExtends = new CExtends();

        aC.publicInt = 1;
        aC.setPrivateInt(1);
        System.out.println(aC.getPrivateInt());

        aC.publicPlay();


        cExtends.protectedInt = 1;
        cExtends.publicInt = 1;
        cExtends.setPrivateInt(1);
        System.out.println(cExtends.getPrivateInt());

        cExtends.publicPlay();
        cExtends.protectedPlay();
    }
}
