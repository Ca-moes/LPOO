import java.util.ArrayList;
import java.util.List;

public class BoxOffice {
    private static ArrayList<Integer> ticketNumbers = new ArrayList<>();
    private static ArrayList<Concert> concertsList = new ArrayList<>();

    static List<Ticket> buy(Concert concert, int quantity) throws InvalidTicket {
        List<Ticket> tickets = new ArrayList<>();

        if (concertsList.isEmpty()){
            ticketNumbers.add(1);
            concertsList.add(concert);
            for (int i=0; i<quantity; i++){
                tickets.add(new Ticket(ticketNumbers.get(0), concert));
                ticketNumbers.set(0, ticketNumbers.get(0)+1);
            }
        }
        else{
            // encontra concert
                // se existir cria os tickets com o index
                // se não existir faz o de cima
            int index = -1;
            for (int i = 0; i<concertsList.size(); i++){
                if (concertsList.get(i).equals(concert)) index=i;
            }

            if (index == -1){
                ticketNumbers.add(1);
                index = ticketNumbers.size()-1;
                concertsList.add(concert);
                for (int i=0; i<quantity; i++){
                    tickets.add(new Ticket(ticketNumbers.get(index), concert));
                    ticketNumbers.set(index, ticketNumbers.get(index)+1);
                }
            }
            else {
                for (int i=0; i<quantity; i++){
                    tickets.add(new Ticket(ticketNumbers.get(index), concert));
                    ticketNumbers.set(index, ticketNumbers.get(index)+1);
                }
            }
        }

        return tickets;
    }
}
