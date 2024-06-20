import de.thi.riener.Person;

public class App {
    public static void main(String[] args) throws Exception {
        divisionDurchNull();
    }

    public static void divisionDurchNull() {
        int a = 100;
        int b = 0;

        if (b != 0) {
            System.out.println("Kann nicht schief gehen!");
            int c = a / b;
            System.out.println(c);
        } else {
            System.err.println("Division durch 0 ist nicht erlaubt");
        }

        System.out.println("----");

        try {
            System.out.println("Ich probiere es einfach mal...");
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println("Division durch 0 ist nicht erlaubt");
        }
    }

    public static void nullPointer() {
        Person p = new Person("Max Mustermann");
        Person p2 = p.getPerson();

        if (p2 != null) {
            System.out.println(p.getName());
            System.out.println(p2.getName());
        } else {
            System.err.println("Person is null");
        }

        System.out.println("----");

        try {
            System.out.println(p.getName());
            System.out.println(p2.getName());
        } catch (NullPointerException e) {
            System.err.println("Person is null");
        }
    }
}
