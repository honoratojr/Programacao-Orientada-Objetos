package Pessoas;

import Superclasse.Pessoa;

public class PessoaFisica extends Pessoa {

    private long cpf;
    
    public PessoaFisica () {}

    public PessoaFisica(String nome, long cpf) {
        super(nome);/*Esse cara aqui, chama o CONSTRUTOR da superclasse, onde foi criado o parâmetro */
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " CPF: " + cpf;
    }
    
    
}
