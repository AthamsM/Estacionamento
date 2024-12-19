
package estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Piso extends Vaga{
    
    private  Scanner scan= new Scanner(System.in);
    private ArrayList<Vaga> vaga;
    private ArrayList<Integer> piso;
    private Estacionamento estacionamento;

    public static int qtdPisoTotal= 0;
    private int numeroPiso;
    
    public Piso(){
        int qntVaga;
        this.vaga= new ArrayList<>();
        System.out.print("informe quantidade vaga de grande: ");
        qntVaga = scan.nextInt();
        for(int c=1; c<= qntVaga; c++){
            adicionarVaga(new VagaGrande());
        }
        System.out.print("informe quantidade vaga de pequeno: ");
        qntVaga = scan.nextInt();
        for(int c=1; c<= qntVaga; c++){
            adicionarVaga(new VagaPequeno());
        }
        System.out.print("informe quantidade vaga de eletrico: ");
        qntVaga = scan.nextInt();
        for(int c=1; c<= qntVaga; c++){
            adicionarVaga(new VagaEletrico());
        }
        System.out.print("informe quantidade vaga de moto: ");
        qntVaga = scan.nextInt();
        for(int c=1; c<= qntVaga; c++){
            adicionarVaga(new VagaMoto());
        }
        System.out.print("BLZ ");
        numeroPiso= qtdPisoTotal;
        qtdPisoTotal++;
    }
    
    public Integer quantidadePiso(){
        return piso.size();
    }
     
    /////////////////VAGA/////////////////
    public void adicionarVaga(Vaga x){
        vaga.add(x);
    }
    public void removerVaga(Vaga x){
        vaga.remove(x);
    }
    public int qtdVaga(){
        return vaga.size();
    }
    public Vaga getVaga(int posicao){
        return vaga.get(posicao);
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public ArrayList<Vaga> getVaga() {
        return this.vaga;
    }
    
    
}
