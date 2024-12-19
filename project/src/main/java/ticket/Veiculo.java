
package ticket;

public class Veiculo {
    String veiculo;
    
    public Veiculo(int codigo){
      tipoVeiculo(codigo);
                
    }
    
    public void tipoVeiculo(int x){
        if(x == 1){
            veiculo = "caminhao";
        }else if(x== 2){
            veiculo = "carro";
        }else if(x== 3){
            veiculo = "van";
        }else if(x== 4){
            veiculo = "eletrico";
        }else if(x== 5){
            veiculo = "moto";
        }
    } 
   
    public String toString(){
        return "seu veiculo é "+veiculo;
        
    }

    public String getVeiculos() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    
}
