package com.example.homework11;

public class Task_1 {

    public static void main(String[] args) {

        Adult adult = new Adult(39, "Petya", 176);
        Child child = new Child(9, "Sasha", 112);

        Conversion<Adult, Child> converter = x -> new Child(x.getAgeAdult(), x.getHeightAdult());

        Child child1 = converter.conversion2(adult);

        System.out.println("Age: " + child1.age + " Name: " + child.name + " Height: " + child1.height);
    }
}

@FunctionalInterface
interface Conversion<T, R> {
    R conversion2(T t);

}

class Child {
    int age;
    String name;
    int height;

    public Child(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Child(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public int getHeight() {
        return height;
    }

}

class Adult {
    int ageAdult;
    String nameAdult;
    int heightAdult;
    String childAdult = "the child became an adult";

    public Adult(int ageAdult, String nameAdult, int heightAdult) {
        this.ageAdult = ageAdult;
        this.nameAdult = nameAdult;
        this.heightAdult = heightAdult;
    }

    public int getAgeAdult() {
        return ageAdult;
    }

    public String getNameAdult() {
        return nameAdult;
    }

    public int getHeightAdult() {
        return heightAdult;
    }

    public String getChildAdult() {
        return childAdult;
    }
}
