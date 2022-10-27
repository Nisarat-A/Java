public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(3);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("firstname = " + person.getFirstName());
        System.out.println("lastname = " + person.getLastName());
        System.out.println("age = " + person.getAge() );
        System.out.println("Is teenager? " + person.isTeen());
        person.setAge(15);
        System.out.println("Is teenager? " + person.isTeen());


    }
}