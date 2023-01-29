public class Person {
    String name;
    int age;
    long personalNumber;
    boolean isWoman;
    double weight;
    Person friend;

    /**
     * Създаваме метод eat
     */
    void eat() {
        System.out.println("Eating...");
    }

    /**
     * Създаваме метод walk
     */
    void walk() {
        System.out.println(name + " is walking");
    }

    /**
     * Създаваме метод grow up
     */
    void growUp() {
        age++;
    }

    /**
     * Създаваме метод drink water
     */
    void drinkWater(double liters) {
        if(liters > 1) {
            System.out.println("This is too much water!!!");
        } else {
            System.out.println(name + " is drinking " + liters + " water.");
        }
    }
}
