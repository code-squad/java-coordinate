package example.starbucks;

public class Coffee extends Beverage {

    @Override
    public void makeBeverage() {
        /* 자기만의 레시피 추가될 수 있음 */
        boliWater();
        brew();
        pourIntoCup();
        addAdditives(null);
    }

    @Override
    public void brew() {
        System.out.println("커피를 내리다");
    }

    @Override
    public void addAdditives(Additives additives) {
        /* 자기만의 레시피 */
    }
}
