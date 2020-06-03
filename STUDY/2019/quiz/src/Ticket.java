public class Ticket {

    private int number;
    private Concert concert;

    public Ticket(int number, Concert concert) throws InvalidTicket{
        this.number = number;
        this.concert = concert;
        if(number <= 0)
            throw new InvalidTicket();
    }

    public int getNumber(){
        return number;
    }

    public Concert getConcert() {
        return concert;
    }
}
