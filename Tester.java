import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Bob", "Boberson", 53);
        people[1] = new Person ("Robert", "Robertson", 41);
        people[2] = new Person ("John", "Johnson", 32);

        Person agetest = Data.smallestAge(people);
        System.out.println("Smallest age " + agetest.getMeasure());

        Arrays.sort(people);
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
