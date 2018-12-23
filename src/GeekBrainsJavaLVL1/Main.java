package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 09.12.2018.
 */
public class Main {
    public static void main(String[] args) {
        Cat[] arrCat = {new Cat("Barsik", 5),
                        new Cat("Vaska", 10),
                        new Cat("Lucky", 10),
                        new Cat("Kot", 10),
                        new Cat("Jora", 100),};
        Plate plate = new Plate(100);

        for (Cat cat : arrCat) {
            cat.eat(plate);
            cat.info();
        }
    }
}
