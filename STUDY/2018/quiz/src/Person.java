import java.util.Objects;

public abstract class Person implements Comparable{

    private String name;
    private int age;

    public Person(String name){
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
