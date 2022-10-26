package com.example.homework11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task_2 {
    public static void main(String[] args) {

        ArrayList<AdultNew> arrayList = new ArrayList<>();
        arrayList.add(new AdultNew(19, "Talya", 178));
        arrayList.add(new AdultNew(45, "Yuri", 180));
        arrayList.add(new AdultNew(37, "Sasha", 165));
        arrayList.add(new AdultNew(22, "Ola", 159));
        Stream stream = arrayList.stream()
                .skip(1)
                .limit(2)
                .sorted(Comparator.comparing(AdultNew::getAgeAdult))
                .skip(1);
        System.out.println(stream.collect(Collectors.toList()));
    }
}

class AdultNew {
    private int ageAdult;
    String nameAdult;
    int heightAdult;

    public AdultNew(int ageAdult, String nameAdult, int heightAdult) {
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

    @Override
    public String toString() {
        return "AdultNew{" +
                "ageAdult=" + ageAdult +
                ", nameAdult='" + nameAdult + '\'' +
                ", heightAdult=" + heightAdult +
                '}';
    }
}

