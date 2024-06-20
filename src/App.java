import de.thi.riener.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Max Mustermann");
        Person p2 = p.getPerson();

        try {
            System.out.println(p2.getName());
        } catch (NullPointerException e) {
            System.err.println("Person is null");
        }
    }
}
