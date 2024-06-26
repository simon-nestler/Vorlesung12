import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import de.thi.riener.Person;

public class App {
    public static void main(String[] args) {
        castException();
    }

    public static void castException() {
        Object s = "abc";
        Integer i = (Integer) s;
    }

    public static void exkursIfElseReihenfolge(int zahl) {
        if (zahl <= 10) {
            System.out.println("Zahl ist kleiner als 10");
        } else if (zahl <= 20) {
            System.out.println("Zahl ist zwischen 11 und 20");
        } else if (zahl <= 30) {
            System.out.println("Zahl ist zwischen 21 und 30");
        }
    }

    public static int methodeWirftMehrereExceptions() {
        try {
            // getJFrame().setSize(400, 300);

            int a = 100;
            int b = 0;
            // int c = a / b;
            return a;
        } catch (ArithmeticException e) {
            System.err.println("Division durch 0 ist nicht erlaubt");
        } catch (NullPointerException e) {
            System.err.println("JFrame ist null");
        } catch (Exception e) {
            System.err.println("Ein Fehler ist aufgetreten");
        } finally {
            System.out.println("Finally-Block wird immer ausgeführt");
            return -3;
            // Gut geeignet zum Freigeben von Ressourcen
        }

        // System.out.println("Wird dieser Code nicht auch immer ausgeführt?");
        // Sortierung der Exceptions ist wichtig
        // Von spezifisch zu allgemein
    }

    public static JFrame getJFrame() {
        return null;
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

    public static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
