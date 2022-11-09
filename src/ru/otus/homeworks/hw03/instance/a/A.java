package ru.otus.homeworks.hw03.instance.a;

public class A {
    int defaultInt;
    public int publicInt;
    private int privateInt;
    protected int protectedInt;

    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }

    public int getPrivateInt() {
        return privateInt;
    }


    void defaultPlay() {
        System.out.println(123);
    }

    public void publicPlay() {
        System.out.println(123);
    }

    protected void protectedPlay() {
        System.out.println(123);
    }

    private void privatePlay() {
        System.out.println(123);
    }

}