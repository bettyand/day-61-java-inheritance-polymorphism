public class Polymorphism {
    public static void main(String[] args) throws Exception {
        // Herds
        System.out.println("---Herds---");
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

        System.out.println("---");
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        // Animals
        System.out.println("---Animals---");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        Dog fido = new Dog("Fido");
        fido.bark();

        System.out.println("---");
        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        Cat garfield = new Cat("Garfield");
        garfield.purr();

        System.out.println("---");
        NoiseCapable dog2 = new Dog();
        dog2.makeNoise();
        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();
        Cat c = (Cat) cat2;
        c.purr();
    }
}
