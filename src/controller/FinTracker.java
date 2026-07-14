/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Transacao;
import java.util.ArrayList;

/**
 *
 * @author brandoon
 */
public class FinTracker {
    private ArrayList<Transacao> transacoes = new ArrayList<>();
    
    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }
    
    public void listarTransacoes(){
           if (transacoes.isEmpty()) {
        System.out.println("Nenhuma transação cadastrada.");
        return;
    }

    for (int i = 0; i < transacoes.size(); i++) {
        System.out.println("[" + i + "] " + transacoes.get(i));
        }
    }
    
    public double calcularSaldoTotal(){
    double saldo = 0;
    
    for (Transacao transacao:transacoes){
            if (transacao.isEhReceita()) {
                saldo += transacao.getValor();
            } else {
                saldo -= transacao.getValor();
            }
        }
            return saldo;
    }
    
    public boolean removerTransacao(int indice){
    if (indice >= 0 && indice < transacoes.size()){
        transacoes.remove(indice);
        return true;
    }
    return false;
    }
}
