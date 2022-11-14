package ru.otus.homeworks.hw05_map;

import java.util.Objects;

public class Client {
    private final String fullName;
    private int birthDate;

    public Client(String fullName, int birthDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return fullName;
    }
    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (birthDate != client.birthDate) return false;
        return Objects.equals(fullName, client.fullName);
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + birthDate;
        return result;
    }

    @Override
    public String toString() {

        return fullName;
    }
}