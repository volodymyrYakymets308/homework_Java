package Lesson_1;
class Person {
    private String name; // Имя
    private int age;
    private final int id;
    public static int totalPersons = 0;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = Math.max(age, 0);
        this.id = id;
        totalPersons++;
    }

    public Person() {
        this("Unknown", 18, generateId());
    }

    private static int generateId() {
        return 1000 + totalPersons; // Пример генерации ID (не 100% уникально, но лучше, чем фиксированное значение)
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }
    public int getId() {
        return id;
    }
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
    }

    public static void printTotalPersons() {
        System.out.println("Total persons created: " + totalPersons);
    }

    public boolean isOlderThan(int age) {
        return this.age > age;
    }

    public final void displayGreeting() {
        System.out.println("Hey, I'm " + this.name + "!");
    }
}
