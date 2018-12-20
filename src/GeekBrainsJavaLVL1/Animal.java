package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 20.12.2018.
 */
public class Animal {
    protected double runRestrictions;
    protected double swimRestrictions;
    protected double jumpRestrictions;

    public Animal(double runRestrictions, double swimRestrictions, double jumpRestrictions) {
        this.runRestrictions = runRestrictions;
        this.swimRestrictions = swimRestrictions;
        this.jumpRestrictions = jumpRestrictions;
    }

    public void toRun(double length) {
        System.out.println("run: " + (runRestrictions >= length));
    }

    public void toSwim(double length) {
        System.out.println("swim: " + (swimRestrictions >= length));
    }

    public void toJump(double height) {
        System.out.println("jump: " + (jumpRestrictions >= height));
    }
}
