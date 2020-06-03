public class Attendee extends Person {

    private boolean paid = false;

    public Attendee(String name){
        super(name);
    }

    public Attendee(String name, int age){
        super(name, age);
    }

    public boolean hasPaid(){
        return paid;
    }

    @Override
    public String toString() {
        return "Attendee " + this.getName() + (paid ? " has" : " hasn't") + " paid its registration.";
    }
}
