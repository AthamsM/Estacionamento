
package estacionamento;

import java.util.ArrayList;

public class Estacionamento {
    String nome;
    String endereco;
    ArrayList<Piso> piso;
    
    public Estacionamento(String name, String end){
        nome= name;
        endereco= end;
    }
    
    public void adicionarPiso(Piso x){
        piso.add(x);
    }
    public void removerPiso(Piso x){
        piso.remove(x);
    }
    public Integer quantidadePiso(){
        return piso.size();
    }
    public Piso getPiso(int posicao){
        return piso.get(posicao);
    }
    
}
