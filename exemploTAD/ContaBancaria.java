/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.exemploTAD;

/**
 *
 * @author Suldine brabo
 */
public abstract class ContaBancaria {

    private int saldo;
    public String nome;
    

    public int saque(int valor) {
        if(valor<=saldo){
        saldo -= valor;
        }else{
        System.out.println(nome+"Você está sem saldo");
        }
        return saldo;        
    }
    public int deposito(int valor) {        
        saldo += valor;       
        return saldo;        
    }
    
    public void saldo(){
    System.out.println("Seu saldo é: "+saldo);       
    }
    

    
    
    
}
