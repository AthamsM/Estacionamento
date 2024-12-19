
package com.mycompany.main;

import atores.Administrador;
import atores.Funcionario;
import estacionamento.Estacionamento;
import estacionamento.Piso;
import estacionamento.Vaga;
import estacionamento.VagaGrande;
import estacionamento.VagaMoto;
import estacionamento.VagaPequeno;
import java.util.ArrayList;
import java.util.Scanner;

public class Controler {
    
    private ArrayList<Funcionario> funcionario= new ArrayList<>();
    private ArrayList<Piso> piso= new ArrayList<>(); 
    private ArrayList<Vaga> vaga= new ArrayList<>(); 
    private Administrador adm= Administrador.getInstance(funcionario, piso);
    private PainelExibicao tela= new PainelExibicao(this.piso);
    private Estacionamento etacionamento= new Estacionamento("univas", "shopping");
    
    public void controle(){
        tela();
        System.out.println("1-Cliente \n2-Administrador");
        Scanner scan= new Scanner(System.in);
        int codigo= scan.nextInt();     
        
        this.piso=adm.getPiso();
        switch(codigo){
            case 1: 
                adm.getFuncionario().tabelaAtendimento();
                controle();
                break;  
            case 2: 
                adm.gerenciar();
                controle();
                break;
            case 3: 
                System.out.println("Encerrando programa");
        }
        
        
    }
    
    public void tela(){
        tela.tela();
    }

}
