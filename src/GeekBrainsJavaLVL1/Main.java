package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 09.12.2018.
 */
public class Main {

    public static void main(String[] args) {
        Animal ordinaryCat = new Cat();
        Animal ordinaryDog = new Dog();
        Animal unusualCat = new Cat(300, 0 ,3);
        Animal unusualDog = new Dog(600, 20, 1);

        System.out.println("ordinaryDog toRun(600)");
        ordinaryDog.toRun(600);
        System.out.println("unusualDog toRun(600)");
        unusualDog.toRun(600);

        System.out.println("ordinaryCat toJump(3)");
        ordinaryCat.toJump(3);
        System.out.println("unusualCat toJump(3)");
        unusualCat.toJump(3);
    }
}
