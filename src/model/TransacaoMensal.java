/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author brandoon
 */
public class TransacaoMensal extends Transacao {

    private int mes;

    public TransacaoMensal(
            String descricao,
            double valor,
            boolean ehReceita,
            int mes) {

        super(descricao, valor, ehReceita);
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
