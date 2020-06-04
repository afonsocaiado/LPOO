public class User extends Person{

    private String username;

    public User(String name){
        super(name);
    }

    public User(String name, int age){
        super(name, age);
        username = name + age;
    }

    public String getUsername() {
        return username;
    }
}
