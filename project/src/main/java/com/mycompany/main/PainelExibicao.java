
package com.mycompany.main;

import estacionamento.Piso;
import estacionamento.Vaga;
import estacionamento.VagaGrande;
import estacionamento.VagaMoto;
import estacionamento.VagaPequeno;
import java.util.ArrayList;

public class PainelExibicao {
    
    private ArrayList<Piso> piso;
    public PainelExibicao(ArrayList<Piso> piso){
        this.piso = piso;
    }
    public void tela(){
        for(Piso piso : this.piso){
            System.out.println("PISO [ "+ this.piso.indexOf(piso) +" ]");
            int qntPequeno = 0;
            int qntGrande = 0;
            int qntMoto = 0;
            int qntEletrico = 0;
            for(Vaga vaga : piso.getVaga()){
                if (vaga instanceof VagaGrande){
                    if(vaga.isOcupado() == false){
                      qntGrande++;

                    }
                }
                else if (vaga instanceof VagaPequeno){
                    if(vaga.isOcupado() == false){
                      qntPequeno++;

                    }
                }
                else if (vaga instanceof VagaMoto){
                    if(vaga.isOcupado() == false){
                      qntMoto++;

                    }
                }
                else {
                    if(vaga.isOcupado() == false){
                      qntEletrico++;

                    }
                }
            }
            System.out.println("GRANDES [ "+ qntGrande +" ]");            
            System.out.println("PEQUENO [ "+ qntPequeno +" ]");
            System.out.println("ELETRICO [ "+ qntEletrico +" ]");
            System.out.println("MOTO [ "+ qntMoto +" ]");
        }
    }
}
