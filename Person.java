import java.util.ArrayList;
import java.lang.Comparable;

public class Person implements Measurable, Comparable {
    private String first;
    private String last;
    private int age;

    public Person (String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public double getMeasure() {
        return age;
    }

    public int compareTo(Object o) {
        int c1 = 0;
        if (o instanceof Person) {
            Person p = (Person) o;
            c1 = first.compareTo(p.first);
            return c1;
        }
        return c1;
    }

    public String toString() {
        String s = "";
        s = first + "," + last + "," + age;
        return s;
    }
}
