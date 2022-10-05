package com.example.homework6;

public class Task_2 {
    public static void main(String[] args){
    }
}
abstract class Transport{
    abstract void drive();
    abstract void honk();
}
interface ITurnOnTheMotor{
    void turnOnTheMotor();
}
class Bike extends Transport {
    @Override
    void drive() {
    }
    @Override
    void honk() {
    }
}
class Car extends Transport implements ITurnOnTheMotor{
    @Override
    void drive() {
    }
    @Override
    void honk() {
    }
    @Override
    public void turnOnTheMotor() {
    }
}
class tractor extends Transport implements ITurnOnTheMotor{
    @Override
    void drive() {
    }
    @Override
    void honk() {
    }
    @Override
    public void turnOnTheMotor() {
    }
}
