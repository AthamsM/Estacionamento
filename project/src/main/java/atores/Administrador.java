
package atores;


import estacionamento.Piso;
import estacionamento.Vaga;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador extends Conta{
    
    private ArrayList<Funcionario> funcionario;
    private ArrayList<Piso> piso;
    private ArrayList<Vaga> vaga;
    private Scanner scan= new Scanner(System.in);
    private static Administrador instance;
    
    public Administrador(ArrayList<Funcionario> funcionario, ArrayList<Piso> piso ){ // recebe os objetos instaciados
        this.piso=piso;
        this.funcionario= funcionario;
        adcionarFuncionario();
        
        
    }
    
    public static Administrador getInstance(ArrayList<Funcionario> funcionario, ArrayList<Piso> piso ){
        //exista apenas um administrador, que tem contre de (funcionario e piso)
        if(instance== null){
            instance = new Administrador(funcionario, piso);
        }
        return instance;
    }
    
    public void gerenciar(){
        System.out.println("1- modificar atendente \n2- modifcar piso \n3- modificar vaga ");
        int codigo= scan.nextInt();
        
        switch(codigo){
            case 1: 
                modicarAtendente();
                break;
            case 2: 
                modicarPiso();
                break;
            case 3: 
                modicarVaga();
                break;             
        }  
    }
     ///////////////////ATENDENTE//////////////////
    public void modicarAtendente(){
        System.out.println("1- adicionar atendente \n2- remove atendente ");
        int codigo= scan.nextInt();
        
        switch(codigo){
            case 1: adcionarFuncionario();
                break;
            case 2: removerFuncionario();
                break;            
        }
    }
    public void adcionarFuncionario(){
        System.out.print("digite nome do funcionario: ");
        String nome= scan.next();
        Funcionario fun = new Funcionario(nome, getPiso());
        boolean verif= funcionario.add(fun);
        if(verif == true){
            System.out.println("funcionario adicionado ");
        }else{
            System.out.println("funcionario nao foi adicionado ");
        }
    }
    public void removerFuncionario(){
        System.out.println("digite nome do funcionario que deseja remove: ");
        String nome= scan.next();
        for(Funcionario funcionario : this.funcionario){
            if(funcionario.getNome().equals(nome)){
               this.funcionario.remove(funcionario); 
               System.out.println("funcionario removido ");
               return;
            }
        }
    }
     ///////////////////PISO//////////////////
    public void modicarPiso(){
        System.out.println("1- adicionar piso \n2- remove piso ");
        int codigo= scan.nextInt();
        
        switch(codigo){
            case 1: 
                adicionarPiso();
                break;
            case 2: 
                removerPiso();
                break;            
        }
    }
    public void adicionarPiso(){
        
        Piso piso= new Piso();
        boolean verif= this.piso.add(piso);
        if(verif == true){
            System.out.println("piso adicionado ");
            System.out.println("quantidade de pis: " + this.piso.size());
        }else{
            System.out.println("piso nao foi adicionado ");
        }
    }
    public void removerPiso(){
        System.out.println("digite piso remove: ");
        int numero= scan.nextInt();
        for(Piso piso : this.piso){
            if(piso.getNumeroPiso()== numero){
               this.piso.remove(piso); 
               System.out.println("piso removido ");
               return;
            }
        }
    }
     ///////////////////VAGA//////////////////
    public void modicarVaga(){
        System.out.println("1- Modificar vaga");
        int codigo= scan.nextInt();
        
        switch(codigo){
            case 1: 
                adicionarVaga();
                break;        
        }
    }
    public void adicionarVaga(){
        System.out.println("qual piso deseja modifcar a vaga? ");
        int numero= scan.nextInt();
        for(Piso piso : this.piso){
            if(piso.getNumeroPiso() == numero){
                System.out.println("chegou aq");
                this.piso.remove(numero);
                adicionarPiso();
                return;
            }
        } 
    }

    public ArrayList<Piso> getPiso() {
        return piso;
    }

    public Funcionario getFuncionario() {
        return funcionario.get(0);
    }
    
  

}
