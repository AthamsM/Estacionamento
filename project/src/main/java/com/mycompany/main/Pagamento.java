
package com.mycompany.main;

import estacionamento.Piso;
import estacionamento.Vaga;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pagamento implements MetodosPagamento{
    
    private int tipo;
    private int valor;
    private Scanner scan= new Scanner(System.in);
    private Random gerar= new Random();
    private ArrayList<Piso> piso;
    
   public Pagamento(ArrayList<Piso> pisos){
       this.piso = pisos;    
       System.out.println("[1]- dinheiro\n[2]- credito");
       tipo= scan.nextInt();
       switch(tipo){
            case 1: 
                
                pagardinheiro(gerar.nextInt(3));
                break;
            case 2: 
                pagarCredito(gerar.nextInt(3));
                break;
        }
   }
   @Override
   public void pagardinheiro(int numero){
       
        System.out.println("Qual o numero do seu ticket? ");
        int ticket= scan.nextInt();
        if(numero== 0){
            System.out.println("valor a ser pago é de 5$");
            valor= scan.nextInt();
            if(valor== 5){
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){ 
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO");  
                            return;
                        }
                    }
                }
                
            }else if(valor >5){
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){ 
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO, seu troco é de: "+(valor-5)); 
                            return;
                        }
                    }
                }
            }else{
                 System.out.println("VALOR INSUFICIENTE"); 
                 pagardinheiro(0);
            }
        }else if(numero== 1){
            System.out.println("valor a ser pago é de 7$");
            valor= scan.nextInt();
            if(valor== 7){
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO");
                            return;
                        }
                    }
                }
                 
            }else if(valor >7){
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){ 
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO, seu troco é de: "+(valor-7)); 
                            return;
                        }
                    }
                }
            }else{
                 System.out.println("VALOR INSUFICIENTE"); 
                 pagardinheiro(1);
            }
        } else if(numero == 2){
            System.out.println("valor a ser pago é de 10$");
            valor= scan.nextInt();
            if(valor== 10){
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO"); 
                            return;
                        }
                    }
                }
                
            }else if(valor >10){
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO, seu troco é de: "+(valor-10));                             
                            return;
                        }
                    }
                }

            }else{
                 System.out.println("VALOR INSUFICIENTE"); 
                 pagardinheiro(2);
            }
        }
   }
   @Override
   public void pagarCredito(int numero){
       System.out.println("Qual o numero do seu ticket? ");
       int ticket= scan.nextInt();
       System.out.println("digite o numero do cartao: ");
       String credito= scan.next();
       int senha;
       if(credito.length() !=5){
           System.out.println("Cartao ivalido, por favor digite novamente");
           pagarCredito(numero);
       }else{
           if(numero == 0){
                System.out.println("valor a ser pago é de 5$\ndigite sua senha: ");
                senha= scan.nextInt();
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO"); 
                            return;
                        }
                    }
                } 
            }else if(numero == 1){
                System.out.println("valor a ser pago é de 7$\ndigite sua senha: ");
                senha= scan.nextInt();
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO"); 
                            return;
                        }
                    }
                }
                
           }else if(numero == 2){
                System.out.println("valor a ser pago é de 10$\ndigite sua senha: ");
                senha= scan.nextInt();
                for(Piso piso : this.piso){
                    for(Vaga vaga : piso.getVaga()){
                        if (vaga.getTicketNum() == ticket){
                            vaga.setOcupado(false);
                            System.out.println("vaga encontrada");
                            System.out.println("PAGO"); 
                            return;
                        }
                    }
                }
                
           }
       }
       
       
   }
}
