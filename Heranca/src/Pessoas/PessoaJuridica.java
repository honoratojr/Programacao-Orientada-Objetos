package Pessoas;

import Superclasse.Pessoa;

public class PessoaJuridica extends Pessoa {

    private long cnpjoto;

    public PessoaJuridica() {}


    public PessoaJuridica(String nome, long cnpjoto) {
        super(nome);
        this.cnpjoto = cnpjoto;
    }


    public long getCnpjoto() {
        return cnpjoto;
    }


    public void setCnpjoto(long cnpjoto) {
        this.cnpjoto = cnpjoto;
    }


    @Override
    public String toString() {
        return super.toString() + " CNPJ: " + cnpjoto;
    }
    
    
}
