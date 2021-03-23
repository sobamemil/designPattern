package prototype.pattern.demo;
import car.*;

public class PrototypePatternEx {
    public static void main(String args[]) throws CloneNotSupportedException {
        System.out.println("**Prototype Pattern Demo**\n");
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;
        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;

        BasicCar bc1;
        bc1 = nano_base.clone();
        bc1.price = nano_base.price + BasicCar.setPrice();
        System.out.println("Car is : " + bc1.modelname + " and it's price is Rs." + bc1.price);

        bc1 = ford_basic.clone();
        bc1.price = ford_basic.price + BasicCar.setPrice();
        System.out.println("Car is : " + bc1.modelname + " and it's price is Rs." + bc1.price);
    }
}
