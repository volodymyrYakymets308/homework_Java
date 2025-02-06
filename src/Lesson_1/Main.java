package Lesson_1;
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Volodymyr", 27, 101);
        Person p2 = new Person("Alex", 35, 202);
        Person p3 = new Person();

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println(p1.getName() + " older than 25? " + p1.isOlderThan(25));
        System.out.println(p2.getName() + " older than 40? " + p2.isOlderThan(40));

        Person.printTotalPersons();

        p1.displayGreeting();
        p2.displayGreeting();
        p3.displayGreeting();
    }
}
