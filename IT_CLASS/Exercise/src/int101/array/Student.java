package int101.array ;

import java.util.Random;

public class Student {
    private  int id;
    private static   String name;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Student(String name) {
        this.name = name;
        this.id = (new Random()).nextInt(10);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
