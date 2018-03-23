package example.starbucks;

public abstract class Beverage {

    public abstract void makeBeverage();

    public void boliWater() {
        System.out.println("물 끓이기");
    }

    public abstract void brew();

    public void pourIntoCup() {
        System.out.println("컵에 붓다");
    }

    public abstract void addAdditives(Additives additives);
}
