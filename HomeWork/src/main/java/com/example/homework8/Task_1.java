package com.example.homework8;

public class Task_1 {
    public static void main(String[] args) {
        Car audi = new Car("audi", 210, 12200);
        Car bmw = new Car("bmw", 200, 10597);
        Car mazda = new Car("mazda", 180, 9100);
        try {
            audi.startCar(0, 20);
        } catch (InvalidMinimumValue e) {
            System.out.println(e.getMessage2());
        } catch (InvalidMaximumValue e) {
            System.out.println(e.getMessage3());
        } catch (EvenNumber e) {
            System.out.println(e.getMessage());
        }
        try {
            bmw.startCar(0, 20);
        } catch (InvalidMinimumValue e) {
            System.out.println(e.getMessage2());
        } catch (InvalidMaximumValue e) {
            System.out.println(e.getMessage3());
        } catch (EvenNumber e) {
            System.out.println(e.getMessage());
        }
        try {
            mazda.startCar(0, 20);
        } catch (InvalidMinimumValue e) {
            System.out.println(e.getMessage2());
        } catch (InvalidMaximumValue e) {
            System.out.println(e.getMessage3());
        } catch (EvenNumber e) {
            System.out.println(e.getMessage());
        }

    }
}

class Car {
    private final String brand;
    private final int speed;
    private final int price;
    int minNumber;
    int maxNumber;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.price = price;
        this.speed = speed;
    }

    public void startCar(int minNumber, int maxNumber) throws EvenNumber, InvalidMinimumValue, InvalidMaximumValue {
        int d = (int) (Math.random() * (maxNumber) + minNumber);
        if (minNumber < 0) {
            throw new InvalidMinimumValue("Minimum value set incorrectly: " + minNumber);
        }
        if (maxNumber > 20) {
            throw new InvalidMaximumValue("Maximum value set incorrectly " + maxNumber);
        }
        if (d % 2 == 0) {
            System.out.println("The selected number is " + d);
            throw new EvenNumber("Unfortunately the " + brand + " didn't work(");
        } else {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
            System.out.println("The selected number is " + d);
            System.out.println("The " + brand + " started up!!! Maximum speed " + brand + " " + speed + ". Price " + price + ".");
        }
    }
}

class EvenNumber extends Exception {
    private final String message;

    public EvenNumber(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

class InvalidMinimumValue extends Exception {
    private final String message2;

    public InvalidMinimumValue(String message2) {
        this.message2 = message2;
    }

    public String getMessage2() {
        return message2;
    }
}

class InvalidMaximumValue extends Exception {
    private final String message3;


    public InvalidMaximumValue(String message3) {
        this.message3 = message3;
    }

    public String getMessage3() {
        return message3;
    }
}

