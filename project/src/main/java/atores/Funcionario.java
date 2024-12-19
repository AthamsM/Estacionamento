
package atores;

import com.mycompany.main.Pagamento;
import estacionamento.Piso;
import estacionamento.Vaga;
import estacionamento.VagaEletrico;
import estacionamento.VagaGrande;
import estacionamento.VagaMoto;
import estacionamento.VagaPequeno;
import java.util.ArrayList;
import java.util.Scanner;
import ticket.Ticket;
import ticket.Veiculo;

public class Funcionario extends Conta{
    
    private ArrayList<Ticket> tk= new ArrayList<>();
    private Scanner scan= new Scanner(System.in);
    private int codigo;
    private Administrador adm;
    private ArrayList<Piso> piso;

    public Funcionario(String nome,ArrayList<Piso> piso){
        this.nome= nome;
        this.piso= piso;
    }

    
    public void tabelaAtendimento(){
        
        System.out.println("1-Estacionar \n2-Pagar ");
        codigo = scan.nextInt();
        switch(codigo){
            case 1: 
                estacionar(); 
                break;
            case 2: 
                pagar();
                break;
        }

    }
    
    public void estacionar(){
        System.out.println("Digite o piso: ");
        int pisoIndex = scan.nextInt();
        System.out.println("Qual o seu veiculo? ");
        System.out.println("\n[ 1 ] Caminhão\n[ 2 ] Carro\n[ 3 ] Van\n[ 4 ] Eletrico\n[ 5 ] Moto");     
        Veiculo tipoVeiculo= new Veiculo(scan.nextInt());
       
        switch(tipoVeiculo.getVeiculos()){
            case "caminhao": 
                for(Vaga vaga : this.piso.get(pisoIndex).getVaga()){
                    if (vaga instanceof VagaGrande){
                        vaga.setOcupado(true);
                        vaga.setTicket(new Ticket());  
                        return;
                    }
                }
            break;
            case "carro": 
                for(Vaga vaga : this.piso.get(pisoIndex).getVaga()){
                    if (vaga instanceof VagaPequeno){
                        vaga.setOcupado(true);
                        vaga.setTicket(new Ticket());  
                        return;
                    }
                }
            break;
            case "van": 
                for(Vaga vaga : this.piso.get(pisoIndex).getVaga()){
                    if (vaga instanceof VagaPequeno){
                        vaga.setOcupado(true);
                        vaga.setTicket(new Ticket());   
                        return;
                    }
                }
            break;
            case "eletrico": 
                for(Vaga vaga : this.piso.get(pisoIndex).getVaga()){
                    if (vaga instanceof VagaEletrico){
                        vaga.setOcupado(true);
                        vaga.setTicket(new Ticket());
                        return;
                    }
                }
            break;
            case "moto": 
                for(Vaga vaga : this.piso.get(pisoIndex).getVaga()){
                    if (vaga instanceof VagaMoto){
                        vaga.setOcupado(true);
                        vaga.setTicket(new Ticket());  
                        return;
                    }
                }
            break;
        }
    } 
    
    public void pagar(){
        
        Pagamento paga= new Pagamento(this.piso); 
          
    }
}
