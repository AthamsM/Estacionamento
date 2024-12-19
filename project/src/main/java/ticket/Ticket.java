
package ticket;

import java.util.Random;

public class Ticket {
    
    private Random gerador= new Random();
    private Integer ticket;
    
    public Ticket(){
        this.ticket = gerador.nextInt(100);
        System.out.println("Seu ticket: "+ ticket);
    }
    
    public int getTicket() {
        return this.ticket;
    }
    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }
    
}
