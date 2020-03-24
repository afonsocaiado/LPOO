import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    static List<Ticket> totalTickets = new ArrayList<>();

    public BoxOffice(){

    }

    public static int getTotal(Concert concert){
        int tot = 0;
        for(Ticket ticket : totalTickets){
            if(ticket.getConcert().equals(concert)){
                tot++;
            }
        }
        return tot;
    }

    public static List<Ticket> buy(Concert concert, int numberOfTickets) throws InvalidTicket{

        List<Ticket> tickets = new ArrayList<>();

        int tot = getTotal(concert);

        for(int i = 1; i <= numberOfTickets; i++){
            Ticket t = new Ticket(i+tot,concert);
            totalTickets.add(t);
            tickets.add(t);
        }

        return tickets;

    }


}
