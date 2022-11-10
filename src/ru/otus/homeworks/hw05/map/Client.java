package ru.otus.homeworks.hw05.map;

import java.util.Objects;

public class Client {
    final String fullName;
    private int age;

    public Client(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (age != client.age) return false;
        return Objects.equals(fullName, client.fullName);
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}