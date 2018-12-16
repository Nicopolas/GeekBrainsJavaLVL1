package GeekBrainsJavaLVL1;

/**
 * Created by 1 on 09.12.2018.
 */
public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Engineer", "petrov@mailbox.com", "890912312", 30000, 44);
        persArray[2] = new Person("Sidorov Sergei", "Engineer", "sidorov@mailbox.com", "890312312", 30000, 41);
        persArray[3] = new Person("Smirnov Ivan", "Engineer", "smirnov@mailbox.com", "898512312", 30000, 29);
        persArray[4] = new Person("Volkov Vladimir", "Engineer", "volkov@mailbox.com", "890712312", 30000, 25);

        for (Person person : persArray) {
            if (person.getAge() > 40) {
                person.displaysInformation();
            }
        }
    }
}
