package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 23.12.2018.
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("In the plates too little food");
            return;
        }
        p.decreaseFood(appetite);
        satiety = true;
    }

    public void info() {
        System.out.println("Cat \""+name+"\" is full? " + satiety);
    }
}