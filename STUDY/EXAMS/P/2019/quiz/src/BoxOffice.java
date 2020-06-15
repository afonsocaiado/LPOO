import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    static List<Ticket> totalTickets = new ArrayList<>();

    public BoxOffice(){}

    public static int getTotalTicketsFromConcert(Concert concert){
        int total = 0;

        for(Ticket ticket : totalTickets){
            if(ticket.getConcert().equals(concert))
                total++;
        }

        return total;
    }

    public static List<Ticket> buy(Concert concert, int numberOfTickets) throws InvalidTicket{
        List<Ticket> tickets = new ArrayList<>();

        int total = getTotalTicketsFromConcert(concert);

        for(int i = 1; i <= numberOfTickets; i++){
            Ticket ticket = new Ticket(total+i, concert);
            totalTickets.add(ticket);
            tickets.add(ticket);
        }

        return tickets;
    }
}
