package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 20.12.2018.
 */
public class Dog extends Animal {

    public Dog() {
        super(500, 10, 0.5);
    }

    public Dog(double runRestrictions, double swimRestrictions, double jumpRestrictions) {
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
