
package estacionamento;

import java.util.ArrayList;
import java.util.Scanner;
import ticket.Ticket;

public abstract class Vaga{
    
    private  Scanner scan= new Scanner(System.in);
    private ArrayList<Integer> vaga;
    private Piso piso;
    private Ticket ticket = null;
    private boolean ocupado;
    
    
///////////////////TICKET//////////////////
    public int getTicketNum() {
        System.out.println(ticket.getTicket());
        return ticket.getTicket();
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}
