package com.brightology.peertopeerbankingapp.domain.model;

import java.util.Objects;

public final class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String ocupation;

    public User(String firstName, String lastName, int age, String ocupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ocupation = ocupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getOcupation() {
        return ocupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(ocupation, user.ocupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, ocupation);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", ocupation='" + ocupation + '\'' +
                '}';
    }
}
