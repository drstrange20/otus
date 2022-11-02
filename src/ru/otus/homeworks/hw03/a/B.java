package ru.otus.homeworks.hw03.a;

public class B {
    public static void main(String[] args) {

        A aB = new A();
        B b = new B();

        aB.defaultInt = 1;
        aB.setPrivateInt(1);
        System.out.println(aB.getPrivateInt());
        aB.publicInt = 1;
        aB.protectedInt = 1;

        aB.defaultPlay();
        aB.protectedPlay();
        aB.publicPlay();




    }
}
