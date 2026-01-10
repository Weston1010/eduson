package org.example.Group37.homework.lesson10.taskWithStar.v2;

import java.util.Objects;

public class User implements Cloneable {
    private String username;
    private String email;
    private int age;
    private Pet pet;
    private int id;

    public User(String username, String email, int age, Pet pet, int id) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.pet = pet;
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User clonedUser = (User) super.clone();
        clonedUser.setPet((Pet) pet.clone());
        return clonedUser;
    }
}
