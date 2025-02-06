package Lessons_2;

class B {
    public void printFields() {
        A a = new A();


        System.out.println("Public: " + a.publicField);
        System.out.println("Protected: " + a.protectedField);
        System.out.println("Default: " + a.defaultField);

        System.out.println("Private: " + a.getPrivateField());
    }
}
