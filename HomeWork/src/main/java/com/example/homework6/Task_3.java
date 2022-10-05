package com.example.homework6;

public class Task_3 {
    public static void main(String[] args) {
        Moving movement = new Moving(new FireEngine());
        movement.movingFireEngine();
    }
}
class FireEngine implements ISpinWheels{
    @Override
    public void spinTheWheels() {
        System.out.println("The wheels are spinning");
    }
}
class Moving{
    ISpinWheels iSpinWheels;
    public Moving(ISpinWheels action){
        this.iSpinWheels = action;
    }
    void movingFireEngine(){
        iSpinWheels.spinTheWheels();
}
}
interface ISpinWheels {
    void spinTheWheels();
}
