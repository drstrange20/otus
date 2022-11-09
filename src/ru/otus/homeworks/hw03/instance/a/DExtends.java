package ru.otus.homeworks.hw03.instance.a;

public class DExtends extends A{
    public static void main(String[] args) {

        A aD = new A();
        DExtends dExtendsA = new DExtends();

        aD.defaultInt = 1;
        aD.publicInt = 1;
        aD.protectedInt = 1;
        aD.setPrivateInt(1);
        System.out.println(aD.getPrivateInt());

        aD.defaultPlay();
        aD.publicPlay();
        aD.protectedPlay();

        dExtendsA.defaultInt = 1; // подкласс имеет все теже самые приоритеты в этом пакете
        dExtendsA.protectedInt = 1;
        dExtendsA.setPrivateInt(2);
        System.out.println(dExtendsA.getPrivateInt());
        dExtendsA.publicInt = 1;

        dExtendsA.defaultPlay();
        dExtendsA.publicPlay();
        dExtendsA.protectedPlay();
    }
}
