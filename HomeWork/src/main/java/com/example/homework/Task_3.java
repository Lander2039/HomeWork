package com.example.homework;

public class Task_3 {
    public static void main(String[] args) {
    pigeon pigeon = new pigeon();
    crow crow = new crow();
    pigeon.fly();
    crow.fly();
    }
}
 abstract class birt{
    abstract void fly();
}
class pigeon extends birt{
    void fly(){
        System.out.println("fly");
    }
}
class crow extends birt{
    void fly(){
        System.out.println("and fly");
    }
}

