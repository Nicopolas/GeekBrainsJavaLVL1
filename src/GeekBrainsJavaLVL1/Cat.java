package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 20.12.2018.
 */
public class Cat extends Animal {

    public Cat() {
        super(200, 0, 2);
    }

    public Cat(double runRestrictions, double swimRestrictions, double jumpRestrictions) {
        super(runRestrictions, swimRestrictions, jumpRestrictions);
    }

    @Override
    public void toRun(double length) {
        super.toRun(length);
    }

    @Override
    public void toSwim(double length) {
        super.toSwim(length);
    }

    @Override
    public void toJump(double height) {
        super.toJump(height);
    }
}
