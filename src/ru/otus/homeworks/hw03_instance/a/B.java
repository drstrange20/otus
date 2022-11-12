package ru.otus.homeworks.hw03_instance.a;

public class B {
    public static void main(String[] args) {

        A aB = new A();
        B b = new B();

        aB.defaultInt = 1; // Доступен в этом пакете
        aB.setPrivateInt(1); // к геттерам и сеттерам private variable есть доступ отовсюду
        System.out.println(aB.getPrivateInt());
        aB.publicInt = 1; // Доступна везде
        aB.protectedInt = 1; // protected variable класса А доступна только в этом пакете

        aB.defaultPlay();
        aB.protectedPlay();
        aB.publicPlay();

        //объект b не имеет ничего, потому что у него нет собственных переменных и методов, и он не наследуется от А.


    }
}
