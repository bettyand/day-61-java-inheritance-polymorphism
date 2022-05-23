import java.util.ArrayList;

public class Inheritance {
    public static void main(String[] args) throws Exception {
        // ABC
        System.out.println("---ABC---");
        C c = new C();
        c.a();
        c.b();
        c.c();

        System.out.println();

        // Person and subclasses
        System.out.println("---Person and subclasses---");
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

        System.out.println();

        // Warehousing
        System.out.println("---Warehousing---");
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        juice.printAnalysis();

        System.out.println();

        // DifferentKindsOfBoxes
        System.out.println("---Boxes---");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        System.out.println("---");
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        System.out.println("---");
        MisplacingBox box2 = new MisplacingBox();
        box2.add(new Item("Saludo", 5));
        box2.add(new Item("Pirkka", 5));

        System.out.println(box2.isInBox(new Item("Saludo")));
        System.out.println(box2.isInBox(new Item("Pirkka")));
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
