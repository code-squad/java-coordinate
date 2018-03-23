package example.starbucks;

public class Tea extends Beverage {

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
        System.out.println("티백을 담근다.");
    }

    @Override
    public void addAdditives(Additives additives) {
        /* 자기만의 레시피 */
    }
}
