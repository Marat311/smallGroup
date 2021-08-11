public class Dog {

    public String name,breed, color, size;
    public int age;

    public static int numberOfLegs, numberOfEyes;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String breed){
        this(name);
        this.breed= breed;
    }
}
