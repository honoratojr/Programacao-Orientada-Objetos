package com.bandeira.lucas.model;

import com.bandeira.lucas.Situacao.Situacao;

public class Maquina {
    private double saldo;
    private Situacao situacao;
    private static final double PRECO = 3.00;


    public void inserirMoeda(double valor, Situacao situacao) {
        this.saldo += valor;
        this.situacao = situacao;
        if (this.saldo >= PRECO) {
            this.saldo -= PRECO;
        }
    }

    public void solicitarCafe() {
        if (this.saldo >= PRECO) {
            this.saldo -= PRECO;
        }

    }

    public Estado verificarSituacao() {
        return situacao.verificarEstado();
    }

    public void cancelar() {
        this.saldo = 0;
    }

    public void pagar() {
        situacao.Pagar(this);
    }

    public void creditoInsuficiente() {
        situacao.creditoInsuficiente(this);
    }

    public void creditoSuficiente() {
        situacao.creditoSuficiente(this);
    }


    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
