package com.example.homework;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class HomeWork5 {
    public static void main(String[] args){
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1.model);
        System.out.println(phone1.number);
        System.out.println(phone1.weight);

        System.out.println(phone2.model);
        System.out.println(phone2.number);
        System.out.println(phone2.weight);

        System.out.println(phone3.model);
        System.out.println(phone3.number);
        System.out.println(phone3.weight);

        phone1.receiveCall();
        phone1.getNumber();
        phone2.receiveCall();
        phone2.getNumber();
        phone3.receiveCall();
        phone3.getNumber();

        phone1.receiveCall("Sasha", "375441000000");
        phone2.receiveCall("Vasya", "375292000000");
        phone3.receiveCall("Volodya", "375333000000");
        phone1.sendMessage("37544444444");
        phone2.sendMessage("37555555555");
        phone3.sendMessage("37566666666");
    }
}
class Phone{
    String number = "375449999999";
    String model = "Honor 20";
    int weight = 150;

    void receiveCall(){
        String name = "Yura";
        System.out.println(name + " is calling");
    }
    void getNumber(){
        System.out.println(number);
    }
    void receiveCall(String name, String number){
        System.out.println(name + " calls the number "+ number);
    }
    void sendMessage(String number){
        System.out.println("A message will be sent to this phone number " +number);
    }

    public Phone(String number, String model, int weight){
        this(number,model);
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
    }


}
