/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
import utils.Formatador;
/**
 *
 * @author brandoon
 */
public class Transacao {
    private String descricao;
    private double valor;
    private boolean ehReceita;
    private LocalDate data;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean isEhReceita() {
    return ehReceita;
    }

    public void setEhReceita(boolean ehReceita) {
        this.ehReceita = ehReceita;
    }
    
   public Transacao(String descricao, double valor, boolean ehReceita) {
    this.descricao = descricao;
    this.valor = valor;
    this.ehReceita = ehReceita;
    this.data = LocalDate.now();
    }
    @Override
public String toString() {
    return "Data: " + data +
           " | Tipo: " + (ehReceita ? "Receita" : "Despesa") +
           " | Descrição: " + descricao +
           " | Valor: " +  Formatador.formatarMoeda(valor);
    }
}
